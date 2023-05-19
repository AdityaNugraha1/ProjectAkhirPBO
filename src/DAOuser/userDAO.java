/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOuser;
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
public class userDAO implements userimplement{
    Connection connection;
    
    final String select = "SELECT * FROM user";
    final String insert = "INSERT INTO user('nama','username','password','roles') VALUES('?','?','?','?')";
    final String update = "UPDATE user set nama=?, username=?, password=?, roles=? WHERE id=?";
    final String delete = "DELETE from user WHERE id=?";
    public userDAO(){
        connection = KoneksiDatabase.BukaKoneksi();
    }

    @Override
    public void insert(user user) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getNama());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getRoles());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                user.setId(rs.getInt(1));
                
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
    public void update(user user) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, user.getNama());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getRoles());
            statement.setInt(5, user.getId());
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
    public List<user> getAll() {
        List<user> user = null;
        try {
            user = new ArrayList<user>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                user User = new user();
                User.setId(rs.getInt("id"));
                User.setNama(rs.getString("nama"));
                User.setUsername(rs.getString("username"));
                User.setPassword(rs.getString("password"));
                User.setRoles(rs.getString("roles"));
                user.add(User);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(userDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
}
