package lab5.controller;

import java.sql.*;

public class DatabaseOutput {
    static final String DB_URL = "jdbc:sqlserver://localhost;databaseName=University;integratedSecurity=true";

    public static void getTable(String tableName) {
        String query = "SELECT * FROM " + tableName;
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
        ) {
            while (rs.next()) {
                System.out.println("Прізвище: " + rs.getString("Last Name"));
                System.out.println("Ім'я: " + rs.getString("First Name"));
                System.out.println("По батькові: " + rs.getString("Patronymic"));
                System.out.println("Дата народження: " + rs.getString("Date of birth"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}