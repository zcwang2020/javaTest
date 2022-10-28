package com.test.Mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.pojo.Book;

/**
 * @Author wzc
 * @Date 2022/10/9
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

    /*@Select("select * from tbl_book")
    List<Book> selectAll();*/
}
