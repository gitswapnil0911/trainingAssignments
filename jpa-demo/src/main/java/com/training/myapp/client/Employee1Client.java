package com.training.myapp.client;

import com.trainig.myapp.model.Employee1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Employee1Client {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Employee1 john = new Employee1(101,"John Doe","HR",45000);

        entityManager.persist(john);

            tx.commit();
            entityManager.close();
            factory.close();

    }

}
