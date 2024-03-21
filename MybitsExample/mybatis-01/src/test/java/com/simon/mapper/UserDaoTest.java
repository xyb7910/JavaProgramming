package com.simon.mapper;

import com.simon.mapper.UserDao;
import com.simon.pojo.User;
import com.simon.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {

    // 查询所有用户
    @Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        List<User> users = userMapper.getUserList();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    // 根据id查询用户
    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    // 根据姓名查询用户
    @Test
    public void getUserByName() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        User user = userMapper.getUserByName("simon");
        System.out.println(user);
        sqlSession.close();
    }

    // 根据用户名和密码查询用户 --- 使用直接在接口上传递参数的方式
    @Test
    public void getUserByNameAndPassword() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        User user = userMapper.getUserByNameAndPassword("simon","123456");
        System.out.println(user);
        sqlSession.close();
    }

    // 根据用户名和密码查询用户 --- 使用万能map传递参数的方式
    @Test
    public void getUserByNameAndPassword2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<>();
        map.put("name", "simon");
        map.put("password", "123456");
        User user = userMapper.getUserByNameAndPassword2(map);
        System.out.println(user);
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        User user = new User(5, "lily", "123321");
        if (userMapper.addUser(user) == 1) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        // 首先通过id查询到要修改的用户
        User user = userMapper.getUserById(2);
        // 修改用户的信息
        user.setName("Alice");
        user.setPwd("88888888");
        if (userMapper.updateUser(user) == 1) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        if (userMapper.deleteUser(3) == 1) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserByNameLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        List<User> users = userMapper.getUserByNameLike("A");
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByPage1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);

        int currentPage = 1;
        int sizePage = 2;
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", (currentPage - 1) * sizePage); // 开始索引的位置
        map.put("pageSize", sizePage); // 每张页面显示的记录数

        List<User> users = userMapper.getUserByPage1(map);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByPage2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);

        int startIndex = 1;
        int pageSize = 2;

        List<User> users = userMapper.getUserByPage2(startIndex, pageSize);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByRowBounds() {
        SqlSession session = MybatisUtils.getSqlSession();
        int  currentPage = 1;
        int  pageSize = 2;
        RowBounds roeBounds = new RowBounds((currentPage - 1) * pageSize, pageSize);
        List<User> users = session.selectList("com.simon.dao.UserDao.getUserByRowBounds",
                null,
                roeBounds);
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }
}
