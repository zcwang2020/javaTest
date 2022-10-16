package com.baima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baima.bean.Cat;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
// @ComponentScan({"com.baima.bean","com.baima.config"})
// @ImportResource("applicationContext1.xml")
//     proxyBeanMethods:是否是代理对象,代理对象从容器中取加载过的对象
@Configuration(proxyBeanMethods = false)
public class SpringConfig33 {

    @Bean
    public Cat cat() {
        return new Cat();
    }
}
