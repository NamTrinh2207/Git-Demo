package com.example.demogitnhom3.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
    public class Doanjava {
        public Connection getConnection() {
            String jdbcURL = "jdbc:mysql://localhost:3306/bth1jdbc";
            String jdbcUsername = "root";
            String jdbcPassword = "10061";
            Connection connection = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
                System.out.println("connection successfully");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return connection;
        }
    }


