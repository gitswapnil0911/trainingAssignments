package com.training.resources;

public class Address {

    private String city;
    private long zipCode;

    public Address() {
    }

    public Address(String city, long zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
