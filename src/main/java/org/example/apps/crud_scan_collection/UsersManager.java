//package org.example.apps.crud_scan_collection;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class UsersManager {
//    public static void main(String[] args) {
//        String jdbcUrl = "jdbc:mySql://localhost:3306/EmployeeDB";
//        String username = "root";
//        String password = "mysql5568";
//
//        try {
//            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
//
//            if (connection != null) {
//                System.out.println("Connected to database");
//
//                connection.close();
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}