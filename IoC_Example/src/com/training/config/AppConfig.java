package com.training.config;

import com.training.beans.Hospital;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean()
    //Spring Bean are Singleton By Default
    //Can make it Prototype By Adding @scope Annotation
    //@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    //Spring Beans are Created Eagerly By Default and We can make it lazy by adding @Lazy
    //@Lazy
    //using Setter Dependency Injection
    public Hospital leelavathi(){

        Hospital leela = new Hospital();

        leela.setHospitalCode(1020);
        leela.setHospitalName("Leelavathi Hospital");
        leela.setMobileNumber(9833539741L);

        return leela;
    }

    //Using Constructor Dependency Injection
    @Bean
    public Hospital apollo(){
        return new Hospital(1040,"Appollo Hospital",98646788876L);
    }


}
