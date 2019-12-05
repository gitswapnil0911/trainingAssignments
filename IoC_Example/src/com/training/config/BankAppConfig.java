package com.training.config;

import com.training.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class BankAppConfig {

    @Bean
    public Customer ramesh(){

        Customer ramesh = new Customer();
        ramesh.setCustomerId(102010);
        ramesh.setCustomerName("Ramesh");

        return ramesh;
    }

    @Bean
    public Bank jpm(){

        Bank jpm = new Bank(1);

        return jpm;
    }


    @Bean
    @Order(1)
    public BankAccounts fd(){

        return new BankAccounts(101,"fd");
    }

    @Bean
    @Order(2)
    public BankAccounts savings(){

        return new BankAccounts(102,"savings");
    }

    @Bean
    @Order(3)
    public BankAccounts current(){

        return new BankAccounts(103,"current");
    }

}
