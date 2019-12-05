package com.training.config;

import com.training.beans.Address;
import com.training.beans.Doctor;
import com.training.beans.Patient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class DoctorAppConfig {

    @Bean
    public Address address(){

        return new Address("gandhi Street","Nehru Nagar","Mumbai",400066);
    }

    @Bean
    public Doctor ramesh(){

        Doctor ramesh = new Doctor();
        ramesh.setDoctorId(102010);
        ramesh.setDoctorName("Ramesh");

        //Using Bean Refrence
        ramesh.setAddress(address());

        ramesh.setSpecialization("ENT");

        return ramesh;
    }

    @Bean
    @Order(1)
    public Patient suresh(){

        return new Patient(1010,"Suresh");
    }

    @Bean
    @Order(2)
    public Patient sugesh(){

        return new Patient(1011,"Sugesh");
    }

    @Bean
    @Order(3)
    public Patient sumesh(){

        return new Patient(1012,"Sumesh");
    }
}
