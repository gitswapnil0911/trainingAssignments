package com.training.beans;

import com.training.annos.BankType;
import com.training.annos.QualifiedBank;
import com.training.ifaces.Bank;

@QualifiedBank(type = BankType.BloodBank)
public class BloodBank implements Bank {
    @Override
    public String[] topDonors() {
        return new String[]{"Rajesh","Amit","Ashish"};
    }
}
