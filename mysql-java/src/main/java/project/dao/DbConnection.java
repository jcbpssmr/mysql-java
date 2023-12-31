package project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import project.exception.DbException;

public class DbConnection {

private static String HOST = "localhost";
private static String PASSWORD = "projects";
private static int PORT = 3306;
private static String SCHEMA = "projects";
private static String USER = "projects";

public static Connection getConnection() {
	String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s",
			HOST, PORT, SCHEMA, USER, PASSWORD);

    try {
        Connection connection = DriverManager.getConnection(url);
        System.out.println("Connection successful " + url); // Print success message
        return connection;
    } catch (SQLException e) {
        System.err.println("Connection failed: " + e.getMessage()); // Print error message
        throw new DbException("Connection to the database failed", e); // Throw DbException
    }
}

}
