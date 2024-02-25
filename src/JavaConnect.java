/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jagad
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
    static Connection con=null;
    
    public static Connection connecrDb(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jagadeesh","2001s");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
}
