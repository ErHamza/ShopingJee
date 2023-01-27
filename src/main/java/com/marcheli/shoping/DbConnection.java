package com.marcheli.shoping;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    private static Connection connection;


    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermache", "root","");
            System.out.println("alive");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

        public static Connection getConnection() {
            return connection;
        }



}
