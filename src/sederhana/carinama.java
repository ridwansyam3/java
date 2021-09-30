/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author yan's
 */
public class carinama {
Connection con=null; 
    ResultSet res;
 PreparedStatement ps;
 public ResultSet chass(String s){
 
 try{
     con = DriverManager.getConnection("jdbc:mysql://localhost/duniarental","root","");
     ps=con.prepareStatement("select * from datacustomer where Nama = ?");
     ps.setString(1,s);
     res=ps.executeQuery();
 }catch(Exception Ex){
     JOptionPane.showMessageDialog(null, Ex.getMessage());
 }    return res;

 }

 
}