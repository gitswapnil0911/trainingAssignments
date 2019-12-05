package com.jpm.XYZ.JDBC;

public class Customer {
    private int custid;
    private String custName;
    private int contactNo;
    private String address;
    private String dob;

    public Customer(int custid, String custName, int contactNo, String address, String dob) {
        this.custid = custid;
        this.custName = custName;
        this.contactNo = contactNo;
        this.address = address;
        this.dob = dob;
    }

    public Customer() {
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custid=" + custid +
                ", custName='" + custName + '\'' +
                ", contactNo=" + contactNo +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
