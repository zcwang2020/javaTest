package com.baima.config;

import com.baima.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baima.bean.Cat;
import org.springframework.context.annotation.Import;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
@Import({Dog.class})
public class SpringConfig4 {

}
