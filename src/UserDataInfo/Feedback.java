/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDataInfo;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Shlok
 */
public class Feedback extends javax.swing.JFrame {
Connection cn;
Statement st;
    /**
     * Creates new form Feedback
     */
    public Feedback() {
        initComponents();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata?zeroDateTimeBehavior=convertToNull","root","");
        st=(com.mysql.jdbc.Statement) cn.createStatement();
        //JOptionPane.showMessageDialog(null,"WELCOME TO THE DATABASE");
        }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null,"Not Connected");
    
    
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        app = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ui = new javax.swing.JComboBox<>();
        sec = new javax.swing.JComboBox<>();
        ovr = new javax.swing.JComboBox<>();
        vf = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));
        setForeground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("APP RATING");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("OVERALL RATING");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("UI RATING");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("SECURITY RATING");

        jToggleButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shlok\\Downloads\\feedback.png")); // NOI18N
        jToggleButton1.setText("SUBMIT");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        app.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        app.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EXCELLENT", "BEST", "GOOD", "AVERAGE" }));
        app.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("USERNAME");

        ui.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ui.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EXCELLENT", "BEST", "GOOD", "AVERAGE" }));
        ui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiActionPerformed(evt);
            }
        });

        sec.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        sec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EXCELLENT", "BEST", "GOOD", "AVERAGE" }));
        sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secActionPerformed(evt);
            }
        });

        ovr.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ovr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EXCELLENT", "BEST", "GOOD", "AVERAGE" }));
        ovr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovrActionPerformed(evt);
            }
        });

        vf.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        vf.setText("VIEW FEEDBACKS");
        vf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vfActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shlok\\Downloads\\feedback (1).png")); // NOI18N
        jLabel7.setText("THANK YOU FOR SPARING YOUR VALUABLE TIME");

        user.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vf, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ovr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(app, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(app, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ovr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(vf, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
                                
       if(user.getText().isEmpty())
       {
          JOptionPane.showMessageDialog(null,"Please enter your username");
        }
        else
        {
            
           
        try{
            
            
           
                                    loginpage lp=new loginpage();
                                    Display dp=new Display();
                                 
                                   
       String sq="insert into feedback(Username, App_Rating, UI_Rating, Security_Rating, Overall_Rating) values(?,?,?,?,?)";
                                    PreparedStatement pt = cn.prepareStatement(sq);
                                    pt.setString(1, user.getText());
                                    pt.setString(2, (String) app.getSelectedItem());
                                   pt.setString(3, (String) ui.getSelectedItem());
                                      pt.setString(4, (String) sec.getSelectedItem());
                                       pt.setString(5, (String) ovr.getSelectedItem());
                                       pt.executeUpdate();
                                        JOptionPane.showMessageDialog(null,"THANK YOU FOR YOUR VALUABLE FEEDBACK");
                                }
                                catch(SQLException e)
                                {
                                    JOptionPane.showMessageDialog(null,e);
                                }
                                catch(java.lang.NumberFormatException e)
                                {
                                    JOptionPane.showMessageDialog(null,"PLEASE INSERT A NUMBER FROM 1-10");
                                }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void appActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appActionPerformed

    private void uiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiActionPerformed

    private void secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secActionPerformed

    private void ovrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ovrActionPerformed

    private void vfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vfActionPerformed
        viewf vf =new viewf();        
       vf.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_vfActionPerformed

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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> app;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> ovr;
    private javax.swing.JComboBox<String> sec;
    private javax.swing.JComboBox<String> ui;
    private javax.swing.JTextField user;
    private javax.swing.JToggleButton vf;
    // End of variables declaration//GEN-END:variables
}
