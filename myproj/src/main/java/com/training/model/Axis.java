package com.training.model;

public class Axis extends RBI implements Operations {
    private float fdMinimumAmount=25000;
    private int fdMinimumYears=3;

    public Axis(){
        super();
        fd=8;
        saving=6f;
        savingMinimumBalance=6000;
        customerName="Sandy";
        customerEmail="sandy@gmail.com";
        customerMobile=7657841233L;
    }

    public Axis(float fdMinimumAmount, int fdMinimumYears) {
        this.fdMinimumAmount = fdMinimumAmount;
        this.fdMinimumYears = fdMinimumYears;
    }

    public Axis(float fd, float saving, float savingMinimumBalance, float fdMinimumAmount, int fdMinimumYears) {
        super(fd, saving, savingMinimumBalance);
        this.fdMinimumAmount = fdMinimumAmount;
        this.fdMinimumYears = fdMinimumYears;
    }

    public Axis(float fd, float saving, float savingMinimumBalance, String customerName, String customerEmail, long customerMobile, float fdMinimumAmount, int fdMinimumYears) {
        super(fd, saving, savingMinimumBalance, customerName, customerEmail, customerMobile);
        this.fdMinimumAmount = fdMinimumAmount;
        this.fdMinimumYears = fdMinimumYears;
    }

    public void deposit(String accountNumber, float amount) {
        System.out.println("Deposit Method in AXIS");
    }

    public void withdraw(String accountNumber, float amount) {
        System.out.println("Withdraw Method in AXIS");
    }

    public void deposit(float amount) {

    }

    public void withdraw(float amount) {

    }

    public void openFD(int fdYears, float amount) {
        System.out.println("Open FD in AXIS");
    }
}
