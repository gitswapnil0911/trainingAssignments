package com.jpm.XYZ.JDBC;
import com.jpm.XYZ.JDBC.Dao.MyDBConnection;

import java.sql.*;

public class CustomerDAO {
    MyDBConnection db = new MyDBConnection();
    //Insert Method
    public void insert(Customer cust)
    {
        Connection conn= null;
        conn = db.obtainConnection();
        String sql = "insert into customer values (?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,cust.getCustid());
            pstmt.setString(2,cust.getCustName());
            pstmt.setInt(3,cust.getContactNo());
            pstmt.setString(4,cust.getAddress());
            pstmt.setString(5,cust.getDob());
            int i = pstmt.executeUpdate();
            if(i>0)
                System.out.println(i + " Record inserted.");
            else
                System.out.println("Insert Failed.");
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.releaseConnection(conn);
    }

    //Update Method
    public void update (int id, int contactNo)
    {
        Connection conn= null;
        conn = db.obtainConnection();
        String sql = "update customer set contactNo =? where custid =?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,contactNo);
            pstmt.setInt(2,id);
            int i = pstmt.executeUpdate();
            if(i>0)
                System.out.println(i + " Record updated.");
            else
                System.out.println("Updated Failed.");
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.releaseConnection(conn);
    }

    //Delete Method
    public void delete(int id)
    {
        Connection conn= null;
        conn = db.obtainConnection();
        String sql = "Delete from customer where custid =?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            int i = pstmt.executeUpdate();
            if(i>0)
                System.out.println(i + " Record deleted successfully.");
            else
                System.out.println("Record deletion Failed.");
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.releaseConnection(conn);
    }

//    Display Method
    public void display()
    {
        Connection conn= null;
        conn = db.obtainConnection();
        String sql = "Select * from customer";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
           while(rs.next())
           {
               System.out.println("Record: Customer ID: "+rs.getInt(1)+ " : Customer Name: "+rs.getString(2)+ " : Contact No: " +
                       rs.getInt(3) + " : Customer Addrtess: "+rs.getString(4)+ ": Customer DOB: "+rs.getString(5));
           }
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.releaseConnection(conn);
    }
}
