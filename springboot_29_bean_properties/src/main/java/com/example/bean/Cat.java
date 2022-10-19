package com.example.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
@Component("tom")
@Data
public class Cat {

    private String name;

    private Integer age;
}
