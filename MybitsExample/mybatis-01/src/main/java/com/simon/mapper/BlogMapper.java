package com.simon.mapper;

import com.simon.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    // 增加一个blog
    int addBlog(Blog blog);
    // 根据作者名字和博客名字来查询博客！如果作者名字为空，那么只根据博客名字查询，反之，则根据作者名来查询
    List<Blog> queryBlogIf(Map map);
}
