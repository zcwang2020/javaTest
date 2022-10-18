package com.baima.app;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.baima.config.SpringConfig7;
import com.baima.config.SpringConfig8;
import com.baima.service.BookService;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
public class App8 {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig8.class);
        BookService bookService = ctx.getBean("bookService", BookService.class);
        bookService.check();
    }
}
