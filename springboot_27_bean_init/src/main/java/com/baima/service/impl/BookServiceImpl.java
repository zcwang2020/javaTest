package com.baima.service.impl;

import org.springframework.stereotype.Service;

import com.baima.service.BookService;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
@Service("bookService")
public class BookServiceImpl implements BookService {
    public void check() {
        System.out.println("book service 1.");
    }
}
