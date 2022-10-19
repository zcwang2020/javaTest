package com.example.bean;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
@Service("jerry")
@Data
public class Mouse {

    private String name;

    private Integer age;
}
