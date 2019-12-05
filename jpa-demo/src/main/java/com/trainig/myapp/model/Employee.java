package com.trainig.myapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @Column(name="employee_id")
    private int employeeId;

    @Column(name="employee_name")
    private String employeeName;

    @Column(name="employee_email")
    private String employeeEmailId;

    @Column(name="employee_contact")
    private long employeeContact;

    @Column(name="employee_salary")
    private int employeeSalary;

    public Employee(){}

    public Employee(int employeeId, String employeeName, String employeeEmailId, long employeeContact, int employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmailId = employeeEmailId;
        this.employeeContact = employeeContact;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmailId='" + employeeEmailId + '\'' +
                ", employeeContact=" + employeeContact +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmailId() {
        return employeeEmailId;
    }

    public void setEmployeeEmailId(String employeeEmailId) {
        this.employeeEmailId = employeeEmailId;
    }

    public long getEmployeeContact() {
        return employeeContact;
    }

    public void setEmployeeContact(long employeeContact) {
        this.employeeContact = employeeContact;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
