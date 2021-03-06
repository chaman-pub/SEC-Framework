/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ucsc.sse.userinterfaces.swing_ui;

import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import static org.ucsc.sse.userinterfaces.swing_ui.Starter.welcome;

/**
 *
 * @author Ashi
 */
public class NewProjectWindow extends javax.swing.JFrame {

    /**
     * Creates new form NewProjectWindow
     */
    public NewProjectWindow() throws IOException {
        
        try {
            setUIFont(new javax.swing.plaf.FontUIResource("Segoe UI", Font.PLAIN, 14));
        } catch (Exception e) {
            
        }

        //Changing look and feel
        //for metal - javax.swing.plaf.metal.MetalLookAndFeel
        //for windows - com.sun.java.swing.plaf.windows.WindowsLookAndFeel
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            
        }
        
        initComponents();
        setIcon();
        setLocation();
    }
    
    public static void setUIFont(javax.swing.plaf.FontUIResource f) {
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(key, f);
            }
        }
    }

    private void setIcon() throws IOException {
        Image iconImage = ImageIO.read(getClass().getResourceAsStream("/images/logo2.jpg"));
        setIconImage(iconImage);
    }

    private void setLocation() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setResizable(false);
    }
    
    private void viewFileChooser(String displayName, String fileType, String dialogTitle){
        JFileChooser chooser = new JFileChooser();
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setDialogTitle(dialogTitle);
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter(displayName, fileType);
        chooser.setFileFilter(filter);

        int result = chooser.showOpenDialog(null);
        switch (result) {
            case JFileChooser.APPROVE_OPTION:
                HomeWindow home;
                try {
                    home = new HomeWindow();
                    this.dispose();
                    welcome.dispose();
                    home.setVisible(true);
                } catch (IOException ex) {
                    //Logger.getLogger(NewProjectWindow.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;

            case JFileChooser.CANCEL_OPTION:
                break;

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

        jPanel1 = new javax.swing.JPanel();
        threatReportBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        threatReportRadioBtn = new javax.swing.JRadioButton();
        staticCodeReportRadioBtn = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Project");

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));

        threatReportBtn.setBackground(java.awt.SystemColor.controlHighlight);
        threatReportBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        threatReportBtn.setText("Add");
        threatReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threatReportBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel2.setText("Select report type to add");

        threatReportRadioBtn.setBackground(java.awt.Color.white);
        threatReportRadioBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        threatReportRadioBtn.setText("Threat Report");
        threatReportRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threatReportRadioBtnActionPerformed(evt);
            }
        });

        staticCodeReportRadioBtn.setBackground(java.awt.Color.white);
        staticCodeReportRadioBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        staticCodeReportRadioBtn.setText("Static Code Reports");
        staticCodeReportRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticCodeReportRadioBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(java.awt.SystemColor.controlHighlight);
        jButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("* Use Microsft Threat Modeling tool 2016 to generate Threat Report");

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("* Use Find-Sec-Bugs plugin to generate Static Code Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(threatReportBtn)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(staticCodeReportRadioBtn)
                        .addComponent(threatReportRadioBtn)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(threatReportRadioBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staticCodeReportRadioBtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(threatReportBtn)
                    .addComponent(jButton1))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void threatReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threatReportBtnActionPerformed
        if(threatReportRadioBtn.isSelected()){
            //FileOpen threatReportOpen = new FileOpen(1);
            //threatReportOpen.setVisible(true);
            
            viewFileChooser("HTM Files", "htm", "Select Threat Reports");
            
        }else if(staticCodeReportRadioBtn.isSelected()){
            //FileOpen threatReportOpen = new FileOpen(2);
            //threatReportOpen.setVisible(true);
            
            viewFileChooser("XML Files", "xml", "Select Static Code Analysis Reports");
            
        }
    }//GEN-LAST:event_threatReportBtnActionPerformed

    private void threatReportRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threatReportRadioBtnActionPerformed
        if(staticCodeReportRadioBtn.isSelected()){
            staticCodeReportRadioBtn.setSelected(false);
        }
    }//GEN-LAST:event_threatReportRadioBtnActionPerformed

    private void staticCodeReportRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticCodeReportRadioBtnActionPerformed
        if(threatReportRadioBtn.isSelected()){
            threatReportRadioBtn.setSelected(false);
        }
    }//GEN-LAST:event_staticCodeReportRadioBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(NewProjectWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProjectWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProjectWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProjectWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewProjectWindow().setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton staticCodeReportRadioBtn;
    private javax.swing.JButton threatReportBtn;
    private javax.swing.JRadioButton threatReportRadioBtn;
    // End of variables declaration//GEN-END:variables
}
