package com.simon.mapper;

import com.simon.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    // 增加一个blog
    int addBlog(Blog blog);
    // 根据作者名字和博客名字来查询博客！如果作者名字为空，那么只根据博客名字查询，反之，则根据作者名来查询
    List<Blog> queryBlogIf(Map map);
    // 根据作者名字和博客名字来更新博客!如果作者名字为空，那么只根据博客名字查询，反之，则根据作者名来查询
    int updateBlog(Map map);
    //不想用到所有的查询条件，只想选择其中的一个，查询条件有一个满足即可，使用 choose 标签
    List<Blog> queryBlogChoose(Map map);
    // foreach 标签，可以循环遍历集合，并且可以使用下标
    List<Blog> queryBlogForeach(Map map);
}
