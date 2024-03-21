package com.simon.mapper;

import com.simon.pojo.Book;
import org.junit.Test;


public class BookMapperTest {

    private BookMapper bookMapper;
    @Test
    public void selectAll() {
        Book book = bookMapper.selectById(1);
        System.out.println(book);
    }
}
