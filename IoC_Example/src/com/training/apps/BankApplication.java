package com.training.apps;

import com.training.beans.Bank;
import com.training.beans.Doctor;
import com.training.beans.Patient;
import com.training.config.DoctorAppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BankApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DoctorAppConfig.class);

        Bank bank = ctx.getBean("jpm",Bank.class);

        System.out.println(bank.getCustomerBankAccountsMap());
        /*List<Patient> patientList = ramesh.getPatient();

        patientList.forEach(System.out::println);*/
    }
}
