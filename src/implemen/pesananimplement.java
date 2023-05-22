/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implemen;

import java.util.List;
import model.pesanan;

/**
 *
 * @author LEGION
 */
public interface pesananimplement {
    public void insert(pesanan pesanan);
    public void update(pesanan pesanan);
    public void delete(int id);
    public List<pesanan> getAll();
    public List<pesanan> cariid(pesanan pesan);
}
