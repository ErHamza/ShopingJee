package dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static Connection connection;


    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarche", "root", "ing");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

        public static Connection getConnection() {
            return connection;
        }



}
