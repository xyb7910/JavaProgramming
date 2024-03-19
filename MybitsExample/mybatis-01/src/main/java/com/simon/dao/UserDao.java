package com.simon.dao;

import com.simon.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao {
    // 查询全部用户
    List<User> getUserList();

    // 根据id查询用户
    User getUserById(@Param("id") int id);

    // 根据名字查询用户
    User getUserByName(@Param("name") String name);

    // 根据用户名和密码查询用户 --- 使用直接在接口上传递参数的方式
    User getUserByNameAndPassword(@Param("name") String name, @Param("password") String password);

    // 根据用户名和密码查询用户 --- 使用万能map传递参数的方式
    User getUserByNameAndPassword2(Map<String, Object> map);

    /*==================================================*/

    // 添加用户
    int addUser(User user);

    /*==================================================*/

    //修改用户信息
    int updateUser(User user);


    /*==================================================*/

    // 删除用户
    int deleteUser(@Param("id") int id);

    /*==================================================*/

    // 模糊查询
    List<User> getUserByNameLike(@Param("name") String name);


    /*==================================================*/
    // 分页查询
    List<User> getUserByPage1(Map<String, Integer> map);

    List<User> getUserByPage2(@Param("startIndex") int start, @Param("pageSize") int pageSize);

    List<User> getUserByRowBounds();
}
