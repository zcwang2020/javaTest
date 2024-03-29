package com.example.dockerjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.dockerjava.mapper")

public class DockerJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerJavaApplication.class, args);
    }

}
