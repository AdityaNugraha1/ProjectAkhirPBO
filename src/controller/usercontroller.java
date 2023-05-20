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
import form.ManageUser;
import form.RegisterPage;
import javax.swing.JTable;

/**
 *
 * @author LEGION
 */
public class usercontroller {
  ManageUser manageuser;
  RegisterPage register;
  userimplement uimplement;
  List<user> user;
    
    public usercontroller(ManageUser manageuser){
        this.manageuser = manageuser;
        uimplement = new userDAO();
        user = uimplement.getAll();
    }
    public usercontroller(RegisterPage register){
        this.register = register;
        uimplement = new userDAO();
        user = uimplement.getAll();
    }
    public void isitabelmanageuser(){
        user = uimplement.getAll();
        modeltabeluser mu = new modeltabeluser(user);
        manageuser.getjTable1().setModel(mu);
    }
    
    public void insertmanageuser(){
        user User = new user();
        User.setNama(manageuser.getjTextField2().getText());
        User.setUsername(manageuser.getjTextField3().getText());
        User.setPassword(manageuser.getjTextField4().getText());
        User.setRoles(manageuser.getjComboBox1().getSelectedItem().toString());
        uimplement.insert(User);
    }
    
    public void updatetabelmanageuser(){
        user User = new user();
        User.setNama(manageuser.getjTextField2().getText());
        User.setUsername(manageuser.getjTextField3().getText());
        User.setPassword(manageuser.getjTextField4().getText());
        User.setRoles(manageuser.getjComboBox1().getSelectedItem().toString());
        User.setId(Integer.parseInt(manageuser.getjTextField1().getText()));
        uimplement.update(User);
    }
    
    public void delete(){
        int id = Integer.parseInt(manageuser.getjTextField1().getText());
        uimplement.delete(id);
    }
}
