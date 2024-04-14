package com.example.mybatis_plus_demo;

import com.example.mybatis_plus_demo.mapper.UserMapper;
import com.example.mybatis_plus_demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectTest() {
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void insertTest() {
        User user = new User();
        user.setName("test");
        user.setAge(18);
        user.setEmail("nnheo@example.com");
        Integer ok = userMapper.insert(user);
        if (ok > 0) {
            System.out.println("insert success");
        } else {
            System.out.println("insert fail");
        }
    }

    @Test
    public void saveTest() {
        User user = new User();
        user.setAge(8);
        user.setEmail("1502709024@qq.com");
        userMapper.updateById(user);
    }
}
