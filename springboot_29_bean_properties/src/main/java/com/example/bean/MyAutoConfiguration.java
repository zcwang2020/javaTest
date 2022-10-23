package com.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author wzc
 * @Date 2022/10/18
 */
@EnableConfigurationProperties(MyProperties.class)
@ConditionalOnClass(name = "com.alibaba.druid.pool.DruidDataSource")
public class MyAutoConfiguration implements ApplicationContextAware {

    private Cat cat;

    private Mouse mouse;

    private MyProperties myProperties;

    public MyAutoConfiguration(MyProperties myProperties) {
        this.myProperties = myProperties;
        this.cat = new Cat();
        cat.setName(myProperties.getCat().getName());
        cat.setAge(myProperties.getCat().getAge());
        this.mouse = new Mouse();
        mouse.setName(myProperties.getMouse().getName());
        mouse.setAge(myProperties.getMouse().getAge());
    }

    public void play() {
        System.out
            .println(cat.getAge() + "岁的" + cat.getName() + "和" + mouse.getAge() + "岁的" + mouse.getName() + "打起来了");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
