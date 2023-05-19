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
    public void insertpesanan(){
        pesanan Pesanan = new pesanan();
        Pesanan.setId(Integer.parseInt(prosespengerjaan.getjTextField1().getText()));
        Pesanan.setId_user(Integer.parseInt(prosespengerjaan.getjTextField2().getText()));
        Pesanan.setNama(prosespengerjaan.getjTextField4().getText());
        Pesanan.setAlamat(prosespengerjaan.getjTextField5().getText());
        Pesanan.setTelepon(Integer.parseInt(prosespengerjaan.getjTextField6().getText()));
        Pesanan.setPaket(prosespengerjaan.getjTextField7().getText());
        Pesanan.setBerat(Integer.parseInt(prosespengerjaan.getjTextField8().getText()));
        Pesanan.setTotal(Integer.parseInt(prosespengerjaan.getjTextField9().getText()));
        Pesanan.setStatus("Sedang_Proses_Pengerjaan");
        pimplement.insert(Pesanan);
    }
    public void updatepesanan(){
        pesanan Pesanan = new pesanan();
        Pesanan.setId(Integer.parseInt(prosespengerjaan.getjTextField1().getText()));
        Pesanan.setId_user(Integer.parseInt(prosespengerjaan.getjTextField2().getText()));
        Pesanan.setNama(prosespengerjaan.getjTextField4().getText());
        Pesanan.setAlamat(prosespengerjaan.getjTextField5().getText());
        Pesanan.setTelepon(Integer.parseInt(prosespengerjaan.getjTextField6().getText()));
        Pesanan.setPaket(prosespengerjaan.getjTextField7().getText());
        Pesanan.setBerat(Integer.parseInt(prosespengerjaan.getjTextField8().getText()));
        Pesanan.setTotal(Integer.parseInt(prosespengerjaan.getjTextField9().getText()));
        Pesanan.setStatus(prosespengerjaan.getjComboBox1().getSelectedItem().toString());
        pimplement.update(Pesanan);
    }
    public void delete(){
        int id = Integer.parseInt(prosespengerjaan.getjTextField1().getText());
        pimplement.delete(id);
    }
}

    
