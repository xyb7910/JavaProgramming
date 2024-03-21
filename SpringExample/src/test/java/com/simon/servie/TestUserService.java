package com.simon.servie;

import com.simon.dao.UserDaoImpl;
import com.simon.dao.UserDaoOracleImpl;
import com.simon.pojo.Hello;
import com.simon.pojo.User;
import com.simon.pojo.UserT;
import com.simon.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
    @Test
    public void testGetUser() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();

        //get oracle
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }

    @Test
    public void testSayHello() {
        // 解析xml文件，创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 获取对象
        Hello hello = (Hello)context.getBean("hello");
        hello.sayHello();
    }

    @Test
    public void testDB() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl)context.getBean("ServiceImpl");
        userService.getUser();
    }

    @Test
    public void testUserT() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user =(User)context.getBean("user");
        user.show();
    }

    @Test
    public void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT userT =(UserT)context.getBean("userT");
        userT.show();
    }
}
