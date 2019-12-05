package com.training.model;

import com.training.model.Operations;
import com.training.model.RBI;

public class StandardCharter extends RBI implements Operations {
    private float fdMinimumAmount=20000;
    private int fdMinimumYears=3;

    public StandardCharter(){
        super();
        fd=7;
        saving=5.5f;
        savingMinimumBalance=3000;
        customerName="Sam";
        customerEmail="sam@gmail.com";
        customerMobile=94837841233L;
    }

    public StandardCharter(float fdMinimumAmount, int fdMinimumYears) {
        this.fdMinimumAmount = fdMinimumAmount;
        this.fdMinimumYears = fdMinimumYears;
    }

    public StandardCharter(float fd, float saving, float savingMinimumBalance, float fdMinimumAmount, int fdMinimumYears) {
        super(fd, saving, savingMinimumBalance);
        this.fdMinimumAmount = fdMinimumAmount;
        this.fdMinimumYears = fdMinimumYears;
    }

    public StandardCharter(float fd, float saving, float savingMinimumBalance, String customerName, String customerEmail, long customerMobile, float fdMinimumAmount, int fdMinimumYears) {
        super(fd, saving, savingMinimumBalance, customerName, customerEmail, customerMobile);
        this.fdMinimumAmount = fdMinimumAmount;
        this.fdMinimumYears = fdMinimumYears;
    }

    public void deposit(String accountNumber, float amount) {
        System.out.println("Deposit Method in SC");
    }

    public void withdraw(String accountNumber, float amount) {
        System.out.println("Withdraw Method in SC");
    }

    public void deposit(float amount) {

    }

    public void withdraw(float amount) {

    }

    public void openFD(int fdYears, float amount) {
        System.out.println("Open FD in SC");
    }
}
