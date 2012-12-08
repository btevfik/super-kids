/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ece.superkids.ui.frames;

/**
 *
 * @author baris
 */
public class AboutFrame extends javax.swing.JFrame {

    /**
     * Creates new form AboutFrame
     */
    public AboutFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        namesArea = new javax.swing.JTextArea();
        iconLabel = new javax.swing.JLabel();
        aboutLabel = new javax.swing.JLabel();

        setResizable(false);

        namesArea.setEditable(false);
        namesArea.setBackground(new java.awt.Color(255, 153, 153));
        namesArea.setColumns(20);
        namesArea.setRows(5);
        namesArea.setText("Boston University MET College \nFALL 2012\nCS673 - Software Engineering\n\nSuper Kids - The Ultimate Adventure\nhttps://github.com/bduong/super-kids\n\nTeam Members;\n\nBenjamin Duong\nBaris Tevfik\nMarc Adam\nChun-Chieh Feng\nFranklin Wong\nKunal Singh\nPrashant Vaidyanathan\nHeng Du\nDavid Cheung\nDavid Ohayon\n\nMusic by www.nosoapradio.us");
        namesArea.setBorder(null);
        jScrollPane1.setViewportView(namesArea);

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/characters/Boy.png"))); // NOI18N

        aboutLabel.setText("ABOUT");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(26, 26, 26)
                        .add(iconLabel))
                    .add(layout.createSequentialGroup()
                        .add(60, 60, 60)
                        .add(aboutLabel)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 305, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(57, 57, 57)
                        .add(aboutLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(iconLabel)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea namesArea;
    // End of variables declaration//GEN-END:variables
}
