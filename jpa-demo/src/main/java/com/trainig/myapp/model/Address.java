package com.trainig.myapp.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String stree;
    private String state;
    private int zipCode;
    private String city;

    public Address(){}

    public Address(String stree, String state, int zipCode, String city) {
        this.stree = stree;
        this.state = state;
        this.zipCode = zipCode;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "stree='" + stree + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", city='" + city + '\'' +
                '}';
    }

    public String getStree() {
        return stree;
    }

    public void setStree(String stree) {
        this.stree = stree;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
