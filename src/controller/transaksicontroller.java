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
import form.Transaksi;
import javax.swing.JTable;
/**
 *
 * @author LEGION
 */
public class transaksicontroller {
    Transaksi transaksi;
    pesananimplement pimplement;
    List<pesanan> pesanan; 
    
    public transaksicontroller(Transaksi transaksi){
        this.transaksi = transaksi;
        pimplement = new pesananDAO();
        pesanan = pimplement.getAll();
    } 
    public void caritransaksi(){
        pesanan pesan = new pesanan();
        pesan.setId_user(Integer.parseInt(transaksi.getjTextField1().getText()));
        pesanan = pimplement.cariid(pesan);
        modeltabelpesanan pp = new modeltabelpesanan(pesanan);
        transaksi.getjTable1().setModel(pp);
    }
    
}
