package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //GIVEN
        DbManager dbManager = DbManager.getInstance();

        //WHEN
        String sqlQuery = "SELECT U.FIRSTNAME,U.LASTNAME,COUNT(*) AS POST_NUMBER\n" +
                "FROM POSTS P\n" +
                "JOIN USERS U ON P.USER_ID = U.ID\n" +
                "GROUP BY USER_ID\n" +
                "HAVING COUNT(*) >=2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //THEN
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + "," +
                    rs.getString("LASTNAME") + ", " +
                    rs.getInt("POST_NUMBER"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(2, counter);

    }
}
