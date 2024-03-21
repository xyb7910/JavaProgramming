package com.simon.mapper;

import com.simon.pojo.User;
import com.simon.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void selectAll() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper  userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void selectById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper  userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectById(2);
        User user2 = userMapper.selectById(2);
        System.out.println(user);
        System.out.println(user2);
        sqlSession.close();
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper  userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(8,"lili", "897666");
        userMapper.insertUser(user);
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper  userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.selectById(1);
        user.setName("simon");
        user.setPwd("123456");
        userMapper.updateUser(user);
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper  userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteUser(1);
        sqlSession.close();
    }
}
