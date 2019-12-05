package com.training.myapp.model;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    private int personId;
    private String personName;
    @OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name="vehicle_id")
    private Vehicle vehicle;

    public Person(){}

    public Person(int personId, String personName, Vehicle vehicle) {
        this.personId = personId;
        this.personName = personName;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", vehicle=" + vehicle +
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
