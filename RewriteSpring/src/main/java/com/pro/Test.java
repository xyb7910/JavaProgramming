package com.pro;

import com.pro.service.UserService;
import com.spring.SimonApplicationContext;

public class Test {

    public static void main(String[] args){
        SimonApplicationContext simonApplicationContext = new SimonApplicationContext(AppConfig.class);
        UserService userService = (UserService)simonApplicationContext.getBean("userService");
        userService.test();
    }
}
