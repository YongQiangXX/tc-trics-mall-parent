package com.manage.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TricsIdcEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(TricsIdcEurekaApplication.class, args);
    }
}
