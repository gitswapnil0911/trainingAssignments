package com.jpm.moduleassesment;

import com.jpm.collection.EmpTreeSet;
/*class Employee that has the following properties: empId, empName, basicSal, dateOfJoining.*/

public class Employee {
    int empid;
    String ename;
    double sal;
    Date doj;

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                ", doj=" + doj +
                '}';
    }

    public Employee() {
    }

    public Employee(int empid, String ename, double sal, Date doj) throws InvalidEmployeeName { //user defined exception if employee name is null for constructor
        this.empid = empid;
        if (ename == null) {
            throw new InvalidEmployeeName("Employee Name can't be blank");
        }
        this.ename = ename;
        this.sal = sal;
        this.doj = doj;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) throws InvalidEmployeeName {  //user defined exception if employee name is null for employee name setter
        if (ename == null)
            throw new InvalidEmployeeName("Employee Name can't be blank");
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }


    public void displayDetail() { //displayDetails method of Employee
        System.out.println("Employee id=" + empid + ", Name= " + ename + ", salary=" + sal + ", doj=" + doj );
    }
}
