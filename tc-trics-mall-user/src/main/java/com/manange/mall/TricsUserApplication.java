package com.manange.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TricsUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(TricsUserApplication.class, args);
    }
}