package com.training.model;

public class RBI {
    protected float fd=3;
    protected float saving=2;
    protected float savingMinimumBalance=2000;
    protected String customerName;
    protected String customerEmail;
    protected long customerMobile;

    public RBI(){}

    public RBI(float fd, float saving, float savingMinimumBalance) {
        this.fd = fd;
        this.saving = saving;
        this.savingMinimumBalance = savingMinimumBalance;
    }

    public RBI(float fd, float saving, float savingMinimumBalance, String customerName, String customerEmail, long customerMobile) {
        this.fd = fd;
        this.saving = saving;
        this.savingMinimumBalance = savingMinimumBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerMobile = customerMobile;
    }

    public float getFd() {
        return fd;
    }

    public void setFd(float fd) {
        this.fd = fd;
    }

    public float getSaving() {
        return saving;
    }

    public void setSaving(float saving) {
        this.saving = saving;
    }

    public float getSavingMinimumBalance() {
        return savingMinimumBalance;
    }

    public void setSavingMinimumBalance(float savingMinimumBalance) {
        this.savingMinimumBalance = savingMinimumBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public long getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(long customerMobile) {
        this.customerMobile = customerMobile;
    }

    @Override
    public String toString() {
        return "RBI{" +
                "fd=" + fd +
                ", saving=" + saving +
                ", savingMinimumBalance=" + savingMinimumBalance +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerMobile=" + customerMobile +
                '}';
    }
}
