/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ece.superkids.ui.parent.panels;

import com.ece.superkids.users.ParentManager;
import com.ece.superkids.users.UserDatabaseFactory;
import com.ece.superkids.ui.controllers.PanelController;
import com.ece.superkids.users.entities.RecoveryQuestion;

/**
 * Creates new form <code>InitialSetupPanel</code>
 * This panel sets up the parent's login credentials
 * 
 * @author baris
 */
public class InitialSetupPanel extends javax.swing.JPanel {

    
    ParentManager pM = UserDatabaseFactory.aParentManager();
    PanelController pC;
    /**
     * Creates new form InitialSetupPanel
     * This panel sets up the parent's login credentials
     */
    public InitialSetupPanel() {
        setName("InitialSetup");
        initComponents();
        nextButton.setVisible(false);
        pC = PanelController.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        warnLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        passField2 = new javax.swing.JPasswordField();
        answerField = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        questionField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Initial Setup");
        jLabel1.setBounds(90, 160, 240, 40);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.setBounds(70, 430, 80, 40);
        jLayeredPane1.add(okButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Password");
        jLabel2.setBounds(70, 220, 110, 30);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Answer");
        jLabel3.setBounds(70, 370, 140, 30);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        warnLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        warnLabel.setForeground(new java.awt.Color(255, 0, 0));
        warnLabel.setBounds(390, 300, 390, 60);
        jLayeredPane1.add(warnLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        passField.setBounds(70, 240, 170, 28);
        jLayeredPane1.add(passField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        passField2.setBounds(70, 290, 170, 28);
        jLayeredPane1.add(passField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        answerField.setBounds(70, 390, 170, 28);
        jLayeredPane1.add(answerField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        nextButton.setBounds(650, 370, 90, 40);
        jLayeredPane1.add(nextButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password will be asked to access the parent controls.");
        jLabel4.setBounds(40, 470, 370, 30);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Again");
        jLabel5.setBounds(70, 270, 70, 30);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        questionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionFieldActionPerformed(evt);
            }
        });
        questionField.setBounds(70, 340, 170, 28);
        jLayeredPane1.add(questionField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Recover Question");
        jLabel6.setBounds(70, 320, 140, 30);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/BasicScreen.png"))); // NOI18N
        background.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(background, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 800, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        String pass1 = new String(passField.getPassword());
        String pass2 = new String(passField2.getPassword());
        if (pass1.length() < 8) {
            warnLabel.setText("Password must be at least 8 characters.");
            return;
        }
        if (pass1.equals(pass2)) {
            pM.changeParentPassword(new String(passField.getPassword()));
            warnLabel.setText("Parent password successfully created.");
            nextButton.setVisible(true);
        } else if (!pass1.equals(pass2)) {
            warnLabel.setText("Passwords don't match.");
        }

        RecoveryQuestion rq = new RecoveryQuestion(questionField.getText(), answerField.getText());
        if(pM.setRecoverQuestion(rq)==false){
           warnLabel.setText("Recover question error!");
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        pC.addPanel(new ParentalControlPanel());
    }//GEN-LAST:event_nextButtonActionPerformed

    private void questionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionFieldActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JPasswordField passField2;
    private javax.swing.JTextField questionField;
    private javax.swing.JLabel warnLabel;
    // End of variables declaration//GEN-END:variables
}