/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOuser;
import implemen.pesananimplement;
import implemen.userimplement;
import java.sql.*;
import java.util.*;
import koneksi.KoneksiDatabase;
import model.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LEGION
 */
public class pesananDAO implements pesananimplement{
    Connection connection;
    
    final String select = "SELECT * FROM customer";
    final String insert = "INSERT INTO customer(id_user,nama,alamat,telepon,paket,berat,total,status) VALUES(?,?,?,?,?,?,?,?);";
    final String update = "UPDATE customer set id_user=?, nama=?, alamat=?, telepon=?, paket=?, berat=?, total=?, status=? WHERE id=?";
    final String delete = "DELETE from customer WHERE id=?";
    final String cariid = "SELECT * FROM customer WHERE id_user = ?";
    
    public pesananDAO(){
        connection = KoneksiDatabase.BukaKoneksi();
    }

    @Override
    public void insert(pesanan pesanan) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, pesanan.getId_user());
            statement.setString(2, pesanan.getNama());
            statement.setString(3, pesanan.getAlamat());
            statement.setInt(4, pesanan.getTelepon());
            statement.setString(5, pesanan.getPaket());
            statement.setInt(6, pesanan.getBerat());
            statement.setInt(7, pesanan.getTotal());
            statement.setString(8, pesanan.getStatus());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                pesanan.setId(rs.getInt(1));
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                 ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(pesanan pesanan) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setInt(1, pesanan.getId_user());
            statement.setString(2, pesanan.getNama());
            statement.setString(3, pesanan.getAlamat());
            statement.setInt(4, pesanan.getTelepon());
            statement.setString(5, pesanan.getPaket());
            statement.setInt(6, pesanan.getBerat());
            statement.setInt(7, pesanan.getTotal());
            statement.setString(8, pesanan.getStatus());
            statement.setInt(9, pesanan.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                 ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                 ex.printStackTrace();
            }
        }
    }

    @Override
    public List<pesanan> getAll() {
        List<pesanan> pesanan = null;
        try {
            pesanan = new ArrayList<pesanan>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                pesanan Pesanan = new pesanan();
                Pesanan.setId(rs.getInt("id"));
                Pesanan.setId_user(rs.getInt("id_user"));
                Pesanan.setNama(rs.getString("nama"));
                Pesanan.setAlamat(rs.getString("alamat"));
                Pesanan.setTelepon(rs.getInt("telepon"));
                Pesanan.setPaket(rs.getString("paket"));
                Pesanan.setBerat(rs.getInt("berat"));
                Pesanan.setTotal(rs.getInt("total"));
                Pesanan.setStatus(rs.getString("status"));
                pesanan.add(Pesanan);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(userDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pesanan;
    }

    @Override
    public List<pesanan> cariid(pesanan pesanan) {
        List<pesanan> p = null;
        try {
            p = new ArrayList<pesanan>();
            PreparedStatement statement = connection.prepareStatement(cariid);
            statement.setInt(1,pesanan.getId_user());
            ResultSet rs = statement.executeQuery();

            while(rs.next()) {
                pesanan Pesanan = new pesanan();
                Pesanan.setId(rs.getInt("id"));
                Pesanan.setId_user(rs.getInt("id_user"));
                Pesanan.setNama(rs.getString("nama"));
                Pesanan.setAlamat(rs.getString("alamat"));
                Pesanan.setTelepon(rs.getInt("telepon"));
                Pesanan.setPaket(rs.getString("paket"));
                Pesanan.setBerat(rs.getInt("berat"));
                Pesanan.setTotal(rs.getInt("total"));
                Pesanan.setStatus(rs.getString("status"));
                p.add(Pesanan);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            Logger.getLogger(pesananDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return p;
    }
}