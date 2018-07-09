/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ucsc.sse.userinterfaces.swing_ui;

import org.xml.sax.SAXException;
import org.ucsc.sse.knowedgemodel.prolog.AssociationLoader;

import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.UIManager;
import javax.xml.parsers.ParserConfigurationException;

import static org.ucsc.sse.userinterfaces.swing_ui.NewProjectWindow.setUIFont;
import static org.ucsc.sse.userinterfaces.swing_ui.Starter.settings;

/**
 * @author Ashi
 */
public class WelcomeWindow extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeWindow
     */
    public WelcomeWindow() throws IOException {
        
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

    private void setIcon() throws IOException {
        Image iconImage = ImageIO.read(getClass().getResourceAsStream("/images/logo2.jpg"));
        setIconImage(iconImage);
    }

    private void setLocation() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newProjectBtn = new javax.swing.JButton();
        openProjectBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        settingsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Conexus");
        setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(450, 450));
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_1logo.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 48)); // NOI18N
        jLabel3.setText("Conexus");

        newProjectBtn.setBackground(java.awt.Color.white);
        newProjectBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        newProjectBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/project_icon.png"))); // NOI18N
        newProjectBtn.setText("Start Analysis");
        newProjectBtn.setBorder(null);
        newProjectBtn.setBorderPainted(false);
        newProjectBtn.setIconTextGap(8);
        newProjectBtn.setMaximumSize(new java.awt.Dimension(160, 30));
        newProjectBtn.setMinimumSize(new java.awt.Dimension(160, 30));
        newProjectBtn.setPreferredSize(new java.awt.Dimension(160, 30));
        newProjectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProjectBtnActionPerformed(evt);
            }
        });

        openProjectBtn.setBackground(java.awt.Color.white);
        openProjectBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        openProjectBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open_icon.png"))); // NOI18N
        openProjectBtn.setText("Open Analysis");
        openProjectBtn.setBorder(null);
        openProjectBtn.setIconTextGap(8);
        openProjectBtn.setMaximumSize(new java.awt.Dimension(160, 30));
        openProjectBtn.setMinimumSize(new java.awt.Dimension(160, 30));
        openProjectBtn.setPreferredSize(new java.awt.Dimension(160, 30));
        openProjectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openProjectBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel2.setText("Version 1.0 | 2017");

        settingsBtn.setBackground(new java.awt.Color(255, 255, 255));
        settingsBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        settingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings_icon.png"))); // NOI18N
        settingsBtn.setText("Settings");
        settingsBtn.setIconTextGap(8);
        settingsBtn.setMaximumSize(new java.awt.Dimension(160, 30));
        settingsBtn.setMinimumSize(new java.awt.Dimension(160, 30));
        settingsBtn.setPreferredSize(new java.awt.Dimension(160, 30));
        settingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 133, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(171, 171, 171)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(openProjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(newProjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(newProjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(openProjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newProjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProjectBtnActionPerformed

        try {
            NewProjectWindow newProjectWindow = new NewProjectWindow();
            newProjectWindow.setVisible(true);
            new AssociationLoader().callProlog();

        } catch (IOException ex) {
            Logger.getLogger(NewProjectWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_newProjectBtnActionPerformed

    private void openProjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openProjectBtnActionPerformed
        FileOpen analysisOpen = new FileOpen();
        analysisOpen.setVisible(true);
    }//GEN-LAST:event_openProjectBtnActionPerformed

    private void settingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsBtnActionPerformed
        settings.setVisible(true);
    }//GEN-LAST:event_settingsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new WelcomeWindow().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(WelcomeWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newProjectBtn;
    private javax.swing.JButton openProjectBtn;
    private javax.swing.JButton settingsBtn;
    // End of variables declaration//GEN-END:variables
}
