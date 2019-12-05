package com.training.dao;



import com.training.MyRepository;
import com.training.resources.Medicine;
import lombok.Getter;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter

public class MedicineDao implements MyRepository<Medicine> {


    private static String tableName="JPMedicine";
    Connection con=null;

    public MedicineDao(){
        try {
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle","oracle123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int add(Medicine medicine) {


        String sql="insert into "+tableName+" values(?,?,?)";
        PreparedStatement pstmt= null;
        int rowAdded=0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1,medicine.getCode());
            pstmt.setString(2,medicine.getMedicineName());
            pstmt.setDouble(3,medicine.getRatePerUnit());
            rowAdded=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return rowAdded;
    }


    @Override
    public int update(Medicine medicine) {
        String sql="update "+tableName+ " set medicineName=? , ratePerUnit=? where code=?";

        //int rowUpdated=this.template.update(sql,medicine.getMedicineName(),medicine.getRatePerUnit(),medicine.getCode());

        //return rowUpdated;
        PreparedStatement pstmt= null;
        int rowUpdated=0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,medicine.getMedicineName());
            pstmt.setDouble(2,medicine.getRatePerUnit());
            pstmt.setLong(3,medicine.getCode());
            rowUpdated=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowUpdated;

    }

    @Override
    public int remove(long key) {
        String sql="delete from "+tableName+ " where code=?";
        //int rowDeleted=this.template.update(sql,key);
        //return rowDeleted;
        PreparedStatement pstmt= null;
        int rowDeleted=0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1,key);
            rowDeleted=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowDeleted;

    }

    @Override
    public List<Medicine> findAll() {
        String sql = "select * from " + tableName;
        PreparedStatement pstmt = null;
        List<Medicine> medicineList = new ArrayList<>();
        try {
            pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                medicineList.add(new Medicine(rs.getLong(1), rs.getString(2), rs.getDouble(3)));
            }
        } catch (SQLException e) {
        }
        //return this.template.queryForList(sql);
        return medicineList;
    }

    @Override
    public Medicine findById(long key) {
        String sql = "select * from " + tableName + " where code=?";
        Medicine med = null;
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1,key);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                med = new Medicine(rs.getLong(1), rs.getString(2), rs.getDouble(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return med;
    }

}
