package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author wzc
 */
@SpringBootApplication
public class Springboot01QuickstartApplication {

    @Autowired
    private ServerConfig serverConfig;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot01QuickstartApplication.class, args);
        ServerConfig bean = run.getBean(ServerConfig.class);
        System.out.println(bean);
    }

}
