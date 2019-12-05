package com.jpm.collection;

import com.jpm.moduleassesment.Date;

public class Emp implements Comparable<Emp> {
    int empid;
    String ename;
    int sal;



    public Emp(){}
    public Emp(int empid, String ename, int sal) {
        this.empid = empid;
        this.ename = ename;
        this.sal = sal;

    }

    public Emp(int i, String s, int i1, Date date) {
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

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void displayEmpDetails() {
        System.out.println("Emp{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", sal='" + sal + '\'' +
                '}');
    }

    public static void main(String[] args) {

        //Date d1 = new Date(9,9,1990); //Removing this anonymous abject is created below
        Emp e1 = new Emp(101,"AAA",5000);
        e1.displayEmpDetails();

    }

    @Override
    public int compareTo(Emp o) {
        /*if(this.empid>o.empid) //Using integer following code
            return 1;
        else if (this.empid<o.empid)
            return -1;
        else return 0;*/
        return this.ename.compareTo(o.ename); //Using String for comparison it by default implemets compareTo implemented by String class

    }
}
