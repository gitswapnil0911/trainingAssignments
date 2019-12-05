package com.jpm.javatest;

import com.jpm.log4j.log4jDemo;
import com.sun.deploy.security.SelectableSecurityManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class MyDBConnection {
    public static Connection conn;
    static Logger log = LogManager.getLogger(log4jDemo.class);
    public static Connection obtainConnection() {
        try {
            FileReader fr = new FileReader("D:\\Swapnil\\JAVA\\src\\com\\jpm\\javatest\\DBDetails.properties");
            Properties prop = new Properties();
            prop.load(fr);
            String url = prop.getProperty("url");
            String user = prop.getProperty("uname");
            String password = prop.getProperty("pass");
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

    public static void releaseConnection(Connection conn){
        try {
            if(MyDBConnection.conn != null) {
                MyDBConnection.conn.close();
                log.info("Connection closed successfully!!!");
            }else
                log.info("There is no open connection!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
