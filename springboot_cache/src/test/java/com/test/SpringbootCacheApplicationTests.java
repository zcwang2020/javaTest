package com.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.service.BookService;

@SpringBootTest
class SpringbootCacheApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    void contextLoads() {
        System.out.println("bookService.getAll() = " + bookService.getAll());
    }

}
