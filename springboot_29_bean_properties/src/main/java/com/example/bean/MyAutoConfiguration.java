package com.example.bean;

import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Author wzc
 * @Date 2022/10/18
 */
@EnableConfigurationProperties(MyProperties.class)
public class MyAutoConfiguration {

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
}
