package travel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Conn {
    private Connection conn;
    Statement s;
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/travelmanagementsystem",
                    "Soham",
                    "PASSWORD");
            s = conn.createStatement();
        } catch (ClassNotFoundException e) {
            System.err.println("Error: MySQL JDBC driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error: Unable to connect to database!");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
