package com.trainig.myapp.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    private int customerId;
    private String customerName;
    @Embedded
    private Address customerAddress;

    public Customer(){}
    public Customer(int customerId, String customerName, Address customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress=" + customerAddress +
                '}';
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }
}
