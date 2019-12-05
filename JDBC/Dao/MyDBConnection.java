package com.jpm.XYZ.JDBC.Dao;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class MyDBConnection {
    Connection conn = null;
    public Connection obtainConnection() {
        try {
            FileReader  fr = new FileReader("C:\\My JAVA\\Training\\src\\com\\jpm\\XYZ\\JDBC\\Dao\\DBDetails.properties");
            Properties prop = new Properties();
            prop.load(fr);
            String url = prop.getProperty("url");
            String user = prop.getProperty("uname");
            String password = prop.getProperty("pass");
//            System.out.println("URL:"+ url + "user"+ user +" pass: "+password);
            DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
            conn = DriverManager.getConnection(url, user, password);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void releaseConnection(Connection conn)
    {
            try {
                if(conn!= null) {
                    conn.close();
                    System.out.println("Connection closed successfully!!!");
                }else
                    System.out.println("There is no open connection!!!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

  /*  public static void main(String[] args) {
        MyDBConnection db = new MyDBConnection();
        Connection conn= null;
        conn = db.obtainConnection();
        System.out.println("DB Connection Status: " +conn);
        db.releaseConnection(conn);
        System.out.println(conn);
    }*/
}
