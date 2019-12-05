package com.jpm.javatest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClientApp {
    public static void main(String[] args) {
        ManageStockDao msd = new ManageStockDao();
        List<Stock> ar = new ArrayList<Stock>();
        msd.insert(new Stock(5, "S", "A", 2000, 10));
        msd.delete(5);
        msd.getStock(1);
        try {
            ar = msd.getAllStocks();
            ar.forEach(new Consumer<Stock>() {
                @Override
                public void accept(Stock stock) {
                    stock.displayDetails();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}