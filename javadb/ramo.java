import java.sql.*;

public class ramo {
    public static void main(String[] args) {
        // Declare the JDBC objects.
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish the connection.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://DESKTOP-SUICDE4/SQLEXPRESS03;databaseName=bankaMusteriDB;trustedConnections=true");

            // Create and execute an SQL statement that returns some data.
            String SQL = "SELECT * FROM TblMusteri";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }
        }

        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            if (resultSet != null)
                try {
                    resultSet.close();
                } catch (Exception e) {
                }
            if (statement != null)
                try {
                    statement.close();
                } catch (Exception e) {
                }
            if (connection != null)
                try {
                    connection.close();
                } catch (Exception e) {
                }
        }
    }
}
