package com.baima.app;

import java.sql.SQLException;

import com.baima.bean.Cat;
import com.baima.bean.Mouse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.baima.config.SpringConfig4;

/**
 * @Author wzc
 * @Date 2022/10/16
 */
public class App5 {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig4.class);
        // 上下文容器对象已经初始化完毕后，手工加载bean
        ctx.registerBean("Eli", Cat.class);
        ctx.registerBean(Mouse.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
    }
}
