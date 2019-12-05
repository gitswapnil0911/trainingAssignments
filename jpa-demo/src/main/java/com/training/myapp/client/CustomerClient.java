package com.training.myapp.client;

import com.trainig.myapp.model.Address;
import com.trainig.myapp.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerClient {
    public static void main(String[] args) {
        /*Address address = new Address("M.GRoad","MH",400066,"Mumbai");
        Customer customer = new Customer(1,"John Doe",address);*/

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
        EntityManager entityManager = factory.createEntityManager();

        /*EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        entityManager.persist(customer);
        tx.commit();*/

        Customer customer=entityManager.find(Customer.class,1);

        System.out.println(customer);
        entityManager.close();
        factory.close();
    }
}
