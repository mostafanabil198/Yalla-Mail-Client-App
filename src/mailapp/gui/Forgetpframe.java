/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailapp.gui;

import java.awt.Color;
import javax.swing.JFrame;
import mailapp.logicCode.ForgetPassword;

/**
 *
 * @author محمد
 */
public class Forgetpframe extends javax.swing.JFrame {

    /**
     * Creates new form Forgetpframe
     */
    int xm;
    int ym;
    public static String[] data;

    public Forgetpframe() {
        initComponents();
        Email.setBackground(new Color(0, 0, 0, 20));
        Question.setBackground(new Color(0, 0, 0, 20));
        Answer.setBackground(new Color(0, 0, 0, 20));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        popupMenu1 = new java.awt.PopupMenu();
        showpb = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Question = new javax.swing.JTextField();
        Answer = new javax.swing.JTextField();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        bar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showpb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showpb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpbMouseClicked(evt);
            }
        });
        getContentPane().add(showpb, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 605, 168, 92));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 160, 50));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 250, 60));

        Email.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Email.setBorder(null);
        Email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Email.setOpaque(false);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 120, 530, 80));

        Question.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Question.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Question.setBorder(null);
        Question.setOpaque(false);
        getContentPane().add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 286, 529, 80));

        Answer.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Answer.setBorder(null);
        Answer.setOpaque(false);
        getContentPane().add(Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 451, 529, 81));

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 1, 18, 24));

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 1, 18, 24));

        bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barMouseDragged(evt);
            }
        });
        bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barMousePressed(evt);
            }
        });
        getContentPane().add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 711, 31));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mailapp/gui/ForgetPassword.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 736));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showpbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpbMouseClicked
        ForgetPassword fp = new ForgetPassword();
        if (fp.answer(Answer.getText(), data)) {
            Showpasswordframe s = new Showpasswordframe();
            s.setVisible(true);
        } else {
            jLabel3.setText("WRONG ANSER");
        }

    }//GEN-LAST:event_showpbMouseClicked

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        // TODO add your handling code here:
        xm = evt.getX();
        ym = evt.getY();
    }//GEN-LAST:event_barMousePressed

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xm, y - ym);
    }//GEN-LAST:event_barMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ForgetPassword fp = new ForgetPassword();
        data = fp.Check(Email.getText());
        if (data == null) {
            jLabel3.setText("Wrong Email");
        } else {
            Question.setText(data[0]);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Forgetpframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgetpframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgetpframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgetpframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgetpframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Question;
    private javax.swing.JLabel bar;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel minimize;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JLabel showpb;
    // End of variables declaration//GEN-END:variables
}