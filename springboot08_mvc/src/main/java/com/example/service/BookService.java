package com.example.service;


import com.example.bean.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    boolean update(Book book);

    /**
     * 按id删除
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    List<Book> getAll();
}
