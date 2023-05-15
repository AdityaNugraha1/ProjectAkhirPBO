/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author LEGION
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class KoneksiDatabase {
   Connection cn;
   public static Connection BukaKoneksi(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/projectakhirpbo", "root", "");
           return cn;
       } catch (ClassNotFoundException | SQLException e) {
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
   }
}
