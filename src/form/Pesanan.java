/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import java.awt.HeadlessException;
import form.ManageUser;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author MUHAMMAD ISHANUDDIN
 */
public class Pesanan extends javax.swing.JFrame {
    private String tot;
    public Statement st, sp;
    public ResultSet rs, rp;
    String sql;
    int hasil;
    String vpaket;
    /**
     * Creates new form Pesanan
     */
    
    Connection cn = koneksi.KoneksiDatabase.BukaKoneksi();
    public Pesanan() {
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

        jLabel7 = new javax.swing.JLabel();
        paket = new javax.swing.JComboBox<>();
        telepon = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        berat = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1010, 370, 190, 80);

        paket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuci+Setrika Reguler", "Cuci+Setrika Express", "Cuci+Setrika Full Express" }));
        paket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paketActionPerformed(evt);
            }
        });
        getContentPane().add(paket);
        paket.setBounds(920, 300, 210, 60);

        telepon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleponActionPerformed(evt);
            }
        });
        getContentPane().add(telepon);
        telepon.setBounds(490, 440, 180, 40);

        nama.setEditable(false);
        nama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama);
        nama.setBounds(490, 320, 180, 40);

        alamat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat);
        alamat.setBounds(490, 380, 180, 40);

        berat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        berat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beratActionPerformed(evt);
            }
        });
        getContentPane().add(berat);
        berat.setBounds(920, 390, 80, 40);

        total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(total);
        total.setBounds(920, 450, 150, 40);

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("PESAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(770, 520, 360, 50);

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("KEMBALI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(630, 670, 140, 50);

        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 30, 110, 70);

        jButton3.setBackground(new java.awt.Color(255, 51, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(270, 520, 360, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/10.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1366, 768);

        setSize(new java.awt.Dimension(1382, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void teleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleponActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = String.valueOf(jLabel2.getText());
        String vnama = String.valueOf(nama.getText());
        String valamat = String.valueOf(alamat.getText());
        String vberat = String.valueOf(berat.getText());
        String vtelepon = String.valueOf(telepon.getText());
        String vtotal = String.valueOf(total.getText());
        System.out.println("vtotal" +vtotal);

        try {
            
            String sql = "INSERT INTO customer (id_user, nama, alamat, telepon, paket, berat, total, status) VALUES ('" + id + "','" + vnama + "', '" + valamat + "', '" + vtelepon + "', '" + vpaket + "', '" + vberat + "', '" + vtotal + "', 'Sedang_Proses_Pengerjaan')";
            Statement s = cn.createStatement();
            s.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Pesanan berhasil ditambahkan");
            dispose();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void beratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beratActionPerformed
        // TODO add your handling code here:
        Object selectedValue = paket.getSelectedItem();
        if (selectedValue != null) {
            vpaket = selectedValue.toString();
            System.out.println("Selected value: " + vpaket);
        } else {
            System.out.println("No value selected");
        }
        String temp = berat.getText();
        try {
            int tempInt = Integer.parseInt(temp);
            if (selectedValue != null) {
                String value = selectedValue.toString();
                System.out.println("Selected value: " + value);
            }
            if (selectedValue == "Cuci+Setrika Reguler") {
                hasil = tempInt * 7500;
                String tot = Integer.toString(hasil);
                total.setText(tot);
            }
            if (selectedValue == "Cuci+Setrika Express") {
                hasil = tempInt * 14000;
                String tot = Integer.toString(hasil);
                total.setText(tot);
            }
            if (selectedValue == "Cuci+Setrika Full Express") {
                hasil = tempInt * 20000;
                String tot = Integer.toString(hasil);
                total.setText(tot);
            } else {
                System.out.println("No value selected");
            }
        } catch (Exception e) {
            System.out.println("error");
        }

    }//GEN-LAST:event_beratActionPerformed

    private void paketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paketActionPerformed

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        // TODO add your handling code here:
        jLabel2.setVisible(false);
        
    }//GEN-LAST:event_jLabel2AncestorAdded

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Dashboard dashboard = new Dashboard();
        String a = jLabel2.getText();
        String b = nama.getText();
        dashboard.jLabel2.setText(b);
        dashboard.jLabel4.setText(a);
        dashboard.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Pesanan berhasil direset");
        alamat.setText("");
        telepon.setText("");
        berat.setText("");
        total.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField berat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> paket;
    private javax.swing.JTextField telepon;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
