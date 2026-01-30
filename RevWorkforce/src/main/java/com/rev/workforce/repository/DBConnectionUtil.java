package com.rev.workforce.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/rev_workforce";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Root@1323";

    private DBConnectionUtil() {
        // prevent object creation
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
