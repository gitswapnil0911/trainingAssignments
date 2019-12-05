package com.jpm.javatest;

public class Stock {
    int stockId;
    String stockName;
    String company;
    double price;
    int quantity;

    public Stock() {
    }

    public Stock(int stockId, String stockName, String company, double price, int quantity) {
        this.stockId = stockId;
        this.stockName = stockName;
        this.company = company;
        this.price = price;
        this.quantity = quantity;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", stockName='" + stockName + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void displayDetails() {
        System.out.println("stockId=" + stockId +
                ", stockName='" + stockName + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", quantity=" + quantity);
    }


}
