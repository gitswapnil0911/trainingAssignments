package com.training.beans;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"directorName", "address", "phoneNumber"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Director {

    private String directorName;
    private long phoneNumber;
    private String address;

    public Director() {
    }

    public Director(String directorName, long phoneNumber, String address) {
        this.directorName = directorName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getDirectorName() {
        return directorName;
    }


    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }
}
