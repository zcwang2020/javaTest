package com.test.service.impl;

import com.test.Mapper.BookMapper;
import com.test.pojo.Book;
import com.test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wzc
 * @Date 2022/10/9
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAll() {
        return bookMapper.selectList(null);
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.selectById(id);
    }
}
