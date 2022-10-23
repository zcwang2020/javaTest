package com.example.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bean.Book;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Author wzc
 * @Date 2022/10/9
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
