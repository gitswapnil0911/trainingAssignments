package com.jpm.XYZ.JDBC;

import com.jpm.XYZ.JDBC.Dao.MyDBConnection;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmpDAO {
    MyDBConnection db = new MyDBConnection();
    public void empSalIncr() {
        Connection conn= null;
        conn = db.obtainConnection();
        String sql = "Select * from emp";
        Map<Integer, Emp> hsmap = new HashMap<>();
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                System.out.println("Record: Emp No: "+rs.getInt(1)+ " : Emp Name: "+rs.getString(2)+ " : JOB: " +
                        rs.getString(3) + " : MGR: "+rs.getInt(4)+ ": HIREDATE: "+rs.getString(5) +
                        " : SAL: "+rs.getFloat(6) + " : COMM: "+rs.getFloat(7)+ ": DEPTNO: "+rs.getInt(8));
                hsmap.put(rs.getInt(1), new Emp(rs.getInt(1), rs.getString(2),rs.getString(3),
                        rs.getInt(4),rs.getString(5),rs.getFloat(6)*1.10f,rs.getFloat(7),rs.getInt(8)));
            }
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.releaseConnection(conn);
        System.out.println("Iterate thru map to show all emp records");
        Set<Integer> set = hsmap.keySet();
        for (Integer s: set)
        {
            System.out.println(hsmap.get(s));
        }

    }

    public static void main(String[] args) {
        EmpDAO emp = new EmpDAO();
        emp.empSalIncr();
    }
}



