package com.training.apps;

import com.training.beans.Hospital;
import com.training.config.AppConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        /*BeanFactory ctx2 = new AnnotationConfigApplicationContext(AppConfig.class);*/

        /*//Accesing Bean By Type
        Hospital leela = ctx.getBean(Hospital.class);

        System.out.println(leela);*/

        //Get a bean of type Hospital.class and with a Id leelvathi
        Hospital leela = ctx.getBean("leelavathi",Hospital.class);

        System.out.println(leela);

        //Accessing Bean By Id
        Hospital srleela = (Hospital) ctx.getBean("leelavathi");
        System.out.println(srleela);

        //Spring Beans are Singleton By Default

        System.out.println(ctx.isSingleton("leelavathi"));

        System.out.println(ctx.isPrototype("leelavathi"));

        System.out.println(leela.hashCode());
        System.out.println(srleela.hashCode());
        ctx.close();

    }
}
