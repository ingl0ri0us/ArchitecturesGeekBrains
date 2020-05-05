package Lesson_6.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbObjects {

    public static void createTable(Connection connection) {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS coins ( id integer PRIMARY KEY, coinName varchar (64),rank integer, balance double precision);";
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void dropTable(Connection connection) {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String sql = "DROP TABLE IF EXISTS coins;";
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
