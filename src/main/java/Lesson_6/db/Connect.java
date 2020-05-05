package Lesson_6.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private static Connection connection;

    public static Connection getConnection() {

        if (connection == null) {
            try {
                String url = "jdbc:sqlite:coins.sqlite";
                connection = DriverManager.getConnection(url);

                System.out.println("Connection established");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
