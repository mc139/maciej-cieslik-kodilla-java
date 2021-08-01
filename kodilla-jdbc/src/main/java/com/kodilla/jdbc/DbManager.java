package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {

    private Connection conn;                                          // [1]
    private static DbManager dbManagerInstance;                       // [2]

    private DbManager() throws SQLException {                         // [3]
        Properties connectionProps = new Properties();                 // [4]
        connectionProps.put("user", "root");                   // [5]
        connectionProps.put("password", "12345678");           // [6]
        conn = DriverManager.getConnection(                            // [7]
                "jdbc:mysql://localhost:3306/kodilla_course?serverTimezone=Europe/London" +  // [8]
                        "&useSSL=False&allowPublicKeyRetrieval=true",                                             // [9]
                connectionProps);                                              // [10]
    }                                                                 // [11]

    public static DbManager getInstance() throws SQLException {       // [12]
        if (dbManagerInstance == null) {                               // [13]
            dbManagerInstance = new DbManager();                        // [14]
        }                                                              // [15]
        return dbManagerInstance;                                      // [16]
    }                                                                 // [17]

    public Connection getConnection() {                               // [18]
        return conn;                                                   // [19]
    }                                                                 // [20]
}
