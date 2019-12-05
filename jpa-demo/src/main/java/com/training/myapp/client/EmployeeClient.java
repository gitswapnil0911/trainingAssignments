package com.training.myapp.client;

import com.trainig.myapp.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeClient {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
        EntityManager entityManager = factory.createEntityManager();

        /*Employee john = new Employee(101,"John Doe","john@gmail.com",9833539741L,45000);
        Employee jane = new Employee(102,"Jane Doe","jane@gmail.com",9833539806L,30000);

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        entityManager.persist(john);
        entityManager.persist(jane);

        tx.commit();*/
        /*EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Employee employee1 = entityManager.find(Employee.class,101);
        if(employee1 != null) {
            System.out.println(employee1);
            employee1.setEmployeeSalary(60000);
        }
        else
            System.out.println("Employee Record not found...");

        tx.commit();*/

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Employee employee1 = entityManager.find(Employee.class,101);
        entityManager.remove(employee1);
        tx.commit();;

        entityManager.close();
        factory.close();
    }
}
