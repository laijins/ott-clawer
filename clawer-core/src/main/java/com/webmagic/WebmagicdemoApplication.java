package com.webmagic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)

public class WebmagicdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebmagicdemoApplication.class, args);
    }

}
