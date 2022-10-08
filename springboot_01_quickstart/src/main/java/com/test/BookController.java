package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wzc
 * @Date 2022/10/8
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/getAll")
    public String getAll() {
        System.out.println("get all books");
        return "get all books";
    }
}
