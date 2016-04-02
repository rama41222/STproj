/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rama41222
 */

import java.sql.*;
import javax.swing.*;

public class mysqlConnect {

    private static Connection conn = null;
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    private static final String DB_URL = "jdbc:mysql://localhost:8889/Inventory";

    //  Database credentials
     private static final String USER = "root";
     private static final String PASS = "root";
    
    public static Connection connDb(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            JOptionPane.showMessageDialog(null, "Connected to the database");
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.exit(0);
            return null;
        }
    
    }
   
    
}
