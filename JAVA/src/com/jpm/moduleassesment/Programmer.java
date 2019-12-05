package com.jpm.moduleassesment;

import com.trg.catalogue.Product;

import java.util.Arrays;

public class Programmer extends Employee{
    String techKnown[]={"java","c","c#","servlet","php"};



    public Programmer(int empid, String ename, double sal, Date doj, String[] techKnown) throws InvalidEmployeeName {
        super(empid, ename, sal, doj);
        this.techKnown = techKnown;
    }

    public Programmer(){}

    @Override
    public String toString() {
        return "Programmer{" +
                "techKnown=" + Arrays.toString(techKnown) +
                ", empid=" + empid +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                ", doj=" + doj +
                '}';
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Technology known"+ Arrays.toString(techKnown));
    }

    }
