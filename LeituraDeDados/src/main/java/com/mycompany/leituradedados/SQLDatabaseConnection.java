package com.mycompany.leituradedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDatabaseConnection {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args)  {
        
        String connectionUrl =
                "jdbc:sqlserver://safely.database.windows.net:1433;"
                        + "database=Safely;"
                        + "user=s_adm@safely;"
                        + "password=@Bestlab;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";
       ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT * FROM usuario";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}