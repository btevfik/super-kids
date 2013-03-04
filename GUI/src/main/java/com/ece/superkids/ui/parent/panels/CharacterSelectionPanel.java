/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ece.superkids.ui.parent.panels;

import com.ece.superkids.ui.controllers.PanelController;

/**
 * Creates new form <code>CharacterSelectionPanel</code>
 * This panel allow the user to select which character they want to use
 * as their avatar.
 * 
 * @author david cheung
 */
public class CharacterSelectionPanel extends javax.swing.JPanel {

    private PanelController controller = PanelController.getInstance();
    public String character;

    
    /**
     * Creates new form CharacterSelectionPanel
     * This panel allow the user to select which character they want to use
     * as their avatar.
     */
    public CharacterSelectionPanel() {
        initComponents();
        character = "/characters/Pikachu.png";
        CharacterDisplay.setText("Pikachu");
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
        characterpanel = new javax.swing.JPanel();
        Boy = new javax.swing.JButton();
        Bowser = new javax.swing.JButton();
        Mario = new javax.swing.JButton();
        NyanCat = new javax.swing.JButton();
        Pikachu = new javax.swing.JButton();
        Yoshi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CharacterDisplay = new javax.swing.JLabel();
        DoneButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(800, 600));
        jLayeredPane1.setSize(new java.awt.Dimension(800, 600));

        characterpanel.setOpaque(false);
        characterpanel.setLayout(new java.awt.GridLayout(2, 5));

        Boy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/characters/Boy.png"))); // NOI18N
        Boy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boy.setIconTextGap(0);
        Boy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoyActionPerformed(evt);
            }
        });
        characterpanel.add(Boy);

        Bowser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/characters/Bowser.png"))); // NOI18N
        Bowser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bowser.setIconTextGap(0);
        Bowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BowserActionPerformed(evt);
            }
        });
        characterpanel.add(Bowser);

        Mario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/characters/Mario.png"))); // NOI18N
        Mario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Mario.setIconTextGap(0);
        Mario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarioActionPerformed(evt);
            }
        });
        characterpanel.add(Mario);

        NyanCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/characters/NyanCat.png"))); // NOI18N
        NyanCat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NyanCat.setIconTextGap(0);
        NyanCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NyanCatActionPerformed(evt);
            }
        });
        characterpanel.add(NyanCat);

        Pikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/characters/Pikachu.png"))); // NOI18N
        Pikachu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pikachu.setIconTextGap(0);
        Pikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PikachuActionPerformed(evt);
            }
        });
        characterpanel.add(Pikachu);

        Yoshi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/characters/Yoshi.png"))); // NOI18N
        Yoshi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Yoshi.setIconTextGap(0);
        Yoshi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YoshiActionPerformed(evt);
            }
        });
        characterpanel.add(Yoshi);

        characterpanel.setBounds(20, 110, 610, 200);
        jLayeredPane1.add(characterpanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Character Selection");
        jLabel1.setBounds(120, 60, 390, 50);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CharacterDisplay.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        CharacterDisplay.setForeground(new java.awt.Color(255, 255, 255));
        CharacterDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/characters/Pikachu.png"))); // NOI18N
        CharacterDisplay.setText("Pikachu");
        CharacterDisplay.setIconTextGap(0);
        CharacterDisplay.setBounds(170, 340, 350, 200);
        jLayeredPane1.add(CharacterDisplay, javax.swing.JLayeredPane.DEFAULT_LAYER);

        DoneButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        DoneButton.setForeground(new java.awt.Color(255, 255, 255));
        DoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/levelbutton.png"))); // NOI18N
        DoneButton.setText("Done");
        DoneButton.setBorderPainted(false);
        DoneButton.setContentAreaFilled(false);
        DoneButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DoneButton.setIconTextGap(0);
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });
        DoneButton.setBounds(650, 520, 110, 60);
        jLayeredPane1.add(DoneButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/BasicScreen4.png"))); // NOI18N
        background.setAlignmentY(0.0F);
        background.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.setIconTextGap(0);
        background.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(background, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        // TODO add your handling code here:
        controller.goToParentalControl();
        
    }//GEN-LAST:event_DoneButtonActionPerformed

    private void BoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoyActionPerformed
        // TODO add your handling code here:
        this.CharacterDisplay.setIcon(this.Boy.getIcon());
        this.CharacterDisplay.setText("Boy");
        this.character = "/characters/Boy.png";
    }//GEN-LAST:event_BoyActionPerformed

    private void BowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BowserActionPerformed
        // TODO add your handling code here:
        this.CharacterDisplay.setIcon(this.Bowser.getIcon());
        this.CharacterDisplay.setText("Bowser");
        this.character = "/characters/Bowser.png";
    }//GEN-LAST:event_BowserActionPerformed

    private void MarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarioActionPerformed
        // TODO add your handling code here:
        this.CharacterDisplay.setIcon(this.Mario.getIcon());
        this.CharacterDisplay.setText("Mario");
        this.character = "/characters/Mario.png";
    }//GEN-LAST:event_MarioActionPerformed

    private void NyanCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NyanCatActionPerformed
        // TODO add your handling code here:
        this.CharacterDisplay.setIcon(this.NyanCat.getIcon());
        this.CharacterDisplay.setText("Nyan Cat");
        this.character = "/characters/NyanCat.png";
    }//GEN-LAST:event_NyanCatActionPerformed

    private void PikachuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PikachuActionPerformed
        // TODO add your handling code here:
        this.CharacterDisplay.setIcon(this.Pikachu.getIcon());
        this.CharacterDisplay.setText("Pikachu");
        this.character = "/characters/Pikachu.png";
    }//GEN-LAST:event_PikachuActionPerformed

    private void YoshiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YoshiActionPerformed
        // TODO add your handling code here:
        this.CharacterDisplay.setIcon(this.Yoshi.getIcon());
        this.CharacterDisplay.setText("Yoshi");
        this.character = "/characters/Yoshi.png";
    }//GEN-LAST:event_YoshiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bowser;
    private javax.swing.JButton Boy;
    private javax.swing.JLabel CharacterDisplay;
    private javax.swing.JButton DoneButton;
    private javax.swing.JButton Mario;
    private javax.swing.JButton NyanCat;
    private javax.swing.JButton Pikachu;
    private javax.swing.JButton Yoshi;
    private javax.swing.JLabel background;
    private javax.swing.JPanel characterpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}