package com.training.myapp.client;

import com.trainig.myapp.model.Employee1;

import javax.persistence.*;
import java.util.List;

public class JPQLDemo {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
        EntityManager entityManager = factory.createEntityManager();

        /*Query query = entityManager.createQuery("From Employee1 where employeeDepartment='HR' order by employeeSalary desc");
        List<Employee1> employees = query.getResultList();

        employees.forEach(employee -> System.out.println(employee));*/

        /*Query query1 = entityManager.createQuery("Select employeeName, employeeSalary From Employee1 where employeeDepartment='HR' order by employeeSalary desc");
        List<Object[]> employeeData = query1.getResultList();

        for (Object [] data : employeeData) {
            System.out.println(data[0] + " - " + data[1]);

        }
*/
        /*Query query2 = entityManager.createQuery("Select max(employeeSalary),min(employeeSalary),count(*) From Employee1 where employeeDepartment='HR' order by employeeSalary desc");
        List<Object[]> employeeData = query2.getResultList();

        List<Object[]> data1 = query2.getResultList();
        Object[] d = data1.get(0);


            System.out.println(d[0] + " - " + d[1] + " - " + d[2]);
*/
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        //Update Record
        /*Query query3 = entityManager.createQuery("Update Employee1 set employeeSalary = employeeSalary + 1000 where employeeDepartment='HR'");
        int count = query3.executeUpdate();
        tx.commit();
        System.out.println("Records Updated = " + count);*/

        //Positional Parameter
        /*Query query4 = entityManager.createQuery("Update Employee1 set employeeSalary = employeeSalary + ? where employeeDepartment=?");
        query4.setParameter(1,2000);
        query4.setParameter(2,"HR");
        int count = query4.executeUpdate();
        tx.commit();
        System.out.println("Records Updated = " + count);*/

        //Named Parameter
        /*Query query5 = entityManager.createQuery("Update Employee1 set employeeSalary = employeeSalary + :salary where employeeDepartment= :dept");
        query5.setParameter("salary",1000);
        query5.setParameter("dept","HR");
        int count = query5.executeUpdate();
        tx.commit();
        System.out.println("Records Updated = " + count);*/

        //Only Named Query
        Query query6 = entityManager.createNamedQuery("findAllEmployees");
        List<Employee1> employees = query6.getResultList();

        employees.forEach(employee -> System.out.println(employee));

        //Named Queries
        Query query7 = entityManager.createNamedQuery("findEmployeeFromDepartment");
        query7.setParameter(1,"HR");
        List<Employee1> employees1 = query7.getResultList();

        employees1.forEach(employee -> System.out.println(employee));

        entityManager.close();
        factory.close();

    }
}
