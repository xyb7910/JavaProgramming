# 手写实现 Spring 相关逻辑
# 步骤
1. [项目的准备工作](https://github.com/xyb7910/JavaProgramming/commit/957f7328168dc2da1780faecaad8b3a16d189b54)
2. [启动，扫描逻辑和创建Bean](https://github.com/xyb7910/JavaProgramming/commit/ce35629eb2f7added8dae1ff92c7cfb29ccc74b2)
    - 扫描：使用路径对class文件进行扫描和切割，符合加载类的规范
    - 解析：通过注解类型判断并设置类为原型还是单例，如果是单例，使用作用域（scope）进行判断
    - 创建：获取类的作用域（scope）来确定创建bean的类型（原型 or 单例）
3. 

