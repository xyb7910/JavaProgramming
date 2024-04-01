package com.spring;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimonApplicationContext {
    private Class configClass;

    // 创建单例池，使用map
    private ConcurrentHashMap<String, Object> singleton_beans = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public SimonApplicationContext(Class configClass) {
        this.configClass = configClass;

        // 解析配置类
        // ComponentScan注解 ---> 扫描路径 ---> 扫描类 ---> 解析类
         scan(configClass);

         for (Map.Entry<String, BeanDefinition> entry : beanDefinitionMap.entrySet()) {
             String beanName = entry.getKey();
             BeanDefinition beanDefinition = entry.getValue();
             if ("singleton".equals(beanDefinition.getScope())) {
                Object bean = createBean(beanDefinition);
                singleton_beans.put(beanName, bean);
             }

         }

    }


    public Object createBean(BeanDefinition beanDefinition) {
        Class beanClass = beanDefinition.getClazz();
        try {
            Object instance  = beanClass.getDeclaredConstructor().newInstance();

            // 依赖注入
            for (Field fieldDefinition : beanClass.getDeclaredFields()) {
                if (fieldDefinition.isAnnotationPresent(Autowired.class)) {
                    Object fieldValue = getBean(fieldDefinition.getName());
                    fieldDefinition.setAccessible(true);
                    fieldDefinition.set(instance, fieldValue);
                }
            }

            return instance;
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }


    private void  scan(Class configClass) {
        ComponentScan componentScan = (ComponentScan) configClass.getDeclaredAnnotation(ComponentScan.class);
        String path = componentScan.value();
        path = path.replace(".", "/");


        // 扫描加了Component注解的类
        ClassLoader classLoader = SimonApplicationContext.class.getClassLoader();
        URL resource = classLoader.getResource(path);
        File file = new File(resource.getFile());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                String path_str = f.getAbsolutePath();
                if (path_str.endsWith(".class")) {
                    String className = path_str.substring(path_str.indexOf("com"), path_str.indexOf(".class"));
                    className = className.replace("/", ".");
                    System.out.println(className);

                    try {
                        Class<?> Clazz = classLoader.loadClass(className);
                        if (Clazz.isAnnotationPresent(Component.class)) {
                            // 表示当前类是一个bean
                            // 判断当前bean是否是单例还是原型 ===> beanDefinition
                            Component componentAnnotation = Clazz.getDeclaredAnnotation(Component.class);

                            BeanDefinition beanDefinition = new BeanDefinition();
                            beanDefinition.setClazz(Clazz);
                            String beanName = componentAnnotation.value();
                            if(Clazz.isAnnotationPresent(Scope.class)) {
                                Scope scopeAnnotation = Clazz.getDeclaredAnnotation(Scope.class);
                                beanDefinition.setScope(scopeAnnotation.value());
                            } else {
                                beanDefinition.setScope("singleton");
                            }
                            beanDefinitionMap.put(beanName, beanDefinition);
                        }
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }



            }
        }
    }

    public Object getBean(String beanName) {
        if (beanDefinitionMap.containsKey(beanName)) {
            BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
            if ("singleton".equals(beanDefinition.getScope())) {
                return singleton_beans.get(beanName);
            } else {
                // 创建一个原型bean
                return createBean(beanDefinition);
            }
        } else {
            throw new RuntimeException("没有找到对应的bean");
        }
    }
}
