/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myProject;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class DB_Connector {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/office_system","root","Oracle@1234");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
