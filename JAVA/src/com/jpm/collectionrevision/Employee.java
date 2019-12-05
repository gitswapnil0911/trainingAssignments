package com.jpm.collectionrevision;

public class Employee {
    private int enpNo;
    private String name;
    private float sal;
    public Employee() {
    }

    public Employee(int enpNo, String name, float sal) {
        this.enpNo = enpNo;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "enpNo=" + enpNo +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public int getEnpNo() {
        return enpNo;
    }

    public void setEnpNo(int enpNo) {
        this.enpNo = enpNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
}
