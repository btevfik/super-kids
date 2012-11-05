/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;

import com.ece.superkids.questions.QuestionDatabaseFactory;
import com.ece.superkids.questions.QuestionManager;
import com.ece.superkids.questions.entities.Question;
import com.ece.superkids.questions.enums.QuestionCategory;
import com.ece.superkids.questions.enums.QuestionLevel;
import com.ece.superkids.questions.enums.QuestionType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baris
 */
public class AddQuestionPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddQuestionPanel
     */
    QuestionManager qm;
    int choiceSelected;

    public AddQuestionPanel() {
        initComponents();
        choiceSelected = 0;
        qm = QuestionDatabaseFactory.aQuestionManager();
        fillLevelBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        questionField = new javax.swing.JTextField();
        choice2Field = new javax.swing.JTextField();
        choice3Field = new javax.swing.JTextField();
        choice4Field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        choice1Field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        levelBox = new javax.swing.JComboBox();
        catBox = new javax.swing.JComboBox();
        choice2Button = new javax.swing.JRadioButton();
        choice1Button = new javax.swing.JRadioButton();
        choice3Button = new javax.swing.JRadioButton();
        choice4Button = new javax.swing.JRadioButton();

        setOpaque(false);
        setSize(new java.awt.Dimension(520, 435));

        questionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionFieldActionPerformed(evt);
            }
        });

        choice2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice2FieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Question");

        choice1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice1FieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Choice 1");

        jLabel3.setText("Choice 4");

        jLabel4.setText("Choice 2");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Choice 3");

        levelBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelBoxActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice2Button);
        choice2Button.setText("Set Answer");
        choice2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice2ButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice1Button);
        choice1Button.setText("Set Answer");
        choice1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice1ButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice3Button);
        choice3Button.setText("Set Answer");
        choice3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice3ButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice4Button);
        choice4Button.setText("Set Answer");
        choice4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice4ButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(32, 32, 32)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(choice3Field, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, choice2Field)
                                    .add(choice1Field)
                                    .add(choice4Field))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(choice3Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(choice4Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(choice2Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(choice1Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(questionField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 240, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(levelBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(catBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .add(70, 70, 70)
                        .add(addButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 182, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(catBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(levelBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(questionField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(choice1Field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(choice1Button))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(choice2Field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(choice2Button))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(choice3Field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(choice3Button))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(choice4Field, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(choice4Button))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(addButton))
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void choice2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choice2FieldActionPerformed

    private void choice1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choice1FieldActionPerformed

    private void questionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Question q = new Question();
        //set question
        q.setQuestion(questionField.getText());
        //set level
        q.setLevel((QuestionLevel) levelBox.getSelectedItem());
        //set category
        q.setCategory((QuestionCategory) catBox.getSelectedItem());
        //set choices
        List<String> choice = new ArrayList<String>();
        choice.add(choice1Field.getText());
        choice.add(choice2Field.getText());
        choice.add(choice3Field.getText());
        choice.add(choice4Field.getText());
        q.setChoices(choice);
        //set answer
        buttonGroup1.getSelection();
        //set answer
        q.setAnswer(choice.get(choiceSelected));
        //set type
        q.setType(QuestionType.TEXT);
        //add question
        qm.addQuestion(q);
        jLabel5.setText("Question Added");
    }//GEN-LAST:event_addButtonActionPerformed

    private void choice1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice1ButtonActionPerformed
        // TODO add your handling code here:
        choiceSelected = 0;
    }//GEN-LAST:event_choice1ButtonActionPerformed

    private void choice2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice2ButtonActionPerformed
        // TODO add your handling code here:
        choiceSelected = 1;
    }//GEN-LAST:event_choice2ButtonActionPerformed

    private void choice3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice3ButtonActionPerformed
        // TODO add your handling code here:
        choiceSelected = 2;
    }//GEN-LAST:event_choice3ButtonActionPerformed

    private void choice4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice4ButtonActionPerformed
        // TODO add your handling code here:
        choiceSelected = 3;
    }//GEN-LAST:event_choice4ButtonActionPerformed

    private void levelBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelBoxActionPerformed
        // TODO add your handling code here:
        QuestionLevel level = (QuestionLevel) levelBox.getSelectedItem();
        fillCatBox(level);
    }//GEN-LAST:event_levelBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox catBox;
    private javax.swing.JRadioButton choice1Button;
    private javax.swing.JTextField choice1Field;
    private javax.swing.JRadioButton choice2Button;
    private javax.swing.JTextField choice2Field;
    private javax.swing.JRadioButton choice3Button;
    private javax.swing.JTextField choice3Field;
    private javax.swing.JRadioButton choice4Button;
    private javax.swing.JTextField choice4Field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox levelBox;
    private javax.swing.JTextField questionField;
    // End of variables declaration//GEN-END:variables

    private void fillLevelBox() {
        for (QuestionLevel l : QuestionLevel.values()) {
            levelBox.addItem(l);
        }
    }

    private void fillCatBox(QuestionLevel l) {
        catBox.removeAllItems();
        for (QuestionCategory c : l.getCategories()) {
            catBox.addItem(c);
        }
    }
}
