package com.example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @Author wzc
 * @Date 2022/10/18
 */
@Data
@ConfigurationProperties(prefix = "config")
public class MyProperties {

    private Cat cat;

    private Mouse mouse;
}
