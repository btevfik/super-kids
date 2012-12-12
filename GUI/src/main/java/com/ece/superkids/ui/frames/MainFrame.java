/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ece.superkids.ui.frames;

import com.ece.superkids.ui.controllers.MusicController;
import com.ece.superkids.ui.user.frames.LogoutAuthFrame;
import com.ece.superkids.ui.user.panels.UserSelectionPanel;
import com.ece.superkids.ui.parent.frames.AuthFrame;
import com.ece.superkids.ui.parent.panels.InitialSetupPanel;
import com.ece.superkids.users.ParentManager;
import com.ece.superkids.users.UserDatabaseFactory;
import com.ece.superkids.ui.controllers.PanelController;
import com.ece.superkids.ui.events.Session;
import com.ece.superkids.ui.user.panels.SoundPanel;

/**
 * Creates new form
 * <code>MainFrame</code> This is the main frame for the application
 *
 * @author david cheung
 */
public class MainFrame extends javax.swing.JFrame {

    //get the panel controller to manage panels
    private PanelController controller;
    private ParentManager pM;
    private Session session = Session.aSession();
    private MusicController mController = MusicController.getInstance();
    private boolean musicOn = false;

    /**
     * Creates new form MainFrame This is the main frame for the application
     */
    public MainFrame() {
        initComponents();
        //logout button is initally invisible
        logoutButton.setVisible(false);
        //add it to menu bar
        jMenuBar1.add(logoutButton);
        //center frame relative to screen
        setLocationRelativeTo(null);
        //get panelcontroller
        controller = PanelController.getInstance();
        //set the mainFrame in PanelController (THIS IS DONE ONLY ONCE/ DO NOT DO IT AGAIN SOMEWHERE ELSE)
        controller.setMainFrame(this);
        pM = UserDatabaseFactory.aParentManager();
        if (pM.doesParentExist()) {
            //go to userselectionpanel
            controller.addPanel(new UserSelectionPanel());
        } else if (!pM.doesParentExist()) {
            controller.addPanel(new InitialSetupPanel());
        }

        //BACK ITEM DISABLED
        BackItem.setVisible(false);
        
        //add soundControl panel
        soundControls.setVisible(false);
        soundControls.add(SoundPanel.getInstance());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton = new javax.swing.JButton();
        contentArea = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        musicButton = new javax.swing.JButton();
        soundControls = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        BackItem = new javax.swing.JMenuItem();
        ExitItem = new javax.swing.JMenuItem();
        ExitAppItem = new javax.swing.JMenuItem();
        ModeMenu = new javax.swing.JMenu();
        ParentItem = new javax.swing.JMenuItem();
        ChildMenu = new javax.swing.JMenu();
        LearnMode = new javax.swing.JMenuItem();
        QMode = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        AboutItem = new javax.swing.JMenuItem();

        logoutButton.setText("Logout");
        logoutButton.setBorderPainted(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super Kids: The Ultimate Adventure");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(800, 640));
        setName("mainframe"); // NOI18N
        setResizable(false);

        contentArea.setLayout(new java.awt.BorderLayout());

        musicButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        musicButton.setText("Music");
        musicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicButtonActionPerformed(evt);
            }
        });
        musicButton.setBounds(0, 0, 60, 20);
        jLayeredPane2.add(musicButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        soundControls.setBackground(new java.awt.Color(51, 153, 255));
        soundControls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soundControlsMouseClicked(evt);
            }
        });
        soundControls.setBounds(0, 0, 330, 370);
        jLayeredPane2.add(soundControls, javax.swing.JLayeredPane.DEFAULT_LAYER);

        contentArea.add(jLayeredPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(contentArea, java.awt.BorderLayout.CENTER);

        jMenuBar1.setMaximumSize(new java.awt.Dimension(800, 22));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(800, 22));

        FileMenu.setText("File");

        BackItem.setText("Go Back");
        BackItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackItemActionPerformed(evt);
            }
        });
        FileMenu.add(BackItem);

        ExitItem.setText("Exit to Main");
        ExitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitItemActionPerformed(evt);
            }
        });
        FileMenu.add(ExitItem);

        ExitAppItem.setText("Exit Application");
        ExitAppItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitAppItemActionPerformed(evt);
            }
        });
        FileMenu.add(ExitAppItem);

        jMenuBar1.add(FileMenu);

        ModeMenu.setText("Mode");

        ParentItem.setText("Parent Mode");
        ParentItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParentItemActionPerformed(evt);
            }
        });
        ModeMenu.add(ParentItem);

        ChildMenu.setText("Child Mode");

        LearnMode.setText("Learning Mode");
        LearnMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LearnModeActionPerformed(evt);
            }
        });
        ChildMenu.add(LearnMode);

        QMode.setText("Question Mode");
        QMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QModeActionPerformed(evt);
            }
        });
        ChildMenu.add(QMode);

        ModeMenu.add(ChildMenu);

        jMenuBar1.add(ModeMenu);

        HelpMenu.setText("Help");

        AboutItem.setText("About");
        AboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutItemActionPerformed(evt);
            }
        });
        HelpMenu.add(AboutItem);

        jMenuBar1.add(HelpMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //go back function
    private void BackItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackItemActionPerformed
        // TODO add your handling code here:     
        //go back one panel
        controller.goBackOnePanel();
    }//GEN-LAST:event_BackItemActionPerformed

    //exit to main menu
    private void ExitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitItemActionPerformed
        // TODO add your handling code here:
        controller.goToMainMenu();
    }//GEN-LAST:event_ExitItemActionPerformed

    private void AboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutItemActionPerformed
        // TODO add your handling code here:
        AboutFrame about = new AboutFrame();
        about.setVisible(true);
    }//GEN-LAST:event_AboutItemActionPerformed

    private void ParentItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParentItemActionPerformed
        // TODO add your handling code here:
        AuthFrame frame = new AuthFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_ParentItemActionPerformed

    private void QModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QModeActionPerformed
        // TODO add your handling code here:
        controller.goToMainMenu();
    }//GEN-LAST:event_QModeActionPerformed

    private void LearnModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LearnModeActionPerformed
        // TODO add your handling code here:
//        SubjectSelectionPanel sPanel = new SubjectSelectionPanel();
        controller.goToLearning();
    }//GEN-LAST:event_LearnModeActionPerformed

    private void ExitAppItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitAppItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitAppItemActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        new LogoutAuthFrame(logoutButton).setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void musicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicButtonActionPerformed
        // TODO add your handling code here:
        if (musicOn == false) {
            soundControls.add(SoundPanel.getInstance());
            soundControls.setVisible(true);
            musicOn = true;
            return;
        }
        if (musicOn == true) {
            soundControls.setVisible(false);
            soundControls.removeAll();
            soundControls.validate();
            musicOn = false;
        }
    }//GEN-LAST:event_musicButtonActionPerformed

    private void soundControlsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soundControlsMouseClicked
        // TODO add your handling code here:
        soundControls.setVisible(false);
        musicOn=false;
    }//GEN-LAST:event_soundControlsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutItem;
    public javax.swing.JMenuItem BackItem;
    public javax.swing.JMenu ChildMenu;
    private javax.swing.JMenuItem ExitAppItem;
    public javax.swing.JMenuItem ExitItem;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu HelpMenu;
    public javax.swing.JMenuItem LearnMode;
    private javax.swing.JMenu ModeMenu;
    public javax.swing.JMenuItem ParentItem;
    public javax.swing.JMenuItem QMode;
    public javax.swing.JPanel contentArea;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JButton logoutButton;
    private javax.swing.JButton musicButton;
    private javax.swing.JPanel soundControls;
    // End of variables declaration//GEN-END:variables
}
