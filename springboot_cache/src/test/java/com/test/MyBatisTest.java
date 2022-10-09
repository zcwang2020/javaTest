package com.test;

import com.test.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author wzc
 * @Date 2022/10/9
 */
@SpringBootTest
public class MyBatisTest {

    @Autowired
    private BookService bookService;

    @Test
    void getAll() {
        System.out.println("bookService.getAll() = " + bookService.getAll());
    }

    @Test
    void getById() {
        System.out.println("bookService.getAll() = " + bookService.getById(1));
    }
}
