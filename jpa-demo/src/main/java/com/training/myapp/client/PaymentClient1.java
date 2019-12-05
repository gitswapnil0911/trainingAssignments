package com.training.myapp.client;

import com.trainig.myapp.model.CardPayment;
import com.trainig.myapp.model.ChequePayment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class PaymentClient1 {
    public static void main(String[] args) {


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        CardPayment cardPayment= new CardPayment(103,new Date(),500,1234567890,"Debit",9,2023);
        ChequePayment chequePayment= new ChequePayment(104,new Date(),700,"Manager",12345);

        entityManager.persist(cardPayment);
        entityManager.persist(chequePayment);

        tx.commit();
        entityManager.close();
        factory.close();
    }
}
