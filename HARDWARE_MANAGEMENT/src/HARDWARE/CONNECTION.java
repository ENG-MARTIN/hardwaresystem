/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HARDWARE;
import java.sql.*;
import javax.swing.JOptionPane;

public class CONNECTION {
    Connection conn;
    public static Connection connectsqlite(){
       Connection conn;
        try {
            String url="jdbc:Sqlite:HARDWARE_DATABASE.db";
            conn=DriverManager.getConnection(url);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
