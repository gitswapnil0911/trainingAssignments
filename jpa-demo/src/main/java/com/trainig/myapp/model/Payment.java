package com.trainig.myapp.model;

import javax.persistence.*;
import java.util.Date;
@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "payment_mode", discriminatorType = DiscriminatorType.STRING)
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Payment {

    @Id
    private int paymentId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;
    private  int paymentAmount;

    public Payment(){}

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentDate=" + paymentDate +
                ", paymentAmount=" + paymentAmount +
                '}';
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Payment(int paymentId, Date paymentDate, int paymentAmount) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }
}
