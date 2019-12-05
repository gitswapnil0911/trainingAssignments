package com.jpm.jdbc;

import java.sql.*;

public class ResultsetDemo {

    public static void main(String[] args) {
        try {
            String url="jdbc:oracle:thin:@localhost:1521:xe";
            String sql="select * from dept";
            DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
            Connection conn=DriverManager.getConnection(url,"oracle","oracle123");
            Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=stmt.executeQuery(sql);
            rs.next();
                System.out.println(rs.getInt(1)+ ":"+rs.getString(2));
            rs.next();
            System.out.println(rs.getInt(1)+ ":"+rs.getString(2));
            rs.previous();
            System.out.println(rs.getInt(1)+ ":"+rs.getString(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
