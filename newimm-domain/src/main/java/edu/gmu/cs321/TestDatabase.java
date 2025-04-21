/*
 * Sample file from class
 */

package edu.gmu.cs321;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;

public class TestDatabase {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/cs321";
    private static final String USER = "root";
    private static final String PASSWORD = "RAJIraji52*"; // replace with your MySQL password

    // JDBC variables for opening, closing connection and statement
    private static Connection connection;

    // Method to establish connection
    public static Connection getConnection() {
        try {
            // Load and register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to create a new user
    public static void createImmigrant(Immigrant imm) {
        String insertQuery = "insert into immigrant (id, first, last, dob) VALUES (?, ?, ?, ?)";

        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(insertQuery)) {

            stmt.setInt(1, imm.getID());
            stmt.setString(2, imm.getFirstName());
            stmt.setString(3, imm.getLastName());
            stmt.setDate(4, imm.getDoB());
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Immigrant added successfully.");
            } else {
                System.out.println("Error adding immigrant.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to select all users from the database
    public static ArrayList<Immigrant> selectImmigrants() {
        ArrayList<Immigrant> results = new ArrayList<Immigrant>();

        String selectQuery = "SELECT * FROM Immigrant";

        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(selectQuery)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("first");
                String last = rs.getString("last");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + " " + last + ", Email: " + email);
                results.add(new Immigrant(name, last, id, email));
            }
            return results;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to update a user's email based on user ID
    public static void updateImmigrant(Immigrant immigrant) {
        String updateQuery = "UPDATE immigrant SET first = ?, last = ? WHERE id = ?";

        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(updateQuery)) {

            stmt.setString(1, immigrant.getFirstName());
            stmt.setString(2, immigrant.getLastName());
            stmt.setInt(3, immigrant.getID());
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User updated successfully.");
            } else {
                System.out.println("User not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create new users
        // createImmigrant(106, "First John", "First Doe", Date.valueOf("2003-01-01"));
        Immigrant test = new Immigrant("Third John", "Third Joe", 106, Date.valueOf("2007-01-01"));
        //createImmigrant(106, "Third John", "Third Doe", Date.valueOf("2007-01-01"));
        createImmigrant(test);

        // Select and display all users
        System.out.println("All users in the database:");
        selectImmigrants();

        // Update user's email
        //updateImmigrant(106, "New John", "New Last");
        updateImmigrant(new Immigrant("New John", "New Last", 106));

        // Select and display all users after update
        System.out.println("All users after update:");
        selectImmigrants();
    }

}
