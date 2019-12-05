package com.training.config;

import com.training.ifaces.Payment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);

        Payment mypayment = ctx.getBean(Payment.class);

        System.out.println(mypayment.getClass());

        System.out.println(mypayment.cardPayment("amex",1010));

        System.out.println(mypayment.cashPayment(2020));

    }
}
