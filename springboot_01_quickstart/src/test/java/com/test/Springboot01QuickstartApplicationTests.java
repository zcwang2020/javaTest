package com.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01QuickstartApplicationTests {

    @Value("${risk.url}")
    public String riskUrl;

    @Autowired
    private ServerConfig serverConfig;

    @Test
    void contextLoads() {
        System.out.println(riskUrl);
        System.out.println(serverConfig);
    }

}
