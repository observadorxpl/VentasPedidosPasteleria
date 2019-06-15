package pasteleria.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pasteleria.database.AccesoDB;

public class Test {
    public static void main(String[] args) {
        
        Connection cn;
        PreparedStatement ps = null;
        ResultSet rs;
        String sql = "SELECT * FROM TIPOEMPLEADO";
        
        try {
        cn = AccesoDB.getConnection();
        ps = cn.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.next();
            System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
