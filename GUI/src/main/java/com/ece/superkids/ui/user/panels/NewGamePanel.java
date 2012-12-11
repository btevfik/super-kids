/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ece.superkids.ui.user.panels;

import com.ece.superkids.questions.enums.QuestionLevel;
import com.ece.superkids.ui.controllers.PanelController;
import com.ece.superkids.ui.events.Session;
import com.ece.superkids.users.entities.User;
import java.awt.Color;

/**
 *
 * @author baris & David C
 */
public class NewGamePanel extends javax.swing.JPanel {

    /**
     * Creates new form NewGamePanel
     */
    private PanelController controller;
    private Session session;
    private User user;
    private boolean tutorialFlag;

    /**
     * This creates a level selection screen panel.
     * The available levels depend on whether this a new game or continuing on a
     * game.
     * 
     * @param newOrContinue  the state of the game
     */
    public NewGamePanel(String newOrContinue){
        controller = PanelController.getInstance();
        session=Session.aSession();
        user=session.getLoggedInUser();
        tutorialFlag = ("New Tutorial".equals(newOrContinue));
        initComponents();
        initLevelButtons();
        jLabel1.setText(newOrContinue);
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
        level3Button = new javax.swing.JButton();
        level2Button = new javax.swing.JButton();
        level1Button = new javax.swing.JButton();
        backgoundLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Game");
        jLabel1.setBounds(90, 160, 640, 50);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        level3Button.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        level3Button.setForeground(new java.awt.Color(255, 255, 255));
        level3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/levelbutton.png"))); // NOI18N
        level3Button.setText("Level 3");
        level3Button.setBorderPainted(false);
        level3Button.setContentAreaFilled(false);
        level3Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        level3Button.setIconTextGap(0);
        level3Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level3ButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level3ButtonMouseEntered(evt);
            }
        });
        level3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level3ButtonActionPerformed(evt);
            }
        });
        level3Button.setBounds(540, 330, 190, 110);
        jLayeredPane1.add(level3Button, javax.swing.JLayeredPane.DEFAULT_LAYER);

        level2Button.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        level2Button.setForeground(new java.awt.Color(255, 255, 255));
        level2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/levelbutton.png"))); // NOI18N
        level2Button.setText("Level 2");
        level2Button.setBorderPainted(false);
        level2Button.setContentAreaFilled(false);
        level2Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        level2Button.setIconTextGap(0);
        level2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level2ButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level2ButtonMouseEntered(evt);
            }
        });
        level2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level2ButtonActionPerformed(evt);
            }
        });
        level2Button.setBounds(310, 330, 190, 110);
        jLayeredPane1.add(level2Button, javax.swing.JLayeredPane.DEFAULT_LAYER);

        level1Button.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        level1Button.setForeground(new java.awt.Color(255, 255, 255));
        level1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/levelbutton.png"))); // NOI18N
        level1Button.setText("Level 1");
        level1Button.setBorderPainted(false);
        level1Button.setContentAreaFilled(false);
        level1Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        level1Button.setIconTextGap(0);
        level1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level1ButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level1ButtonMouseEntered(evt);
            }
        });
        level1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level1ButtonActionPerformed(evt);
            }
        });
        level1Button.setBounds(80, 330, 190, 110);
        jLayeredPane1.add(level1Button, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backgoundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/BasicScreen3.png"))); // NOI18N
        backgoundLabel.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(backgoundLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
            .add(layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 600, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //FOR EACH LEVEL I THINK WE SHOULD HAVE A DIFFERENT PANEL RATHER THAN USING THE SAME PANEL
    private void level2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level2ButtonActionPerformed
        // TODO add your handling code here:
        SubjectSelectionPanel sPanel = new SubjectSelectionPanel(QuestionLevel.LEVEL_2, tutorialFlag);
        user.setCurrentLevel(QuestionLevel.LEVEL_2);

        //add questionPanel
        controller.addPanel(sPanel);
    }//GEN-LAST:event_level2ButtonActionPerformed

    private void level1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level1ButtonActionPerformed
        // TODO add your handling code here
        //CATEGORIES PANEL COMES HERE.
        //QUESTIONS PANEL WILL BE ACCESSED FROM CATEGORIESPANEL
        SubjectSelectionPanel sPanel = new SubjectSelectionPanel(QuestionLevel.LEVEL_1, tutorialFlag);
        user.setCurrentLevel(QuestionLevel.LEVEL_1);

        //add questionPanel
        controller.addPanel(sPanel);
    }//GEN-LAST:event_level1ButtonActionPerformed

    private void level3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level3ButtonActionPerformed
        // TODO add your handling code here:
        SubjectSelectionPanel sPanel = new SubjectSelectionPanel(QuestionLevel.LEVEL_3, tutorialFlag);
        user.setCurrentLevel(QuestionLevel.LEVEL_3);

        //add questionPanel
        controller.addPanel(sPanel);
    }//GEN-LAST:event_level3ButtonActionPerformed

    private void level1ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level1ButtonMouseEntered
        // TODO add your handling code here:
        level1Button.setForeground(Color.yellow);
    }//GEN-LAST:event_level1ButtonMouseEntered

    private void level1ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level1ButtonMouseExited
        // TODO add your handling code here:
        level1Button.setForeground(Color.white);
    }//GEN-LAST:event_level1ButtonMouseExited

    private void level2ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level2ButtonMouseEntered
        // TODO add your handling code here:
        level2Button.setForeground(Color.yellow);
    }//GEN-LAST:event_level2ButtonMouseEntered

    private void level2ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level2ButtonMouseExited
        // TODO add your handling code here:
        level2Button.setForeground(Color.white);
    }//GEN-LAST:event_level2ButtonMouseExited

    private void level3ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level3ButtonMouseEntered
        // TODO add your handling code here:
        level3Button.setForeground(Color.yellow);
    }//GEN-LAST:event_level3ButtonMouseEntered

    private void level3ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level3ButtonMouseExited
        // TODO add your handling code here:
        level3Button.setForeground(Color.white);
    }//GEN-LAST:event_level3ButtonMouseExited
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgoundLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton level1Button;
    private javax.swing.JButton level2Button;
    private javax.swing.JButton level3Button;
    // End of variables declaration//GEN-END:variables

    private void initLevelButtons() {
        if(session.getLoggedInUser().isLevelFinished(QuestionLevel.LEVEL_1)){
            level1Button.setEnabled(false);
        }
        else{
            level1Button.setEnabled(true);
        }
        if(session.getLoggedInUser().isLevelFinished(QuestionLevel.LEVEL_2)){
            level2Button.setEnabled(false);
        }
        else{
            level2Button.setEnabled(true);
        }
        if(session.getLoggedInUser().isLevelFinished(QuestionLevel.LEVEL_3)){
            level3Button.setEnabled(false);
        }
        else{
            level3Button.setEnabled(true);
        }
    }
}
