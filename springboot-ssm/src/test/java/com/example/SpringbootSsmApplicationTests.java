package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.BookMapper;

@SpringBootTest
class SpringbootSsmApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void contextLoads() {
        System.out.println("bookService.getAll() = " + bookMapper.selectList(null));
    }

}
