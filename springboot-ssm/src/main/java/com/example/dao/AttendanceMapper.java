/**
 * @(#)AttendanceMapper.java, 2022/10/27.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.AttendanceInfo;


/**
 * @Author zcwang
 * @Date 2022/10/27
 */
@Mapper
public interface AttendanceMapper extends BaseMapper<AttendanceInfo> {

}