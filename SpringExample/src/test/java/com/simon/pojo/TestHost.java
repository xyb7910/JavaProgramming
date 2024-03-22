package com.simon.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHost {
    @Test
    public void testHost() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Host host = (Host) context.getBean("host");
        host.getCat().shout();
        host.getDog().shout();
    }


}
