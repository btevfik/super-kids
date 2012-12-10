/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ece.superkids.ui.parent.panels;

import com.ece.superkids.ui.parent.panels.QuestionPicturePanel;
import com.ece.superkids.questions.QuestionDatabaseFactory;
import com.ece.superkids.questions.QuestionManager;
import com.ece.superkids.questions.builders.QuestionBuilder;
import com.ece.superkids.questions.entities.Question;
import com.ece.superkids.questions.enums.QuestionCategory;
import com.ece.superkids.questions.enums.QuestionLevel;
import com.ece.superkids.questions.enums.QuestionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTextField;
import com.ece.superkids.ui.controllers.PanelController;
import com.ece.superkids.ui.controllers.QuestionController;
import javax.swing.JOptionPane;

/**
 *
 * @author baris
 */
public class EditQuestionsPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditQuestionsPanel
     */
    private QuestionController qController;
    private QuestionManager manager;
    private Question currentQuestion;
    private QuestionBuilder qBuilder;
    private List<Question> qList1;
    private List<Question> qList2;
    private List<Question> qList3;
    private int choiceSelected;
    private QuestionType qType;
    private PanelController pControl = PanelController.getInstance();

    public EditQuestionsPanel() {
        initComponents();
        qController = QuestionController.getInstance();
        manager = QuestionDatabaseFactory.aQuestionManager();
        qBuilder = QuestionBuilder.aQuestion();
        currentQuestion = null;
        qList1 = null;
        qList2 = null;
        qList3 = null;
        choiceSelected = -1;
        fillInBoxes();
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
        level1QuestionsBox = new javax.swing.JComboBox();
        level2QuestionsBox = new javax.swing.JComboBox();
        level2Label = new javax.swing.JLabel();
        level1Label = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        questionText = new javax.swing.JTextField();
        level3Label = new javax.swing.JLabel();
        level3QuestionsBox = new javax.swing.JComboBox();
        infoLabel = new javax.swing.JLabel();
        infoLabel1 = new javax.swing.JLabel();
        responseLabel = new javax.swing.JLabel();
        choice1Text = new javax.swing.JTextField();
        choice2Text = new javax.swing.JTextField();
        choice3Text = new javax.swing.JTextField();
        choice4Text = new javax.swing.JTextField();
        choice1Button = new javax.swing.JRadioButton();
        choice2Button = new javax.swing.JRadioButton();
        choice3Button = new javax.swing.JRadioButton();
        choice4Button = new javax.swing.JRadioButton();
        picButton1 = new javax.swing.JButton();
        picButton2 = new javax.swing.JButton();
        picButton3 = new javax.swing.JButton();
        picButton4 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(311, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setOpaque(false);
        setSize(new java.awt.Dimension(380, 370));

        level1QuestionsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level1QuestionsBoxActionPerformed(evt);
            }
        });

        level2QuestionsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level2QuestionsBoxActionPerformed(evt);
            }
        });

        level2Label.setForeground(new java.awt.Color(255, 255, 255));
        level2Label.setText("Level 2 Questions");

        level1Label.setForeground(new java.awt.Color(255, 255, 255));
        level1Label.setText("Level 1 Questions");

        deleteButton.setText("Delete");
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        questionText.setText("Question comes here");
        questionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionTextActionPerformed(evt);
            }
        });

        level3Label.setForeground(new java.awt.Color(255, 255, 255));
        level3Label.setText("Level 3 Questions");

        level3QuestionsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level3QuestionsBoxActionPerformed(evt);
            }
        });

        infoLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setText("You can edit the question below");

        infoLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        infoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel1.setText("Delete will remove the question from the database.");

        responseLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        responseLabel.setForeground(new java.awt.Color(255, 0, 0));

        choice1Text.setText("Choice 1 comes here");
        choice1Text.setDragEnabled(false);
        choice1Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice1TextActionPerformed(evt);
            }
        });

        choice2Text.setText("Choice 2 comes here");
        choice2Text.setDragEnabled(false);
        choice2Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice2TextActionPerformed(evt);
            }
        });

        choice3Text.setText("Choice 3 comes here");
        choice3Text.setDragEnabled(false);
        choice3Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice3TextActionPerformed(evt);
            }
        });

        choice4Text.setText("Choice 4 comes here");
        choice4Text.setDragEnabled(false);
        choice4Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice4TextActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice1Button);
        choice1Button.setForeground(new java.awt.Color(255, 255, 255));
        choice1Button.setText("Set Answer");
        choice1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice1ButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice2Button);
        choice2Button.setForeground(new java.awt.Color(255, 255, 255));
        choice2Button.setText("Set Answer");
        choice2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice2ButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice3Button);
        choice3Button.setForeground(new java.awt.Color(255, 255, 255));
        choice3Button.setText("Set Answer");
        choice3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice3ButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice4Button);
        choice4Button.setForeground(new java.awt.Color(255, 255, 255));
        choice4Button.setText("Set Answer");
        choice4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice4ButtonActionPerformed(evt);
            }
        });

        picButton1.setText("P");
        picButton1.setEnabled(false);
        picButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picButton1ActionPerformed(evt);
            }
        });

        picButton2.setText("P");
        picButton2.setEnabled(false);
        picButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picButton2ActionPerformed(evt);
            }
        });

        picButton3.setText("P");
        picButton3.setEnabled(false);
        picButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picButton3ActionPerformed(evt);
            }
        });

        picButton4.setText("P");
        picButton4.setEnabled(false);
        picButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picButton4ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(infoLabel)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(level3QuestionsBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(level2QuestionsBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(level1QuestionsBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(level2Label)
                                    .add(level1Label)
                                    .add(level3Label))))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(choice2Text, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(picButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(choice2Button)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(choice1Text, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(picButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(choice1Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(choice3Text, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(picButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(choice3Button))
                            .add(layout.createSequentialGroup()
                                .add(choice4Text, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(picButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(choice4Button))
                            .add(questionText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 229, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(56, 56, 56)
                        .add(infoLabel1)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(deleteButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(saveButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(responseLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 217, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(level1QuestionsBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(level1Label))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(level2Label)
                    .add(level2QuestionsBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(level3QuestionsBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(level3Label))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(infoLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(questionText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(choice1Button)
                    .add(picButton1)
                    .add(choice1Text, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(choice2Text, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(picButton2)
                    .add(choice2Button))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(choice3Text, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(choice3Button)
                    .add(picButton3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(choice4Text, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(choice4Button)
                    .add(picButton4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(saveButton)
                            .add(deleteButton))
                        .add(12, 12, 12)
                        .add(infoLabel1)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(responseLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .add(187, 187, 187))))
        );
    }// </editor-fold>//GEN-END:initComponents

    //delete the current selected question
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        //delete the question from the database
        if (currentQuestion != null) {
            manager.deleteQuestion(currentQuestion);
            responseLabel.setText("Deleted");
            JOptionPane.showMessageDialog(this, "Question Deleted.");
            System.out.println("Question deleted: " + currentQuestion.getQuestion());
            pControl.setParentalControlLayerPane(new EditQuestionsPanel());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void level2QuestionsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level2QuestionsBoxActionPerformed
        // TODO add your handling code here
        //set the questioText below with the selected item
        String selectedQuestion = (String) level2QuestionsBox.getSelectedItem();
        questionText.setText(selectedQuestion);
        //get the selected index
        int i = level2QuestionsBox.getSelectedIndex();
        //set the current question to the one selected
        currentQuestion = qList2.get(i);
        qType = currentQuestion.getType();
        if (qType.equals(QuestionType.PICTURE)) {
            setPicBoxEnabled(true);
        } else {
            setPicBoxEnabled(false);
        }
        //set choices
        choice1Text.setText(currentQuestion.getChoices().get(0));
        choice2Text.setText(currentQuestion.getChoices().get(1));
        choice3Text.setText(currentQuestion.getChoices().get(2));
        choice4Text.setText(currentQuestion.getChoices().get(3));

        pickChoiceButton(currentQuestion);
    }//GEN-LAST:event_level2QuestionsBoxActionPerformed

    private void level1QuestionsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level1QuestionsBoxActionPerformed
        // TODO add your handling code here:
        //set the questioText below with the selected item
        String selectedQuestion = (String) level1QuestionsBox.getSelectedItem();
        questionText.setText(selectedQuestion);
        //get the selected index
        int i = level1QuestionsBox.getSelectedIndex();
        //set the current question to the one selected
        currentQuestion = qList1.get(i);
        qType = currentQuestion.getType();
        if (qType.equals(QuestionType.PICTURE)) {
            setPicBoxEnabled(true);
        } else {
            setPicBoxEnabled(false);
        }
        //set choices
        choice1Text.setText(currentQuestion.getChoices().get(0));
        choice2Text.setText(currentQuestion.getChoices().get(1));
        choice3Text.setText(currentQuestion.getChoices().get(2));
        choice4Text.setText(currentQuestion.getChoices().get(3));

        pickChoiceButton(currentQuestion);
    }//GEN-LAST:event_level1QuestionsBoxActionPerformed
    private void level3QuestionsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level3QuestionsBoxActionPerformed
        // TODO add your handling code here:
        //set the questioText below with the selected item
        String selectedQuestion = (String) level3QuestionsBox.getSelectedItem();
        questionText.setText(selectedQuestion);
        //get the selected index
        int i = level3QuestionsBox.getSelectedIndex();
        //set the current question to the one selected
        currentQuestion = qList3.get(i);
        qType = currentQuestion.getType();
        if (qType.equals(QuestionType.PICTURE)) {
            setPicBoxEnabled(true);
        } else {
            setPicBoxEnabled(false);
        }
        //set choices
        choice1Text.setText(currentQuestion.getChoices().get(0));
        choice2Text.setText(currentQuestion.getChoices().get(1));
        choice3Text.setText(currentQuestion.getChoices().get(2));
        choice4Text.setText(currentQuestion.getChoices().get(3));

        pickChoiceButton(currentQuestion);
    }//GEN-LAST:event_level3QuestionsBoxActionPerformed

    //edit the question when save button is clicked
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        //create a new question (editedQuestion)
        Question editedQuestion = QuestionBuilder.aQuestion().copiedFrom(currentQuestion).build();
        //set question
        editedQuestion.setQuestion(questionText.getText());
        //Question
        //set choices
        List<String> choice = new ArrayList<String>();
        choice.add(choice1Text.getText());
        choice.add(choice2Text.getText());
        choice.add(choice3Text.getText());
        choice.add(choice4Text.getText());
        editedQuestion.setChoices(choice);
        //set answer
        buttonGroup1.getSelection();
        //set answer
        if (choiceSelected != -1) {
            editedQuestion.setAnswer(choice.get(choiceSelected));
        }
        //set type
        editedQuestion.setType(qType);
        //edit question
        manager.editQuestion(currentQuestion, editedQuestion);
        responseLabel.setText("Saved");
        System.out.println("Question saved: " + questionText.getText());
        JOptionPane.showMessageDialog(this, "Changes saved.");
        pControl.setParentalControlLayerPane(new EditQuestionsPanel());

    }//GEN-LAST:event_saveButtonActionPerformed

    private void questionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTextActionPerformed
        // TODO add your handling code here  
    }//GEN-LAST:event_questionTextActionPerformed

    private void choice1TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice1TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choice1TextActionPerformed

    private void choice2TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice2TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choice2TextActionPerformed

    private void choice3TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice3TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choice3TextActionPerformed

    private void choice4TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice4TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choice4TextActionPerformed

    private void choice4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice4ButtonActionPerformed
        // TODO add your handling code here:
        choiceSelected = 3;
    }//GEN-LAST:event_choice4ButtonActionPerformed

    private void choice3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice3ButtonActionPerformed
        // TODO add your handling code here:
        choiceSelected = 2;
    }//GEN-LAST:event_choice3ButtonActionPerformed

    private void choice2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice2ButtonActionPerformed
        // TODO add your handling code here:
        choiceSelected = 1;
    }//GEN-LAST:event_choice2ButtonActionPerformed

    private void choice1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice1ButtonActionPerformed
        // TODO add your handling code here:
        choiceSelected = 0;
    }//GEN-LAST:event_choice1ButtonActionPerformed

    private void picButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picButton1ActionPerformed
        // TODO add your handling code here:
        handleCustomPicture(choice1Text);
    }//GEN-LAST:event_picButton1ActionPerformed

    private void picButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picButton2ActionPerformed
        // TODO add your handling code here:
        handleCustomPicture(choice2Text);
    }//GEN-LAST:event_picButton2ActionPerformed

    private void picButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picButton3ActionPerformed
        // TODO add your handling code here:
        handleCustomPicture(choice3Text);
    }//GEN-LAST:event_picButton3ActionPerformed

    private void picButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picButton4ActionPerformed
        // TODO add your handling code here:
        handleCustomPicture(choice4Text);
    }//GEN-LAST:event_picButton4ActionPerformed

    //fill the combo boxes
    private void fillInBoxes() {
        fillInBox1();
        fillInBox2();
        fillInBox3();
    }

    //fill in level 1 combo box
    private void fillInBox1() {
        //get list of questions for level2
        qList1 = qController.getListOfCustomQuestions(QuestionLevel.LEVEL_1);
        Iterator<Question> iterator = qList1.iterator();
        while (iterator.hasNext()) {
            level1QuestionsBox.addItem(iterator.next().getQuestion());
        }
    }

    //fill in level 2 combo box
    private void fillInBox2() {
        //get list of questions for level2
        qList2 = qController.getListOfCustomQuestions(QuestionLevel.LEVEL_2);
        Iterator<Question> iterator = qList2.iterator();
        while (iterator.hasNext()) {
            level2QuestionsBox.addItem(iterator.next().getQuestion());
        }
    }

    //fill in level 3 combo box
    private void fillInBox3() {
        //get list of questions for level2
        qList3 = qController.getListOfCustomQuestions(QuestionLevel.LEVEL_3);
        Iterator<Question> iterator = qList3.iterator();
        while (iterator.hasNext()) {
            level3QuestionsBox.addItem(iterator.next().getQuestion());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton choice1Button;
    private javax.swing.JTextField choice1Text;
    private javax.swing.JRadioButton choice2Button;
    private javax.swing.JTextField choice2Text;
    private javax.swing.JRadioButton choice3Button;
    private javax.swing.JTextField choice3Text;
    private javax.swing.JRadioButton choice4Button;
    private javax.swing.JTextField choice4Text;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JLabel level1Label;
    private javax.swing.JComboBox level1QuestionsBox;
    private javax.swing.JLabel level2Label;
    private javax.swing.JComboBox level2QuestionsBox;
    private javax.swing.JLabel level3Label;
    private javax.swing.JComboBox level3QuestionsBox;
    private javax.swing.JButton picButton1;
    private javax.swing.JButton picButton2;
    private javax.swing.JButton picButton3;
    private javax.swing.JButton picButton4;
    private javax.swing.JTextField questionText;
    private javax.swing.JLabel responseLabel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

    private void setPicBoxEnabled(boolean par) {
        picButton1.setEnabled(par);
        picButton2.setEnabled(par);
        picButton3.setEnabled(par);
        picButton4.setEnabled(par);
    }

    private void handleCustomPicture(JTextField field) {
        pControl.addPanel(new QuestionPicturePanel(field));
    }

    private void pickChoiceButton(Question currentQuestion1) {
        for (int i = 0; i < 3; i++) {
            if (currentQuestion1.getAnswer().equals(currentQuestion1.getChoices().get(i))) {
                if (i == 0) {
                    choice1Button.setSelected(true);
                }
                if (i == 1) {
                    choice2Button.setSelected(true);
                }
                if (i == 2) {
                    choice3Button.setSelected(true);
                }
                if (i == 3) {
                    choice4Button.setSelected(true);
                }
            }
        }
    }
}
