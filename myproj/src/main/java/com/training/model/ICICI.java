package com.training.model;

import com.training.model.Operations;
import com.training.model.RBI;

public class ICICI extends RBI implements Operations {
    private float fdMinimumAmount=10000;
    private int fdMinimumYears=2;
    private float currentBalance=20000;
    private float fdAmount;
    private int fdYears;

    public ICICI(){
        super();
        fd=6;
        saving=5;
        savingMinimumBalance=5000;
        customerName="Pat";
        customerEmail="pat@gmail.com";
        customerMobile=72636812378L;
    }

    public ICICI(float fdMinimumAmount, int fdMinimumYears) {
        this.fdMinimumAmount = fdMinimumAmount;
        this.fdMinimumYears = fdMinimumYears;
    }

    public ICICI(float fd, float saving, float savingMinimumBalance, float fdMinimumAmount, int fdMinimumYears) {
        super(fd, saving, savingMinimumBalance);
        this.fdMinimumAmount = fdMinimumAmount;
        this.fdMinimumYears = fdMinimumYears;
    }

    public ICICI(float fd, float saving, float savingMinimumBalance, String customerName, String customerEmail, long customerMobile, float fdMinimumAmount, int fdMinimumYears) {
        super(fd, saving, savingMinimumBalance, customerName, customerEmail, customerMobile);
        this.fdMinimumAmount = fdMinimumAmount;
        this.fdMinimumYears = fdMinimumYears;
    }

    public void deposit(float amount) {
        System.out.println("Deposit Method in ICICI");
        if(amount <= 0) {
            currentBalance += amount;
        }
        else
            System.out.println("Amount cant be 0 or less than that");

        System.out.println("Current Balance after Deposit is: " + currentBalance);
    }

    public void withdraw(float amount) {
        System.out.println("Withdraw Method in ICICI");
        if(currentBalance-amount > savingMinimumBalance){
            currentBalance -= amount;
            System.out.println("Current Balance after Wihdrawal is: " + currentBalance);
        }
        else
            System.out.println("Can't go beyond minimum balance");
    }

    public void openFD(int fdYear, float amount) {
        System.out.println("Open FD in ICICI");
        fdYears=fdYear;
        fdAmount=amount;

        System.out.println("FD details: /n Years: " + fdYears + "/n Amount: " + fdAmount);

    }
}
