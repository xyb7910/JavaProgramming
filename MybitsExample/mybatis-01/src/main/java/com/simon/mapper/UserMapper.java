package com.simon.mapper;

import com.simon.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    // 是用注解的方式 查询所有用户
    @Select("select * from user")
    public List<User> selectAll();

    @Select("select * from user where id = #{id}")
    public User selectById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{pwd})")
    public void insertUser(User user);

    @Update("update user set name=#{name},pwd=#{pwd} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{id}")
    int deleteUser(@Param("id") int id);
}
