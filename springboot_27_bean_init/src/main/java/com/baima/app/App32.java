package com.baima.app;

import java.sql.SQLException;

import com.baima.config.SpringConfig32;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.baima.config.SpringConfig3;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
public class App32 {
    public static void main(String[] args) throws SQLException {
        // spring 扫描加载bean，使用配置类+@ComponentScan注解，替代xml配置，需要加入bean的类添加@Component注解
        // springConfig3也会一并注入spring容器中
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig32.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
        System.out.println("------------------");
    }
}
