/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import DAOuser.userDAO;
import implemen.userimplement;
import model.*;
import form.RegisterPage;
import javax.swing.JTable;
/**
 *
 * @author LEGION
 */
public class registercontroller {
    RegisterPage registerpage;
    userimplement uimplement;
    List<user> user;
    
    public registercontroller(RegisterPage registerpage){
        this.registerpage = registerpage;
        uimplement = new userDAO();
        user = uimplement.getAll();
    } 
    public void insertregister(){
        user User = new user();
        User.setNama(registerpage.getRnama().getText());
        User.setUsername(registerpage.getRusername().getText());
        User.setPassword(registerpage.getRpassword().getText());
        User.setRoles("Pelanggan");
        uimplement.insertregister(User);
    }
    
    public boolean ceknama() {
        String nama = registerpage.getRnama().getText();
        return uimplement.ceknama(nama);
    }
    
}
