package com.training.beans;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Set;

public class Bank {

    private long bankId;
    @Autowired
    private Map<Customer, Set<BankAccounts>> customerBankAccountsMap;

    public Bank() {
    }

    public Bank(long bankId) {
        this.bankId = bankId;
    }

    public long getBankId() {
        return bankId;
    }

    public void setBankId(long bankId) {
        this.bankId = bankId;
    }

    public Map<Customer, Set<BankAccounts>> getCustomerBankAccountsMap() {
        return customerBankAccountsMap;
    }

    public void setCustomerBankAccountsMap(Map<Customer, Set<BankAccounts>> customerBankAccountsMap) {
        this.customerBankAccountsMap = customerBankAccountsMap;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankId=" + bankId +
                ", customerBankAccountsMap=" + customerBankAccountsMap +
                '}';
    }
}
