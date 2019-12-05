package com.trainig.myapp.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
//@DiscriminatorValue(value = "CARD")
public class CardPayment extends Payment {
    private long cardNumber;
    private String cardType;
    private int expiryMonth;
    private int expiryYear;

    public CardPayment(){}

    public CardPayment(long cardNumber, String cardType, int expiryMonth, int expiryYear) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
    }

    public CardPayment(int paymentId, Date paymentDate, int paymentAmount, long cardNumber, String cardType, int expiryMonth, int expiryYear) {
        super(paymentId, paymentDate, paymentAmount);
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(int expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    @Override
    public String toString() {
        return "CardPayment{" +
                "cardNumber=" + cardNumber +
                ", cardType='" + cardType + '\'' +
                ", expiryMonth=" + expiryMonth +
                ", expiryYear=" + expiryYear +
                '}' + super.toString();
    }
}
