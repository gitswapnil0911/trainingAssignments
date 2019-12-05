package com.training.config;

import com.training.beans.PaymentImpl;
import com.training.ifaces.Payment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
//Scan the com.training.advices , if any class with @component annotation is found register them as bean
@ComponentScan(basePackages = "com.training.advices")
public class AopConfig {

    @Bean
    public Payment payment() {
        return new PaymentImpl();

    }
}
