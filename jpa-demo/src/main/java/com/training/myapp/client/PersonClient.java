package com.training.myapp.client;

import com.trainig.myapp.model.Address;
import com.trainig.myapp.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class PersonClient {
    public static void main(String[] args) {

        /*List<Address> addresses = Arrays.asList(new Address("M.GRoad","MH",400066,"Mumbai"), new Address("ABC Road","MH",400101,"Pune"));

        Person person = new Person(101,"John Doe", addresses);
*/
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
        EntityManager entityManager = factory.createEntityManager();

        /*EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        entityManager.persist(person);
        tx.commit();
*/      Person person = entityManager.find(Person.class,101);
        System.out.println(person.getPersonId());
        System.out.println(person.getPersonName());

        System.out.println("=====================================");

        List<Address> addresses = person.getPersonAddress();
        System.out.println(addresses);

        entityManager.close();
        factory.close();
    }
}
