package com.trainig.myapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    private int personId;
    private String personName;

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "addresses", joinColumns = @JoinColumn(name="person_id"))
    private List<Address> personAddress;

    public Person(){}

    public Person(int personId, String personName, List<Address> personAddress) {
        this.personId = personId;
        this.personName = personName;
        this.personAddress = personAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personAddress=" + personAddress +
                '}';
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public List<Address> getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(List<Address> personAddress) {
        this.personAddress = personAddress;
    }
}
