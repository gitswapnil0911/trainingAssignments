package com.training.beans;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

public class Customer {

    private long customerId;
    private String customerName;


    public Customer() {
    }

    public Customer(long customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
