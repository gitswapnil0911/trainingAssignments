package com.jpm.jdbc;

import java.sql.*;

public class JdbcDemoDml {
    public static void main(String[] args) {
        try {
            String url="jdbc:oracle:thin:@localhost:1521:xe";
            //String sql="insert into dept values(99,'ABC','Pune')";

            String sql="insert into dept values(?,?,?)";
            String sql1="Select * from dept where deptno=?";
            DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
            Connection conn=DriverManager.getConnection(url,"oracle","oracle123");
            //Statement stmt=conn.createStatement(); //This creates a forward
            PreparedStatement pstmt=conn.prepareStatement(sql1);
            PreparedStatement pstmt1=conn.prepareStatement(sql);
            pstmt.setInt(1,10);
            pstmt1.setInt(1,70);
            pstmt1.setString(2,"Training");
            pstmt1.setString(3,"Mumbai");
            pstmt1.executeUpdate();
            ResultSet rs=pstmt.executeQuery();
            //int i=stmt.executeUpdate(sql);
            //System.out.println(rs);
            while(rs.next()){
                System.out.println(rs.getInt(1)+ ":"+rs.getString(2));
            }

            //CallableStatement cstmt= conn.prepareCall("{call GREETINGS()}");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
