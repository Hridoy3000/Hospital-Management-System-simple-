/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP-NPC
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class connector {
    public static Connection getConnection() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
     Connection cn=(Connection)
             DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
     return cn;
    }
}
