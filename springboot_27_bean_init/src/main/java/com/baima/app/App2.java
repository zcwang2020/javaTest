package com.baima.app;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
public class App2 {
    public static void main(String[] args) throws SQLException {
        // spring 扫描加载bean，需要加入bean的类添加@Component注解
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
        System.out.println("------------------");
        DruidDataSource bean1 = ctx.getBean(DruidDataSource.class);
        System.out.println(bean1.getName());
        DruidDataSource bean2 = ctx.getBean(DruidDataSource.class);
        System.out.println(bean2.getName());
        DruidDataSource bean3 = ctx.getBean(DruidDataSource.class);
        System.out.println(bean3.getName());
    }
}
