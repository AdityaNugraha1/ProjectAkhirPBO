/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author LEGION
 */
public class modeltabeluser extends AbstractTableModel{
    
    List<user> user;
    public modeltabeluser(List<user>user){
        this.user = user;
    }
    
    @Override
    public int getRowCount() {
        return user.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Username";
            case 3:
                return "Password";
            case 4:
                return "Roles";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return user.get(row).getId();
            case 1:
                return user.get(row).getNama();
            case 2:
                return user.get(row).getUsername();
            case 3:
                return user.get(row).getPassword();
            case 4:
                return user.get(row).getRoles();
            default:
                return null;
        }
    }
    
}
