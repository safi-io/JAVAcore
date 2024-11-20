package com.sqlConnection;

import java.sql.*;

public class main {
    public static void main(String args[]) {
        try {
            // Connect to database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/school_management",
                    "root",
                    "your_password"
            );

            // Create and execute query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, first_name FROM students");

            // Print results
            while (rs.next()) {
                System.out.printf("ID: %d, Name: %s%n",
                        rs.getInt("id"),           // First column
                        rs.getString("first_name")  // Second column
                );
            }

            // Close connections
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}