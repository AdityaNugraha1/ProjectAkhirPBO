/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import DAOuser.pesananDAO;
import implemen.pesananimplement;
import model.*;
import form.ProsesPengerjaan;
import javax.swing.JTable;

/**
 *
 * @author LEGION
 */
public class pesanancontroller {
   ProsesPengerjaan prosespengerjaan;
   pesananimplement pimplement;
   List<pesanan> pesanan; 
   
    public pesanancontroller(ProsesPengerjaan prosespengerjaan){
        this.prosespengerjaan = prosespengerjaan;
        pimplement = new pesananDAO();
        pesanan = pimplement.getAll();
    } 
    public void isitabelpesanan(){
        pesanan = pimplement.getAll();
        modeltabelpesanan mp = new modeltabelpesanan(pesanan);
        prosespengerjaan.getjTable1().setModel(mp);
    }
}

    
