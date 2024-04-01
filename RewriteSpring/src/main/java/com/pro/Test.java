package com.pro;

import com.spring.SimonApplicationContext;

public class Test {

    public static void main(String[] args){
        SimonApplicationContext simonApplicationContext = new SimonApplicationContext(AppConfig.class);
        System.out.println(simonApplicationContext.getBean("userService"));
        System.out.println(simonApplicationContext.getBean("userService"));
        System.out.println(simonApplicationContext.getBean("userService"));

    }

}
