import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test1 {
    public static void main(String[] args) throws SQLException {
        BasicDataSource ds = new BasicDataSource();
        ds.setUsername("oracle");
        ds.setPassword("oracle123");
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        Connection connObj = ds.getConnection();
        PreparedStatement pstmtobj = connObj.prepareStatement("Select * from users");
        ResultSet rsObj = pstmtobj.executeQuery();
        while(rsObj.next())
            System.out.println("Username " + rsObj.getString("USERNAME"));
        System.out.println("\n=====Releasing Conncection Object To Pool====\n");
        pstmtobj.close();
        rsObj.close();
        connObj.close();
    }
}
