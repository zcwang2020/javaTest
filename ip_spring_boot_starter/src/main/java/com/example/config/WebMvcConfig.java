/**
 * @(#)WebMvcConfig.java, 2022/11/1.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author zcwang
 * @Date 2022/11/1
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private IpCountInterceptor ipCountInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(ipCountInterceptor).addPathPatterns("/**");
    }
}