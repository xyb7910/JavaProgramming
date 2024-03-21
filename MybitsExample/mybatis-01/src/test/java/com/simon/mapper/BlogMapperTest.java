package com.simon.mapper;

import com.simon.pojo.Blog;
import com.simon.utils.IdUtils;
import com.simon.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class BlogMapperTest {
    @Test
    public void AddInitBlog(){
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

    @Test
    public void UpdateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title","动态SQL");
        map.put("author","测试");
        map.put("id","b1e06cf5461d47d6aa24ab4f15094f39");

        mapper.updateBlog(map);
        sqlSession.close();
    }

    @Test
    public void QueryBlogByChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, Object> map = new HashMap<String, Object>();
        //map.put("title","微服务如此简单");
        map.put("author","狂神说");
        //map.put("views", 9999);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void QueryBlogByForeach() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        List<Integer> ids = new ArrayList<Integer>();

        ids.add(1);
        ids.add(2);
        ids.add(3);
        map.put("ids", ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
