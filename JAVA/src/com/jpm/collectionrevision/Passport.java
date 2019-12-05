package com.jpm.collectionrevision;

import java.time.LocalDate;

public class Passport {
    private String passportNo, name;
    private LocalDate expiryDate;
    public Passport() {
    }

    public Passport(String passportNo, String name, LocalDate expiryDate) {
        this.passportNo = passportNo;
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNo='" + passportNo + '\'' +
                ", name='" + name + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
