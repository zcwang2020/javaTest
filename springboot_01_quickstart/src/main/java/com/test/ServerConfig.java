package com.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @Author wzc
 * @Date 2022/10/9
 */
@Component
@ConfigurationProperties(prefix = "a")
@Data
public class ServerConfig {

    private String name;

    private Integer age;
}
