package com.pro;

import com.spring.SimonApplicationContext;

public class Test {
    SimonApplicationContext simonApplicationContext = new SimonApplicationContext(AppConfig.class);
    Object userService = simonApplicationContext.getBean("userService");
}
