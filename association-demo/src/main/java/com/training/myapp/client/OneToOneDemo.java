package com.training.myapp.client;

import com.training.myapp.model.Person;
import com.training.myapp.model.Vehicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneDemo {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        /*Vehicle vehicle = new Vehicle(1,"BMW");
        Person person = new Person(101,"John Doe",vehicle);
        entityManager.persist(person);*/

        Person person2= entityManager.find(Person.class,101);
        entityManager.remove(person2);

        tx.commit();

        /*Person person1= entityManager.find(Person.class,101);
        System.out.println(person1.getPersonId());
        System.out.println(person1.getPersonName());*/

        entityManager.close();
        factory.close();
    }
}
