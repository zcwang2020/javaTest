package com.baima.config;

import org.springframework.context.annotation.Import;

import com.baima.bean.MyPostProcessor;
import com.baima.service.impl.BookServiceImpl;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
@Import({BookServiceImpl.class, MyPostProcessor.class})
public class SpringConfig8 {
}
