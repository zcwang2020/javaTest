package com.baima.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
public class App1 {
    public static void main(String[] args) {
        // spring bean加载,xml文件配置
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Object tom = ctx.getBean("tom");
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
    }
}
