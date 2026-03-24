package br.com.ecommerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection connection;

    private ConnectionFactory() {}

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ecommerce",
                "root",
                "senha"
            );
        }
        return connection;
    }
}
