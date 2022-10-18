package com.baima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.baima.bean.MyImportSelector;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
@Configuration
@ComponentScan(basePackages = "com.baima")
@Import(MyImportSelector.class)
public class SpringConfig6 {
}
