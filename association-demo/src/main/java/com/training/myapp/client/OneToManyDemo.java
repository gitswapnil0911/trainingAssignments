package com.training.myapp.client;

import com.training.myapp.model.Cart;
import com.training.myapp.model.Person;
import com.training.myapp.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class OneToManyDemo {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        /*List<Product> products = Arrays.asList(
                new Product(101,"Redmi Note 5", "Mobiles",14000),
                new Product(102,"Redmi A1", "Mobiles",11000),
                new Product(103,"HP i5507", "Laptops",34000),
                new Product(104,"Dell i4509", "Laptops",50000)
        );

        Cart cart = new Cart(1,"Swapnil",products);

        entityManager.persist(cart);*/

/*        Cart cart1= entityManager.find(Cart.class,1);
        *//*System.out.println(cart1.getCartId());
        System.out.println(cart1.getUserName());
*//*      entityManager.remove(cart1);*/

        Product product1= entityManager.find(Product.class,101);
        /*System.out.println(cart1.getCartId());
        System.out.println(cart1.getUserName());
*/      entityManager.remove(product1);


        tx.commit();
        entityManager.close();
        factory.close();
    }
}
