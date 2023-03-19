package com.example.dockerjava.mapper;

import org.apache.ibatis.annotations.Param;

import com.example.dockerjava.entity.User;

import tk.mybatis.mapper.common.Mapper;


public interface UserMapper extends Mapper<User> {

    User selectByName(@Param("username") String username);
}