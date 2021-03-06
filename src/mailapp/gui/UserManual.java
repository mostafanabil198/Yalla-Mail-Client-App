/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailapp.gui;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static mailapp.gui.Inbox.user;

/**
 *
 * @author arabtech
 */
public class UserManual extends javax.swing.JFrame {

    int counter = 0;

    /**
     * Creates new form UserManual
     */
    public UserManual() {
        try {
            initComponents();
            Image img = ImageIO.read(new File("img\\user manual\\0.jpg"));
            Image pic = img.getScaledInstance(1230, 770, Image.SCALE_AREA_AVERAGING);
            jLabel1.setIcon(new ImageIcon(pic));
            jLabel1.setSize(1230, 770);
        } catch (IOException ex) {
            Logger.getLogger(UserManual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mailapp/gui/prev1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 670, 50, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mailapp/gui/next1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 670, 50, 60));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (counter + 1 < 24) {
            try {
                counter++;
                Image img = ImageIO.read(new File("img\\user manual\\" + counter + ".jpg"));
                Image pic = img.getScaledInstance(1230, 770, Image.SCALE_AREA_AVERAGING);
                jLabel1.setIcon(new ImageIcon(pic));
                jLabel1.setSize(1230, 770);
            } catch (IOException ex) {
                Logger.getLogger(UserManual.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                counter = 0;
                Image img = ImageIO.read(new File("img\\user manual\\" + counter + ".jpg"));
                Image pic = img.getScaledInstance(1230, 770, Image.SCALE_AREA_AVERAGING);
                jLabel1.setIcon(new ImageIcon(pic));
                jLabel1.setSize(1230, 770);
            } catch (IOException ex) {
                Logger.getLogger(UserManual.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (counter - 1 >= 0) {
            try {
                counter--;
                Image img = ImageIO.read(new File("img\\user manual\\" + counter + ".jpg"));
                Image pic = img.getScaledInstance(1230, 770, Image.SCALE_AREA_AVERAGING);
                jLabel1.setIcon(new ImageIcon(pic));
                jLabel1.setSize(1230, 770);
            } catch (IOException ex) {
                Logger.getLogger(UserManual.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                counter = 23;
                Image img = ImageIO.read(new File("img\\user manual\\" + counter + ".jpg"));
                Image pic = img.getScaledInstance(1230, 770, Image.SCALE_AREA_AVERAGING);
                jLabel1.setIcon(new ImageIcon(pic));
                jLabel1.setSize(1230, 770);
            } catch (IOException ex) {
                Logger.getLogger(UserManual.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(UserManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
