package com.training.myapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="carts")
public class Cart {

    @Id
    private int cartId;
    private  String userName;
    @OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JoinTable(joinColumns = @JoinColumn(name = "cart_id"),inverseJoinColumns = @JoinColumn(name="product_id"))
    private List<Product> products;

    public Cart(){}

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", userName='" + userName + '\'' +
                ", products=" + products +
                '}';
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Cart(int cartId, String userName, List<Product> products) {
        this.cartId = cartId;
        this.userName = userName;
        this.products = products;
    }
}
