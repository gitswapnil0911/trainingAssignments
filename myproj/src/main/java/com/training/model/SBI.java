package com.training.model;

import com.training.model.Operations;
import com.training.model.RBI;

public class SBI extends RBI implements Operations {
    private float fdMinimumAmount=15000;
    private int fdMinimumYears=5;

    public SBI(){
        super();
        fd=8;
        saving=4.5f;
        savingMinimumBalance=10000;
        customerName="Sona";
        customerEmail="sona@gmail.com";
        customerMobile=94830975233L;
    }

    public SBI(float fdMinimumAmount, int fdMinimumYears) {
        this.fdMinimumAmount = fdMinimumAmount;
        this.fdMinimumYears = fdMinimumYears;
    }

    public SBI(float fd, float saving, float savingMinimumBalance, float fdMinimumAmount, int fdMinimumYears) {
        super(fd, saving, savingMinimumBalance);
        this.fdMinimumAmount = fdMinimumAmount;
        this.fdMinimumYears = fdMinimumYears;
    }

    public SBI(float fd, float saving, float savingMinimumBalance, String customerName, String customerEmail, long customerMobile, float fdMinimumAmount, int fdMinimumYears) {
        super(fd, saving, savingMinimumBalance, customerName, customerEmail, customerMobile);
        this.fdMinimumAmount = fdMinimumAmount;
        this.fdMinimumYears = fdMinimumYears;
    }

    public void deposit(String accountNumber, float amount) {
        System.out.println("Deposit Method in SBI");
    }

    public void withdraw(String accountNumber, float amount) {
        System.out.println("Withdraw Method in SBI");
    }

    public void deposit(float amount) {

    }

    public void withdraw(float amount) {

    }

    public void openFD(int fdYears, float amount) {
        System.out.println("Open FD in SBI");
    }
}
