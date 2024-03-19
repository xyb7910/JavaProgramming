package com.simon.mapper;

import com.simon.pojo.Blog;
import com.simon.utils.IdUtils;
import com.simon.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class BlogMapperTest {
    @Test
    public void addInitBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        IdUtils idUtils = new IdUtils();
        Blog blog = new Blog();

        blog.setId(idUtils.genId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);
        blog.setId(idUtils.genId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);
        blog.setId(idUtils.genId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);
        blog.setId(idUtils.genId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);
        session.close();
    }

    @Test
    public void QueryBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<>();
        map.put("title","Mybatis如此简单");
        map.put("author","狂神说");
        List<Blog> blogs = mapper.queryBlogIf(map);
        System.out.println(blogs);
        sqlSession.close();
    }
}
