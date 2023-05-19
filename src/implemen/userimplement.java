/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implemen;
import java.util.List;
import model.*;

/**
 *
 * @author LEGION
 */
public interface userimplement {
    public void insert(user user);
    public void update(user user);
    public void delete(int id);
    public List<user> getAll();
}
