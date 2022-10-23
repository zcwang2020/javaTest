package com.example;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.BookMapper;

@SpringBootTest
class SpringbootMvcApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void contextLoads() {
        System.out.println("bookDao.getAll() = " + bookMapper.selectList(null));
    }

    @Test
    void selectPage() {
        IPage<Book> page = new Page<>();
        page.setCurrent(1);
        page.setSize(5);
        bookMapper.selectPage(page, null);
    }

}
