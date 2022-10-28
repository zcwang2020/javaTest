/**
 * @(#)BookMapper.java, 2022/10/24.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Book;

/**
 * @Author zcwang
 * @Date 2022/10/24
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}