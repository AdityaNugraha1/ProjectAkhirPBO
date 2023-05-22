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
public class modeltabelpesanan extends AbstractTableModel{
    
    List<pesanan>pesanan;
    public modeltabelpesanan(List<pesanan>pesanan){
        this.pesanan = pesanan;
    }
    
    @Override
    public int getRowCount() {
        return pesanan.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }
        
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Id User";
            case 2:
                return "Nama";
            case 3:
                return "Alamat";
            case 4:
                return "Telepon";
            case 5:
                return "Paket";
            case 6:
                return "Berat";
            case 7:
                return "Total";
            case 8:
                return "Status";
            default:
                return null;
        }
    }
    @Override
    public Object getValueAt(int row, int column) {
       switch(column){
            case 0:
                return pesanan.get(row).getId();
            case 1:
                return pesanan.get(row).getId_user();
            case 2:
                return pesanan.get(row).getNama();
            case 3:
                return pesanan.get(row).getAlamat();
            case 4:
                return pesanan.get(row).getTelepon();
            case 5:
                return pesanan.get(row).getPaket();
            case 6:
                return pesanan.get(row).getBerat();
            case 7:
                return pesanan.get(row).getTotal();
            case 8:
                return pesanan.get(row).getStatus();
            default:
                return null;
        } 
    }
}
