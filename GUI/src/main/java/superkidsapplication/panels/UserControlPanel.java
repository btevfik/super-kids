/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;

import com.ece.superkids.users.UserDatabaseFactory;
import com.ece.superkids.users.UserManager;
import com.ece.superkids.users.entities.User;
import java.util.Iterator;
import java.util.List;
import superkidsapplication.controllers.PanelController;
import superkidsapplication.events.Session;

/**
 *
 * @author baris
 */
public class UserControlPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserControlPanel
     */
    private UserManager uM  = UserDatabaseFactory.aUserManager();
    private Session session = Session.aSession();
    private PanelController controller = PanelController.getInstance();
    private CharacterSelectionPanel characterselection;
    private String character;
    
    public UserControlPanel() {
        initComponents();
        fillBox();
        characterselection = new CharacterSelectionPanel();
        this.character = characterselection.character;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usersBox = new javax.swing.JComboBox();
        nameField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        warnLabel = new javax.swing.JLabel();
        avatarButton = new javax.swing.JButton();

        setBounds(new java.awt.Rectangle(0, 0, 300, 300));
        setOpaque(false);

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        addButton.setText("Add ");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Add a new User");

        jLabel3.setText("Users");

        warnLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        warnLabel.setForeground(new java.awt.Color(255, 0, 0));

        avatarButton.setText("Set Character");
        avatarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatarButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(27, 27, 27)
                        .add(warnLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 315, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(layout.createSequentialGroup()
                                .add(nameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(avatarButton))
                            .add(addButton)))
                    .add(layout.createSequentialGroup()
                        .add(48, 48, 48)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(layout.createSequentialGroup()
                                .add(usersBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 166, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(deleteButton)))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(15, 15, 15)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(usersBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(deleteButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 73, Short.MAX_VALUE)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(nameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(avatarButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(addButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(warnLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if(nameField.getText().contains(" ")||nameField.getText().isEmpty()){
            warnLabel.setText("Illegal Name");
            return;
        }
        User user = new User(nameField.getText());
        character = characterselection.character;
        user.setImage(character);
        uM.addUser(user);
        warnLabel.setText("User Added");
        fillBox();
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        User user = uM.getUser((String)usersBox.getSelectedItem());
        if(session.isUserLoggedIn(user)){
            warnLabel.setText("User logged in. Cannot Delete");
            return;
        }
        String name = (String)usersBox.getSelectedItem();
        uM.deleteUser(name);
        warnLabel.setText("User Deleted");
        fillBox();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void avatarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatarButtonActionPerformed
        // TODO add your handling code here:
        controller.addPanel(characterselection);     
    }//GEN-LAST:event_avatarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton avatarButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox usersBox;
    private javax.swing.JLabel warnLabel;
    // End of variables declaration//GEN-END:variables

    private void fillBox() {
        usersBox.removeAllItems();
        List usersList = uM.getAllUsers(); 
        Iterator<User> iterator = usersList.iterator();
        while (iterator.hasNext()) {
            usersBox.addItem(iterator.next().getName());
        }
    }

}
