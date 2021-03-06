package com.example.studentdetailproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableDiscoveryClient

public class StudentdetailprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentdetailprojectApplication.class, args);
    }

}
