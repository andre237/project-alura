package design_patterns_2.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {

        Connection connection = null;

        try {
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/teste", "root", "");
        } catch (SQLException e) {
            System.out.println("Unable to connect to database");
        }

        return connection;
    }
}
