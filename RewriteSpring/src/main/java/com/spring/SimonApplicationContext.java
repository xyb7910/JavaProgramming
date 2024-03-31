package com.spring;

public class SimonApplicationContext {
    private Class configClass;

    public SimonApplicationContext(Class configClass) {
        this.configClass = configClass;
    }

    public Object getBean(String beanName) {
        return null;
    }
}
