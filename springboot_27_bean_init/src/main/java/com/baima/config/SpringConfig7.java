package com.baima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.baima.bean.MyImportSelector;
import com.baima.bean.MyRegistrar;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
@Import(MyRegistrar.class)
public class SpringConfig7 {
}
