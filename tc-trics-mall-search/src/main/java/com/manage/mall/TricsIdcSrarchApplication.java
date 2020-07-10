package com.manage.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TricsIdcSrarchApplication {
    public static void main(String[] args) {
        SpringApplication.run(TricsIdcSrarchApplication.class, args);
    }
}