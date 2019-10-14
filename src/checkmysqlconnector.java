
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP-NPC
 */
public class checkmysqlconnector {
    public static void main(String[] args){
        String className="com.mysql.jdbc.Driver";
        try {
            Class.forName(className);
            System.out.println("Driver Loaded Successfully");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Failed To Loaded Successfully");
            System.out.println(ex.getMessage());
        }
    }
}
