package com.trainig.myapp.model;

import javax.persistence.*;

@Entity
@Table(name = "employees1")
//@NamedQuery(name="findAllEmployees",query = "from Employee1")
@NamedQueries({
        @NamedQuery(name="findAllEmployees",query = "from Employee1"),
        @NamedQuery(name="findEmployeeFromDepartment", query = "from Employee1 where employeeDepartment=?")
})
public class Employee1 {

    @Id
    private int employeeId;
    private String employeeName;
    private String employeeDepartment;
    private int employeeSalary;

    public Employee1(){}

    public Employee1(int employeeId, String employeeName, String employeeDepartment, int employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
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

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
