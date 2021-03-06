/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ece.superkids.ui.parent.frames;

import com.ece.superkids.ui.controllers.PanelController;
import com.ece.superkids.ui.parent.panels.ParentalControlPanel;
import com.ece.superkids.users.ParentManager;
import com.ece.superkids.users.UserDatabaseFactory;

/**
 * Creates new form <code>AuthFrame</code>
 * Authentication screen for logging into parent control panel
 * 
 * @author baris
 */
public class AuthFrame extends javax.swing.JFrame {

    
    private ParentManager pM = UserDatabaseFactory.aParentManager();
    private PanelController controller = PanelController.getInstance();

    /**
     * Creates new form AuthFrame
     * Authentication screen for logging into parent control panel
     */
    public AuthFrame() {
        initComponents();
        //center frame relative to screen
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        responseLabel = new javax.swing.JLabel();
        forgotLabel = new javax.swing.JLabel();

        setResizable(false);

        passwordField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                passwordFieldCaretUpdate(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter your password");

        okButton.setText("OK");
        okButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        okButton.setSize(new java.awt.Dimension(75, 29));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        responseLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        responseLabel.setForeground(new java.awt.Color(255, 0, 0));

        forgotLabel.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        forgotLabel.setForeground(new java.awt.Color(51, 102, 255));
        forgotLabel.setText("Forgot your password?");
        forgotLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotLabelMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(0, 37, Short.MAX_VALUE)
                .add(responseLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 267, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(21, 21, 21))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(103, 103, 103)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(73, 73, 73)
                        .add(passwordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 179, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(136, 136, 136)
                        .add(okButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(106, 106, 106)
                        .add(forgotLabel)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(55, 55, 55)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(passwordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(okButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 9, Short.MAX_VALUE)
                .add(responseLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(forgotLabel)
                .add(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        okPressed();
    }//GEN-LAST:event_okButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
        okButton.doClick();
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void passwordFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_passwordFieldCaretUpdate
        // TODO add your handling code here:
        responseLabel.setText(null);
    }//GEN-LAST:event_passwordFieldCaretUpdate

    private void forgotLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotLabelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ResetPasswordFrame().setVisible(true);
    }//GEN-LAST:event_forgotLabelMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgotLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel responseLabel;
    // End of variables declaration//GEN-END:variables

    private void okPressed() {
        // TODO add your handling code here:
        // TODO add your handling code here:
        String input = new String(passwordField.getPassword());
        if (pM.checkParentPassword(input)) {
            this.setVisible(false);
            ParentalControlPanel parentPanel = new ParentalControlPanel();
            controller.addPanel(parentPanel);
        } else {
            responseLabel.setText("Wrong password! Try again.");
        }
    }
}
