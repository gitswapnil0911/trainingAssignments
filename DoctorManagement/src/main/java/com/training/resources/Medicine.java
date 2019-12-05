package com.training.resources;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Medicine {

    private long code;
    private String medicineName;
    private double ratePerUnit;


    public Medicine() {
    }

    public Medicine(long code, String medicineName, double ratePerUnit) {
        this.code = code;
        this.medicineName = medicineName;
        this.ratePerUnit = ratePerUnit;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public double getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(double ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "code=" + code +
                ", medicineName='" + medicineName + '\'' +
                ", ratePerUnit=" + ratePerUnit +
                '}';
    }
}

