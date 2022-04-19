package com.endava.apache;

import com.endava.google.GsonExample;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBConnection {

    private static final Logger LOGGER = LogManager.getLogger(DBConnection.class);

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://bhdtest.endava.com:3306/petclinic","root","root");

        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT id, first_name FROM owners WHERE ID = 8");

        while (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");

            LOGGER.info("{} {}", id, firstName);
        }

        LOGGER.info(resultSet);
    }
}
