package org.ucsc.sse.userinterfaces.swing_ui;

import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.UIManager;
import static org.ucsc.sse.userinterfaces.swing_ui.NewProjectWindow.setUIFont;
import static org.ucsc.sse.userinterfaces.swing_ui.Starter.settings;

public class HomeWindow extends javax.swing.JFrame {

    /**
     * Creates new form HomeWindow
     * @throws java.io.IOException
     */
    
    public HomeWindow() throws IOException {
        
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

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        saveBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        cancelDBtn = new javax.swing.JButton();
        nextDBtn = new javax.swing.JButton();
        saveDBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        toolBar = new javax.swing.JToolBar();
        newProjectBtn = new javax.swing.JButton();
        openBtn = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        settingsMenu = new javax.swing.JMenu();
        OWASP_Top_10 = new javax.swing.JMenuItem();
        OWASP_proactives = new javax.swing.JMenuItem();
        OWASP_T10_Mapping = new javax.swing.JMenuItem();
        STRIDE = new javax.swing.JMenuItem();
        defensivePerspective = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Project - Conexus");

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setBackground(java.awt.Color.white);
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jPanel2.setBackground(java.awt.Color.white);

        jTable1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Security Bug", "Category", "Prevention Techniques"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        saveBtn.setBackground(java.awt.SystemColor.controlHighlight);
        saveBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        saveBtn.setText("Save");

        nextBtn.setBackground(java.awt.SystemColor.controlHighlight);
        nextBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        nextBtn.setText("Next");

        cancelBtn.setBackground(java.awt.SystemColor.controlHighlight);
        cancelBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        cancelBtn.setText("Cancel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(nextBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Source", jPanel2);

        jPanel3.setBackground(java.awt.Color.white);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Therat", "Cateogry", "Mitigation Technqiues"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setPreferredSize(new java.awt.Dimension(255, 64));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        cancelDBtn.setBackground(java.awt.SystemColor.controlHighlight);
        cancelDBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        cancelDBtn.setText("Cancel");

        nextDBtn.setBackground(java.awt.SystemColor.controlHighlight);
        nextDBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        nextDBtn.setText("Next");

        saveDBtn.setBackground(java.awt.SystemColor.controlHighlight);
        saveDBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        saveDBtn.setText("Save");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveDBtn)
                        .addGap(18, 18, 18)
                        .addComponent(nextDBtn)
                        .addGap(18, 18, 18)
                        .addComponent(cancelDBtn)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelDBtn)
                    .addComponent(nextDBtn)
                    .addComponent(saveDBtn))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Design", jPanel3);

        jPanel5.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Assoication", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        toolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        toolBar.setFloatable(false);

        newProjectBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/project.png"))); // NOI18N
        newProjectBtn.setFocusable(false);
        newProjectBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newProjectBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newProjectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProjectBtnActionPerformed(evt);
            }
        });
        toolBar.add(newProjectBtn);

        openBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open.png"))); // NOI18N
        openBtn.setFocusable(false);
        openBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        openBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });
        toolBar.add(openBtn);

        menuBar.setBackground(java.awt.Color.white);
        menuBar.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));

        fileMenu.setText("File");
        fileMenu.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        menuBar.add(fileMenu);

        settingsMenu.setText("Settings");

        OWASP_Top_10.setText("OWASP Top 10");
        OWASP_Top_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OWASP_Top_10ActionPerformed(evt);
            }
        });
        settingsMenu.add(OWASP_Top_10);

        OWASP_proactives.setText("OWASP Proactives");
        OWASP_proactives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OWASP_proactivesActionPerformed(evt);
            }
        });
        settingsMenu.add(OWASP_proactives);

        OWASP_T10_Mapping.setText("OWASP Top 10 Mapping");
        OWASP_T10_Mapping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OWASP_T10_MappingActionPerformed(evt);
            }
        });
        settingsMenu.add(OWASP_T10_Mapping);

        STRIDE.setText("STRIDE");
        STRIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STRIDEActionPerformed(evt);
            }
        });
        settingsMenu.add(STRIDE);

        defensivePerspective.setText("STRIDE - Defensive Perspective");
        defensivePerspective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defensivePerspectiveActionPerformed(evt);
            }
        });
        settingsMenu.add(defensivePerspective);

        jMenuItem1.setText("STRIDE - Defensive Mapping");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        settingsMenu.add(jMenuItem1);

        menuBar.add(settingsMenu);

        helpMenu.setText("Help");
        helpMenu.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openBtnActionPerformed

    private void newProjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProjectBtnActionPerformed
        try {
            NewProjectWindow newProjectWindow = new NewProjectWindow();
            newProjectWindow.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(HomeWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_newProjectBtnActionPerformed

    private void OWASP_proactivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OWASP_proactivesActionPerformed
        settings.SettingsTabPane.setSelectedIndex(1);
        settings.setVisible(true);
    }//GEN-LAST:event_OWASP_proactivesActionPerformed

    private void OWASP_Top_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OWASP_Top_10ActionPerformed
        settings.SettingsTabPane.setSelectedIndex(0);
        settings.setVisible(true);
    }//GEN-LAST:event_OWASP_Top_10ActionPerformed

    private void OWASP_T10_MappingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OWASP_T10_MappingActionPerformed
        settings.SettingsTabPane.setSelectedIndex(2);
        settings.setVisible(true);
    }//GEN-LAST:event_OWASP_T10_MappingActionPerformed

    private void STRIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STRIDEActionPerformed
        settings.SettingsTabPane.setSelectedIndex(3);
        settings.setVisible(true);
    }//GEN-LAST:event_STRIDEActionPerformed

    private void defensivePerspectiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defensivePerspectiveActionPerformed
        settings.SettingsTabPane.setSelectedIndex(4);
        settings.setVisible(true);
    }//GEN-LAST:event_defensivePerspectiveActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        settings.SettingsTabPane.setSelectedIndex(5);
        settings.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HomeWindow().setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem OWASP_T10_Mapping;
    private javax.swing.JMenuItem OWASP_Top_10;
    private javax.swing.JMenuItem OWASP_proactives;
    private javax.swing.JMenuItem STRIDE;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton cancelDBtn;
    private javax.swing.JMenuItem defensivePerspective;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton newProjectBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton nextDBtn;
    private javax.swing.JButton openBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton saveDBtn;
    private javax.swing.JMenu settingsMenu;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
