package com.collection;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Mainclass {

    public static void main(String[] args) {
        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);
/*
    Employeeclass s = (Employeeclass) factory.getBean("e1");*/
        Employeeclass ec= (Employeeclass) factory.getBean("ecsi1");
        ec.showJobOpenings();

    }
}
