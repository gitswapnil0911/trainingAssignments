package com.example.demo.config;

import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

@Configuration
public class AppConfig {

    @Bean
    public RequestInterceptor basicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("india","india");
    }




}


