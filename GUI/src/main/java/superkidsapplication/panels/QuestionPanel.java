/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;

import com.ece.superkids.questions.entities.Question;
import com.ece.superkids.questions.enums.QuestionCategory;
import com.ece.superkids.questions.enums.QuestionLevel;
import com.ece.superkids.questions.enums.QuestionType;
import com.ece.superkids.users.entities.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import superkidsapplication.controllers.PanelController;
import superkidsapplication.controllers.QuestionController;
import superkidsapplication.controllers.TTSController;
import superkidsapplication.customui.ImageButton;
import superkidsapplication.customui.ImageLabel;
import superkidsapplication.events.Session;
import superkidsapplication.providers.ImageProvider;
import superkidsapplication.providers.ResourceProviderFactory;

/**
 *
 * @author Prashant & Baris & David C
 */
public class QuestionPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuestionPanel
     */
    private int score;
    private int scoreValue;
    //points to which choice is correct
    private int correctAnswer;
    private QuestionController qBase;
    private PanelController controller;
    private QuestionCategory category;
    private QuestionLevel level;
    private JFrame result;
    private Session session = Session.aSession();
    private List<Icon> icons;
    private ImageProvider iconProvider;
    private Question question;

    //when creating the panel set which choice is the correct answer
    //1 is button1 , 2 is button2 and so on.
    //look at design tab to see which button is which
    public QuestionPanel(Question question) {
        this.setName("Question");
        this.question = question;
        this.category = question.getCategory();
        this.level = question.getLevel();
        qBase = QuestionController.getInstance();
        controller = PanelController.getInstance();
        initComponents();
        //initally next button is not visible becomes visible if the question is answered correctly
        nextQButton.setVisible(false);
        //score is initally zero
        score = 0;
        iconProvider = ResourceProviderFactory.anImageProvider();
        //fill the panel
        fillQuestion();
        //save question to logged in user's state
        saveQuestion();
        //set super kid name
        superKidNameLabel.setText("Super Kid: " + session.getLoggedInUser().getName());
        this.characterIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(session.getLoggedInUser().getImage())));    
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
        RepeatSoundButton = new javax.swing.JButton();
        questionLabel = new javax.swing.JLabel();
        scoreNumLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        nextQButton = new javax.swing.JButton();
        superKidNameLabel = new javax.swing.JLabel();
        characterIconLabel = new ImageLabel();
        ChoicePanel = new javax.swing.JPanel();
        choice1Button = new ImageButton();
        choice2Button = new ImageButton();
        choice3Button = new ImageButton();
        choice4Button = new ImageButton();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(800, 600));
        jLayeredPane1.setSize(new java.awt.Dimension(800, 600));

        RepeatSoundButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/soundicon.png"))); // NOI18N
        RepeatSoundButton.setContentAreaFilled(false);
        RepeatSoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepeatSoundButtonActionPerformed(evt);
            }
        });
        RepeatSoundButton.setBounds(690, 510, 97, 80);
        jLayeredPane1.add(RepeatSoundButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        questionLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(255, 255, 255));
        questionLabel.setText("Question goes here");
        questionLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        questionLabel.setBounds(20, 130, 770, 30);
        jLayeredPane1.add(questionLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        scoreNumLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        scoreNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreNumLabel.setText("00");
        scoreNumLabel.setBounds(720, 10, 70, 40);
        jLayeredPane1.add(scoreNumLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        scoreLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setText("Score:");
        scoreLabel.setBounds(630, 10, 80, 40);
        jLayeredPane1.add(scoreLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nextQButton.setBackground(new java.awt.Color(153, 0, 0));
        nextQButton.setForeground(new java.awt.Color(255, 255, 255));
        nextQButton.setText("NEXT QUESTION");
        nextQButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQButtonActionPerformed(evt);
            }
        });
        nextQButton.setBounds(606, 530, 180, 50);
        jLayeredPane1.add(nextQButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        superKidNameLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        superKidNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        superKidNameLabel.setText("Super Kid: John Doe");
        superKidNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        superKidNameLabel.setBounds(20, 570, 190, 17);
        jLayeredPane1.add(superKidNameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        characterIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/characters/Boy.png"))); // NOI18N
        characterIconLabel.setPreferredSize(new java.awt.Dimension(200, 200));
        characterIconLabel.setBounds(10, 350, 200, 220);
        jLayeredPane1.add(characterIconLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ChoicePanel.setOpaque(false);

        choice1Button.setText("Choice 1");
        choice1Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        choice1Button.setIconTextGap(0);
        choice1Button.setPreferredSize(new java.awt.Dimension(150, 150));
        choice1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice1ButtonActionPerformed(evt);
            }
        });

        choice2Button.setText("Choice 2");
        choice2Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        choice2Button.setIconTextGap(0);
        choice2Button.setPreferredSize(new java.awt.Dimension(150, 150));
        choice2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice2ButtonActionPerformed(evt);
            }
        });

        choice3Button.setText("Choice 3");
        choice3Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        choice3Button.setIconTextGap(0);
        choice3Button.setPreferredSize(new java.awt.Dimension(150, 150));
        choice3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice3ButtonActionPerformed(evt);
            }
        });

        choice4Button.setText("Choice 4");
        choice4Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        choice4Button.setIconTextGap(0);
        choice4Button.setPreferredSize(new java.awt.Dimension(150, 150));
        choice4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice4ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChoicePanelLayout = new javax.swing.GroupLayout(ChoicePanel);
        ChoicePanel.setLayout(ChoicePanelLayout);
        ChoicePanelLayout.setHorizontalGroup(
            ChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoicePanelLayout.createSequentialGroup()
                .addComponent(choice1Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(choice2Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ChoicePanelLayout.createSequentialGroup()
                .addComponent(choice3Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(choice4Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ChoicePanelLayout.setVerticalGroup(
            ChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChoicePanelLayout.createSequentialGroup()
                .addGroup(ChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choice1Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice2Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(ChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choice4Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice3Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        ChoicePanel.setBounds(230, 160, 430, 340);
        jLayeredPane1.add(ChoicePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/QuestionScreen.png"))); // NOI18N
        background.setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        background.setIconTextGap(0);
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundMouseClicked(evt);
            }
        });
        background.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(background, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void choice1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice1ButtonActionPerformed
        // TODO add your handling code here:
        TTSController.TTS(this.choice1Button.getText());

        if (correctAnswer == 1) {
            correctAnswerClicked();
        } else {
            wrongAnswerClicked(choice1Button);
        }
    }//GEN-LAST:event_choice1ButtonActionPerformed

    private void choice3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice3ButtonActionPerformed
        TTSController.TTS(this.choice3Button.getText());

        if (correctAnswer == 3) {
            correctAnswerClicked();
        } else {
            wrongAnswerClicked(choice3Button);
        }
    }//GEN-LAST:event_choice3ButtonActionPerformed

    private void choice2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice2ButtonActionPerformed
        TTSController.TTS(this.choice2Button.getText());

        if (correctAnswer == 2) {
            correctAnswerClicked();
        } else {
            wrongAnswerClicked(choice2Button);
        }
    }//GEN-LAST:event_choice2ButtonActionPerformed

    private void choice4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice4ButtonActionPerformed
        TTSController.TTS(this.choice4Button.getText());

        if (correctAnswer == 4) {
            correctAnswerClicked();
        } else {
            wrongAnswerClicked(choice4Button);
        }
    }//GEN-LAST:event_choice4ButtonActionPerformed

    //if NEXT button is clicked go to next question
    private void nextQButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQButtonActionPerformed
        //save the score
        session.getLoggedInUser().saveScore(question, scoreValue);
        try {
            // TODO add your handling code here:
            //set result frame(wronganswer-correctanswer) to invisible if next button clicked
            if (result != null) {
                result.setVisible(false);
            }
            //if we are done with this category
            //then go to scorescreen panel
            if (nextQButton.getText().equals("Done")) {
                controller.addPanel(new ScoreScreenPanel());
                return; //return this function
            }
            //// here when a question is answered correctly we get a new question panel and add to frame
            //get the next questionpanel
            QuestionPanel qP = qBase.createQuestionPanel(level, category);
            //if the returned questionPanel is not null then add to frame through the controller
            if (qP != null) {
                controller.addPanel(qP);
                //if returned questionpanel is null then there are no more 
            } else {
                nextQButton.setText("Done");
                //if no more questions
                TTSController.TTS("No more questions");
            }
        } catch (IOException ex) {
            Logger.getLogger(QuestionPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nextQButtonActionPerformed

    private void RepeatSoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepeatSoundButtonActionPerformed
        // TODO add your handling code here:
        TTSController.TTS(this.questionLabel.getText());

    }//GEN-LAST:event_RepeatSoundButtonActionPerformed

    private void backgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseClicked
        // TODO add your handling code here:
        /*FOR TESTING PURPOSES UNCOMMENT NEXT LINE
         * IT WILL LET YOU GO THROUGH THE QUESTIONS FASTER
         * JUST CLICK ON THE PANEL TO TRIGGER CORRECT ANSWER CLICKED
         */
        correctAnswerClicked();
    }//GEN-LAST:event_backgroundMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChoicePanel;
    private javax.swing.JButton RepeatSoundButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel characterIconLabel;
    public javax.swing.JButton choice1Button;
    private javax.swing.JButton choice2Button;
    private javax.swing.JButton choice3Button;
    private javax.swing.JButton choice4Button;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton nextQButton;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scoreNumLabel;
    private javax.swing.JLabel superKidNameLabel;
    // End of variables declaration//GEN-END:variables

    //set the question and the choices
    //they can have a text or an icon (image)
    //if no icon is wanted then pass an empty list into icon parameter
    private void setQuestion(String qText, Icon icon) throws IOException {
        questionLabel.setIcon(icon);
        questionLabel.setText(qText);
        //say the question text
        TTSController.TTS(qText);
    }

    //set text and/or icons for buttons
    private void setChoices(List<String> choices, List<Icon> icons) {
        if (icons != null) {
            choice1Button.setIcon(icons.get(0));
            choice2Button.setIcon(icons.get(1));
            choice3Button.setIcon(icons.get(2));
            choice4Button.setIcon(icons.get(3));
        }
        if (choices != null) {
            choice1Button.setText(choices.get(0));
            choice2Button.setText(choices.get(1));
            choice3Button.setText(choices.get(2));
            choice4Button.setText(choices.get(3));
        }
    }

    /**
     * when the correct answer is clicked this method is called from the button
     * action
     */
    private void correctAnswerClicked() {
        if (result != null) {
            result.setVisible(false);
        }
        result = new CorrectAnswerFrame();
        result.setVisible(true);
        choice1Button.setEnabled(false);
        choice2Button.setEnabled(false);
        choice3Button.setEnabled(false);
        choice4Button.setEnabled(false);
        //update score
        if (score < 4) {
            score++;
        }

        if (score == 1) {
            scoreValue = 10;
            scoreNumLabel.setText("10");
        } else if (score == 2) {
            scoreValue = 7;
            scoreNumLabel.setText("7");
        } else if (score == 3) {
            scoreValue = 5;
            scoreNumLabel.setText("5");
        } else if (score == 4) {
            scoreValue = 3;
            scoreNumLabel.setText("3");
        }

        this.RepeatSoundButton.setVisible(false);
        nextQButton.setVisible(true);
    }

    /**
     * when the wrong answer is selected
     */
    private void wrongAnswerClicked(JButton button) {
        button.setEnabled(false);
        if (result != null) {
            result.setVisible(false);
        }
        result = new WrongAnswerFrame();
        result.setVisible(true);
        //update score 
        if (score < 4) {
            score++;
        }
    }

    /**
     * save this question to the logged in user's current question
     */
    private void saveQuestion() {

        User user = session.getLoggedInUser();
        user.setCurrentQuestion(question);
    }

    /**
     * fill question panel
     */
    private void fillQuestion() {
        try {
            //initally icons is null
            //if the question type is PICTURE then a new arraylist is created.
            icons = null;
            //set the question, question can have an icon as well. it is set to null for now.
            setQuestion(question.getQuestion(), null);

            //shuffle choices
            List<String> shuffledChoices = new ArrayList<String>();
            shuffledChoices.add(question.getChoices().get(0));
            shuffledChoices.add(question.getChoices().get(1));
            shuffledChoices.add(question.getChoices().get(2));
            shuffledChoices.add(question.getChoices().get(3));

            Collections.shuffle(shuffledChoices);

            //find the correct answer
            correctAnswer = findAnswer(question.getAnswer(), shuffledChoices);
            //if the type is PICTURES then create icons
            if (question.getType() == QuestionType.PICTURE) {
                //create a new list
                icons = new ArrayList<Icon>();
                for (int j = 0; j < 4; j++) {
                    //all pictures about questions should go to this path
                    //make all of them png's.
                    ImageIcon icon = iconProvider.getImage(shuffledChoices.get(j));
                    icons.add(icon);
                }
            }
            //set the choices 
            setChoices(shuffledChoices, icons);
        } catch (IOException ex) {
            Logger.getLogger(QuestionPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * find the index of answer
     */
    private int findAnswer(String answer, List<String> choices) {
        for (int i = 0; i < choices.size(); i++) {
            if (choices.get(i).equals(answer)) {
                return i + 1;
            }
        }
        return 0;
    }
}
