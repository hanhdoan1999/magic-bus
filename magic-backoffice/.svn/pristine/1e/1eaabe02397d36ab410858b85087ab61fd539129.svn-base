package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectUtil {
    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/magic_bus", "postgres", "postgres"
            );
            return con;
            
        }catch(ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}