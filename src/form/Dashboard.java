/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import java.sql.*;
import javax.swing.JTextField;
import form.LoginPage;

/**
 *
 * @author LEGION
 */
public class Dashboard extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public ResultSet ra;
    String sql;
    Connection cn = koneksi.KoneksiDatabase.BukaKoneksi();
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("BUAT PESANAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 330, 320, 50);

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("CEK PESANAN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(460, 420, 320, 50);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(890, 60, 310, 100);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(640, 180, 350, 70);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("LOG OUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1190, 20, 160, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/9.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1366, 768);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 90, 120, 80);

        setSize(new java.awt.Dimension(1380, 805));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Pesanan pesan = new Pesanan();
        String b = jLabel2.getText();
        String a =jLabel4.getText();
        pesan.jLabel2.setText(a);
        pesan.nama.setText(b);
        pesan.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LogRes logres = new LogRes();
        logres.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Transaksi transaksi = new Transaksi();
        String b = jLabel2.getText();
        String a =jLabel4.getText();
        transaksi.jTextField1.setText(a);
        transaksi.jLabel1.setText(b);
        transaksi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
