package com.jpm.collectionrevision;

import java.util.Objects;

public class Name implements Comparable<Name> {
    private String firstName, lastName;

    public Name(){
        firstName="Sam";
        lastName="Sum";
    };

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Name)) return false;
        Name name = (Name) o;
        return getFirstName().equals(name.getFirstName()) &&
                getLastName().equals(name.getLastName());
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode Invoked");
        return Objects.hash(getFirstName(), getLastName());
    }

    @Override
    public int compareTo(Name name2) {
        String n1 = firstName;
        String n2 = name2.firstName;
        int comparison = n1.compareTo(n2);
        if(comparison == 0)
            comparison=1; // We are setting up the value to 1 because we are just providing this firstname for sorting, if there is case of having to Similar first names both wont be added if return 0 and they might have diff last name and should be added
        return comparison;
    }
}
