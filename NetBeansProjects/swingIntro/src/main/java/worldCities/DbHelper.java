/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package worldCities;

import java.sql.*;

/**
 *
 * @author RamazanFırat
 */
public class DbHelper {
    private String userName = "root";
    private String pass = "12345";
    private String DbURI = "jdbc:mysql://localhost:3306/sakila?useSSL=false&serverTimezone=UTC";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(DbURI, userName, pass);
    }
    
    public void showErrorMessage(SQLException e){
        System.out.println("ERROR : "+e.getMessage());
    }
    
}
