/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LEGION
 */
public class ProsesPengerjaan extends javax.swing.JFrame {
public Statement st, su;
public ResultSet rs, ru;
String sql, update;
Connection cn = koneksi.KoneksiDatabase.BukaKoneksi();
    /**
     * Creates new form ProsesPengerjaan
     */
    public ProsesPengerjaan() {
        initComponents();
        TampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Manage User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 170, 325, 50);

        jButton2.setText("Proses Pengerjaan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 250, 320, 40);

        jButton3.setText("jButton3");
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 320, 320, 50);

        jButton4.setText("jButton4");
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 400, 320, 50);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(900, 20, 300, 60);

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(600, 160, 260, 37);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(600, 200, 260, 37);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(600, 250, 260, 37);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pelanggan" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(600, 290, 260, 40);

        jButton5.setText("Ubah");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(930, 180, 160, 50);

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(930, 260, 160, 50);

        jTable1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Id", "Nama", "Username", "Roles"
            }
        ));
        jTable1.setAutoscrolls(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 420, 950, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/7.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1366, 768);

        setSize(new java.awt.Dimension(1380, 805));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManageUser manageuser = new ManageUser();
        String a = jLabel6.getText();
        manageuser.jLabel2.setText(a);
        manageuser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ProsesPengerjaan prosespengerjaan = new ProsesPengerjaan();
        String a = jLabel6.getText();
        prosespengerjaan.jLabel6.setText(a);
        prosespengerjaan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (jTextField3.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Yang Akan Diubah");
        } else{
            int jawab = JOptionPane.showConfirmDialog(null, "Data Ini Akan Diubah, Lanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (jawab == 0 ){
                try {
                    su = cn.createStatement();
                    update = "UPDATE user SET nama = '" + jTextField2.getText() + "', username = '" + jTextField3.getText() + "', roles = '" + jComboBox1.getSelectedItem().toString() + "' WHERE id = '" + jTextField1.getText() + "'";
                    su.executeUpdate(update);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                    TampilData();
                    Bersih();
                } catch (SQLException ex) {
                    Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (jTextField3.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Yang Akan Dihapus");
        } else{
            int jawab = JOptionPane.showConfirmDialog(null, "Data Ini Akan Dihapus, Lanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (jawab == 0 ){
                try {
                    st = cn.createStatement();
                    sql = "DELETE FROM user WHERE id = '" + jTextField1.getText() + "'";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                    TampilData();
                    Bersih();
                } catch (SQLException ex) {
                    Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    
    private void Bersih(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
      
    }
    
    private void TampilData(){
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM user");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No.");
            model.addColumn("Id");
            model.addColumn("Nama");
            model.addColumn("Username");
            model.addColumn("Roles");
            
            int no = 1;
            
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object[] data = {
                    no ++,
                    rs.getString("id"),
                    rs.getString("nama"),
                    rs.getString("username"),
                    rs.getString("roles"),
                };
                model.addRow(data);
                jTable1.setModel(model);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jComboBox1.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProsesPengerjaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProsesPengerjaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProsesPengerjaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProsesPengerjaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProsesPengerjaan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
