package com.training.beans;

public class BankAccounts {

    private long accountNumber;
    private String accountType;

    public BankAccounts() {
    }

    public BankAccounts(long accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "BankAccounts{" +
                "accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
