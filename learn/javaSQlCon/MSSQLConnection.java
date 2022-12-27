import java.sql.*;

public class MSSQLConnection {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establish the connection
            // Replace "server_name" with the name of your server
            // Replace "database_name" with the name of your database
            // Replace "username" and "password" with your username and password
            String connectionUrl = "jdbc:sqlserver://DESKTOP-SUICDE4/SQLEXPRESS03:1433;databaseName=bankaMusteriDB;";
            Connection con = DriverManager.getConnection(connectionUrl);

            System.out.println("Connection established");

            // Close the connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}