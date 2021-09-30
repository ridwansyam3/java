/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sederhana;

import java.sql.Connection;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Siswa
 */
public class Sederhana {
static Connection koneksisederhana;
    ResultSet res;
    PreparedStatement ps;
public static Connection getConnection(){
  
    try{
        koneksisederhana = DriverManager.getConnection("jdbc:mysql://localhost/duniarental","root","");
       
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"Koneksi Gagal");
    }
    return koneksisederhana;
}

    
}
