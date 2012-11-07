/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;

import java.awt.Color;

/**
 *
 * @author david
 */
public class OptionPanel extends javax.swing.JPanel {

    /**
     * Creates new form OptionPanel
     */
    public OptionPanel() {
        initComponents();
        this.SoundHighlight.setVisible(false);
        this.ReportHighlight.setVisible(false);
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
        Options = new javax.swing.JLabel();
        SoundButton = new javax.swing.JButton();
        ReportCardButton = new javax.swing.JButton();
        ContentArea = new javax.swing.JLayeredPane();
        ReportHighlight = new javax.swing.JLabel();
        SoundHighlight = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jLayeredPane1.setAlignmentX(0.0F);
        jLayeredPane1.setAlignmentY(0.0F);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(800, 600));
        jLayeredPane1.setSize(new java.awt.Dimension(800, 600));

        Options.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        Options.setForeground(new java.awt.Color(255, 255, 255));
        Options.setText("Options");
        Options.setBounds(140, 200, 120, 50);
        jLayeredPane1.add(Options, javax.swing.JLayeredPane.DEFAULT_LAYER);

        SoundButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        SoundButton.setForeground(new java.awt.Color(255, 255, 255));
        SoundButton.setText("Sound");
        SoundButton.setBorderPainted(false);
        SoundButton.setContentAreaFilled(false);
        SoundButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SoundButton.setIconTextGap(0);
        SoundButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SoundButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SoundButtonMouseEntered(evt);
            }
        });
        SoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoundButtonActionPerformed(evt);
            }
        });
        SoundButton.setBounds(80, 270, 106, 32);
        jLayeredPane1.add(SoundButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ReportCardButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        ReportCardButton.setForeground(new java.awt.Color(255, 255, 255));
        ReportCardButton.setText("Report Cards");
        ReportCardButton.setBorderPainted(false);
        ReportCardButton.setContentAreaFilled(false);
        ReportCardButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ReportCardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportCardButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportCardButtonMouseEntered(evt);
            }
        });
        ReportCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportCardButtonActionPerformed(evt);
            }
        });
        ReportCardButton.setBounds(80, 310, 176, 32);
        jLayeredPane1.add(ReportCardButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ContentArea.setPreferredSize(new java.awt.Dimension(300, 400));
        ContentArea.setBounds(430, 140, 320, 400);
        jLayeredPane1.add(ContentArea, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ReportHighlight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/HighlightedButton.png"))); // NOI18N
        ReportHighlight.setBounds(50, 300, 310, 50);
        jLayeredPane1.add(ReportHighlight, javax.swing.JLayeredPane.DEFAULT_LAYER);

        SoundHighlight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/HighlightedButton.png"))); // NOI18N
        SoundHighlight.setBounds(50, 260, 310, 50);
        jLayeredPane1.add(SoundHighlight, javax.swing.JLayeredPane.DEFAULT_LAYER);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/BasicScreen.png"))); // NOI18N
        background.setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        background.setIconTextGap(0);
        background.setInheritsPopupMenu(false);
        background.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(background, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoundButtonActionPerformed
        // TODO add your handling code here:
        SoundHighlight.setVisible(true);
        ReportHighlight.setVisible(false);
        ContentArea.removeAll();
        ContentArea.repaint();
        ContentArea.add(SoundPanel.getInstance());

    }//GEN-LAST:event_SoundButtonActionPerformed

    private void SoundButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SoundButtonMouseEntered
        // TODO add your handling code here:
        SoundButton.setForeground(Color.yellow);
    }//GEN-LAST:event_SoundButtonMouseEntered

    private void SoundButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SoundButtonMouseExited
        // TODO add your handling code here:
        SoundButton.setForeground(Color.white);
    }//GEN-LAST:event_SoundButtonMouseExited

    private void ReportCardButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportCardButtonMouseEntered
        // TODO add your handling code here:
        ReportCardButton.setForeground(Color.yellow);
    }//GEN-LAST:event_ReportCardButtonMouseEntered

    private void ReportCardButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportCardButtonMouseExited
        // TODO add your handling code here:
        ReportCardButton.setForeground(Color.white);
    }//GEN-LAST:event_ReportCardButtonMouseExited

    private void ReportCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportCardButtonActionPerformed
        // TODO add your handling code here:
        SoundHighlight.setVisible(false);
        ReportHighlight.setVisible(true);
        ContentArea.removeAll();
        ContentArea.repaint();
        ContentArea.add(new ScoresHistoryPanel());
    }//GEN-LAST:event_ReportCardButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ContentArea;
    private javax.swing.JLabel Options;
    private javax.swing.JButton ReportCardButton;
    private javax.swing.JLabel ReportHighlight;
    private javax.swing.JButton SoundButton;
    private javax.swing.JLabel SoundHighlight;
    private javax.swing.JLabel background;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
