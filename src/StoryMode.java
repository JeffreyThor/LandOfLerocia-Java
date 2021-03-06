/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffreythor
 */
public class StoryMode extends javax.swing.JFrame {
    VillageWindow village;
    Character character;
    /**
     * Creates new form StoryMode
     */
    public StoryMode() {
        initComponents();
    }
    // Allows story to receive the instance of village to be used
    public void sendVillage(VillageWindow village){
        this.village = village;
    }
    // Allows story to receive the instance of character to be sued
    public void sendCharacter(Character character){
        this.character = character;
    }
    // Runs the story scene the player has reached
    public void playStory(){
        if(character.getStageNum() == 1){
            storyStage.setText("Stage 1");
            storyText.setText("As you begin to leave the village, you come across a man standing on the side of the path. He begins to speak to you as you approach.\nStranger: My name's Jack. Are you headed to the Lerocian Castle? I wouldn't recommend it. I've gotten word that they're not letting anyone near it today, not quite sure why. You'd be wasting your time to go, I'd say just turn around now.\nJack: No you say? I didn't want to have to do this, but I can't let you go any further.\nJack begins to charge you! You have no choice but to defend yourself!");
        }
        else if(character.getStageNum() == 2){
            storyStage.setText("Stage 2");
            storyText.setText("Jack: Stop stop, you win! You have no idea what you've just done. But there's no hope for you, you'll never even come close to that castle.\nYou continue down the path, leaving Jack behind. Unfortunately for you it looks like he's got some friends up the road. What could they be hiding? The people on the path approach you quickly, better prepare for another battle.");
        }
        else if(character.getStageNum() == 3){
            storyStage.setText("Stage 3");
            storyText.setText("You stand above the mangled bodies of your three foes and you know you have to keep moving.\nThis isn't going to be easy, but you know something's definitely going on up by the castle. You may not survive the journey, but you should keep going to investigate. You can't turn your back to whatever's going on. Looks like there are a couple knights from the castle up ahead. As you approach them you realize they aren't from Lerocia, looks like trouble.");
        }
        else if(character.getStageNum() == 4){
            storyStage.setText("Stage 4");
            storyText.setText("Where did those knights come from? You have got to get to that castle, and fast.\nYou can finally see the castle gates! But looks like there's someone waiting for you. It looks like a giant orc!");
        }
        else if(character.getStageNum() == 5){
            storyStage.setText("Stage 5");
            storyText.setText("He's definitely not getting back up, looks like you can head through the gate.\nAs you open the gate you see war raging everywhere! Fires throughout the castle and Lerocian soldiers under attack! Who's behind all of this? You have to find out, so you run through the raging war towards the center of the castle. As you approach the throne room you see the only thing standing between you and the doorway are three massive guards. Last chance, do you fight?");
        }
        else if(character.getStageNum() == 6){
            storyStage.setText("Stage 6");
            storyText.setText("That's it, the guards are dead. It's time to see who's behind all of this.\nYou open the massive doors, look up, and hear a familiar voice...\nIt's Jack! He was supposed to be long dead!\nJack: Hello " + character.getName() + ". I've been expecting you.\nJack: Now you're probably wondering how I'm still alive. Well to be honest I let you beat me the first time we fought. I was wondering how long it would take you to get here. Now that I've killed the king and taken over the kingdom, I am the ruler of the Land of Lerocia!\nYou see the king laying dead at his feet.\nJack: Now don't say a word " + character.getName() + ", I know why you're here. You think you can kill me. Too bad I'm not going to take it easy this time.");
        }
        else if(character.getStageNum() == 7){
            storyStage.setText("Congratulations!");
            storyText.setText("Jack: No! How could this be, I conquered an entire kingdom and lose to you!\nYou watch Jack take his last breath as you walk out of the throne room. The rebellion begins to look up as they see you, victorious. Their leader is dead. You don't say a word, you return to the village, the war slowly dies down.\nThe Land of Lerocia is saved!");
            continueButton.setEnabled(false);
        }
        else{
            System.err.println("Stage selection error");
        }
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
        storyText = new javax.swing.JTextArea();
        storyStage = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        toVillageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        storyText.setEditable(false);
        storyText.setColumns(20);
        storyText.setLineWrap(true);
        storyText.setRows(5);
        storyText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(storyText);

        storyStage.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        storyStage.setText("Stage n");

        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        toVillageButton.setText("To Village");
        toVillageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toVillageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(storyStage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(toVillageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(storyStage)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toVillageButton)
                    .addComponent(continueButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        // TODO add your handling code here:
        Battle battle = new Battle();
        Enemy enemy;
        switch (character.getStageNum()) {
            case 1:
                enemy = new Jack("jack", 3);
                break;
            case 2:
                enemy = new Thug("thug", 5);
                //enemy = new Brawler("brawler", 6);
                //enemy = new Hunter("hunter", 7);
                break;
            case 3:
                enemy = new Knight("knight1", 10);
                //enemy = new Knight("knight2, 11);
                break;
            case 4:
                enemy = new Orc("orc", 17);
                break;
            case 5:
                enemy = new Guardian("guardian1", 20);
                //enemy = new Guardian("guardian2", 20);
                //enemy = new Guardian("guardian3", 20);
                break;
            case 6:
                enemy = new KingJack("kingJack", 25);
                break;
            default:
                enemy = new Enemy();
                System.err.println("Stage selection error");
                break;
        }
        battle.sendEnemy(enemy);
        battle.sendCharacter(character);
        battle.sendVillage(village);
        battle.sendStory(this);
        battle.updateBattleStats();
        this.setVisible(false);
        battle.setVisible(true);
    }//GEN-LAST:event_continueButtonActionPerformed

    private void toVillageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toVillageButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        village.setVisible(true);
    }//GEN-LAST:event_toVillageButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StoryMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoryMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoryMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoryMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoryMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel storyStage;
    private javax.swing.JTextArea storyText;
    private javax.swing.JButton toVillageButton;
    // End of variables declaration//GEN-END:variables
}
