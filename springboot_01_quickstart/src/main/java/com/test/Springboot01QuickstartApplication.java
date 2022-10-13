package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * @author wzc
 */
@SpringBootApplication
@EnableAdminServer
public class Springboot01QuickstartApplication {

    @Autowired
    private ServerConfig serverConfig;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot01QuickstartApplication.class, args);
        ServerConfig bean = run.getBean(ServerConfig.class);
        System.out.println(bean);
    }

}
