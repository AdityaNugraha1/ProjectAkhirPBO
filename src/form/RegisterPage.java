/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author LEGION
 */
public class RegisterPage extends javax.swing.JFrame {
public Statement st;
public ResultSet rs;
String sql;
Connection cn = koneksi.KoneksiDatabase.BukaKoneksi();
    /**
     * Creates new form RegisterPage
     */
    public RegisterPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rusername = new javax.swing.JTextField();
        rpassword = new javax.swing.JTextField();
        rnama = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1537, 804));
        getContentPane().setLayout(null);
        getContentPane().add(rusername);
        rusername.setBounds(880, 280, 320, 60);
        getContentPane().add(rpassword);
        rpassword.setBounds(880, 370, 320, 60);
        getContentPane().add(rnama);
        rnama.setBounds(880, 460, 320, 60);

        register.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register);
        register.setBounds(570, 600, 690, 90);

        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 610, 220, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/3.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1366, 768);

        setSize(new java.awt.Dimension(1380, 805));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LogRes logres = new LogRes();
        logres.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
        
        try {
             st = cn.createStatement();  
             if (rusername.getText().equals("") || rpassword.getText().equals("") || rnama.getText().equals("")) {
                 JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong", "Validasi Data", JOptionPane.INFORMATION_MESSAGE );
                 return;    
            }
             if (register.getText() == "Register"){
                 String cek = "SELECT * FROM user WHERE username = '" +rusername.getText() + "'";
                 rs = st.executeQuery(cek);
                 if (rs.next()) {
                     JOptionPane.showMessageDialog(null, "Username Sudah Ada Silahkan Ganti Username");
                 }else{
                     sql = "INSERT INTO user (nama, username, password, roles) VALUES ('" +rnama.getText() + "','" + rpassword.getText()+ "','" + rusername.getText() +  "','" + "Pelanggan" + "')";
                     st.executeUpdate(sql);
                     JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                 }
                 
             }          
        } catch (HeadlessException | SQLException error) {
            JOptionPane.showMessageDialog(null,error.getMessage(),"Message",JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_registerActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton register;
    private javax.swing.JTextField rnama;
    private javax.swing.JTextField rpassword;
    private javax.swing.JTextField rusername;
    // End of variables declaration//GEN-END:variables
}
