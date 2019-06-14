package pasteleria.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class AccesoDB {

    public static Connection getConnection() throws SQLException {
        Connection cn = null;
        try {
            // Parámetros de Connexión
            String driver = "oracle.jdbc.OracleDriver";
                String url = "jdbc:oracle:thin:@132.145.159.7:1521:FSOCIETY";
            String user = "INTEGRADOR";
            String pwd = "123";
            // cargar driver en memoria
            Class.forName(driver).newInstance();
            // obtener conexion a BD
            cn = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            throw new SQLException("No se encontró el driver de la base de dato.");
        } catch (InstantiationException | IllegalAccessException e) {
            throw new SQLException("No se puede acceder a la base de datos.");
        }
        return cn;
    }

}
