package com.test.controller;

import com.test.pojo.Book;
import com.test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wzc
 * @Date 2022/10/8
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getAll")
    public String getAll() {
        System.out.println("get all books");
        return "get all books";
    }

    @GetMapping("/getById")
    public Book getById(@RequestParam Integer id) {
        return bookService.getById(id);
    }
}
