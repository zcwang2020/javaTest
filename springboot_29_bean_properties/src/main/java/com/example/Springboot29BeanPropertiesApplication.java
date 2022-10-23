package com.example;

import com.example.bean.Cat;
import com.example.bean.MyAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
// @Import(MyAutoConfiguration.class)
public class Springboot29BeanPropertiesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot29BeanPropertiesApplication.class, args);
        MyAutoConfiguration bean = run.getBean(MyAutoConfiguration.class);
        bean.play();
        /*String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }*/
        Cat cat = run.getBean(Cat.class);
        System.out.println("cat = " + cat);
    }

}
