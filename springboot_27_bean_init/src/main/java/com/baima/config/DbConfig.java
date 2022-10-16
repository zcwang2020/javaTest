package com.baima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
@Configuration(proxyBeanMethods = false)
public class DbConfig {

    @Bean
    public DruidDataSource dataSource() {
        return new DruidDataSource();
    }
}
