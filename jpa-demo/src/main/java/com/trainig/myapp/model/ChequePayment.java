package com.trainig.myapp.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
//@DiscriminatorValue(value="CHEQUE")
public class ChequePayment extends Payment {

    private String chequeType;
    private int chequeNumber;

    public ChequePayment(){}

    public ChequePayment(String chequeType, int chequeNumber) {
        this.chequeType = chequeType;
        this.chequeNumber = chequeNumber;
    }

    public ChequePayment(int paymentId, Date paymentDate, int paymentAmount, String chequeType, int chequeNumber) {
        super(paymentId, paymentDate, paymentAmount);
        this.chequeType = chequeType;
        this.chequeNumber = chequeNumber;
    }

    public String getChequeType() {
        return chequeType;
    }

    public void setChequeType(String chequeType) {
        this.chequeType = chequeType;
    }

    public int getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(int chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    @Override
    public String toString() {
        return "ChequePayment{" +
                "chequeType='" + chequeType + '\'' +
                ", chequeNumber=" + chequeNumber +
                '}'+ super.toString();
    }
}
