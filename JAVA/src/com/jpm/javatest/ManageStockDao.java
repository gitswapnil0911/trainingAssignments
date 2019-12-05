package com.jpm.javatest;

import com.jpm.log4j.log4jDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageStockDao {

    Stock stock = new Stock();
    MyDBConnection db = new MyDBConnection();
    static Logger log = LogManager.getLogger(log4jDemo.class);

    public ManageStockDao() {

    }

    public void insert(Stock stock) {
        Connection conn = null;
        conn = db.obtainConnection();
        String sql = "insert into stocks values (?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, stock.getStockId());
            pstmt.setString(2, stock.getStockName());
            pstmt.setString(3, stock.getCompany());
            pstmt.setDouble(4, stock.getPrice());
            pstmt.setInt(5, stock.getQuantity());
            int i = pstmt.executeUpdate();
            if (i > 0) {
                log.info(i + " Record inserted.");
            } else
                log.warn("Insert Failed.");
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.releaseConnection(conn);

    }


    public void delete(int id) {
        File f = null;
        FileWriter fr = null;
        BufferedWriter bw = null;
        Connection conn = null;
        conn = db.obtainConnection();

        try {
            f = new File("StockLog.txt");
            if (!f.exists()) {
                f.createNewFile();
            }
            fr = new FileWriter(f);
            bw = new BufferedWriter(fr);
            String sql1 = "Select * from stocks where id =?";
            PreparedStatement pstmt = conn.prepareStatement(sql1);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            LocalDate date = LocalDate.now();
            if (rs.next()) {
                String str = "ID :" + rs.getInt(1) + "," + " Name :" + rs.getString(2) + "," +
                        " COMPANY :" + rs.getString(3) + "," + " PRICE :" + rs.getDouble(4) + ","
                        + " QUANTITY :" + rs.getInt(5) + " Deletion Date :" + date;
                bw.write(str);
            }
            log.info("Record to be deleted is " + id);
            String sql = "Delete from stocks where id =?";
            try {
                PreparedStatement pstmt1 = conn.prepareStatement(sql);
                pstmt1.setInt(1, id);
                int i = pstmt1.executeUpdate();
                if (i > 0)
                    log.info(i + " Record deleted successfully.");

                else
                    log.error("Record deletion Failed.");
                pstmt1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fr.close();
                db.releaseConnection(conn);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

    public void display() {
        Connection conn = null;
        conn = db.obtainConnection();
        String sql = "Select * from stocks";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Record: Stock ID: " + rs.getInt(1) + " : Stock Name: " + rs.getString(2) + " : Company Name: " +
                        rs.getString(3) + " : Stock price: " + rs.getDouble(4) + ": Quantity: " + rs.getInt(5));
            }
            pstmt.close();
            log.info("display function working correctly");
        } catch (SQLException e) {
            log.error("display function failed");
            e.printStackTrace();
        }
        db.releaseConnection(conn);
    }

    public Stock getStock(int id) {
        Connection conn = null;
        Stock stock = null;
        conn = db.obtainConnection();
        String sql = "Select * from stocks where id =?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Record: Stock ID: " + rs.getInt(1) + " : Stock Name: " + rs.getString(2) + " : Company Name: " +
                        rs.getString(3) + " : Stock price: " + rs.getDouble(4) + ": Quantity: " + rs.getInt(5));
            }
            log.info("No Data found");
        } catch (SQLException e) {
            log.error("getStock method failed");
            e.printStackTrace();
        }

        db.releaseConnection(conn);
        return stock;
    }

    public List<Stock> getAllStocks() throws Exception {
        List<Stock> lists = new ArrayList<>();
        String sql = " ";
        Connection conn = null;
        conn = db.obtainConnection();
        try {
            sql = "select * from stocks";
            Statement stm = MyDBConnection.obtainConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                lists.add(new Stock(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getDouble(4), rs.getInt(5)));
            }
            log.info("Getting data for all users");
        } catch (SQLException e) {
            log.error("unable to get stock details");

        } finally {
            db.releaseConnection(conn);

        }
        return lists;
    }

    public ManageStockDao(Stock stock) {
        this.stock = stock;
    }
}
