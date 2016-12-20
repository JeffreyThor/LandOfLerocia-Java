/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class Battle extends javax.swing.JFrame {
    private Character character;
    private Enemy enemy;
    private VillageWindow village;
    private StoryMode story;
    /**
     * Creates new form River
     */
    public Battle() {
        initComponents();
    }
    // Allows battle to receive the instance of character to be used
    public void sendCharacter(Character character){
        this.character = character;
    }
    // Allows battle to receive the instance of enemy to be used
    public void sendEnemy(Enemy enemy){
        this.enemy = enemy;
    }
    // Allows battle to receive the instance of village to be used
    public void sendVillage(VillageWindow village){
        this.village = village;
    }
    // Allows battle to receive the instance of story to be used
    public void sendStory(StoryMode story){
        this.story = story;
    }
    // Updates visible battle stats in the GUI
    public void updateBattleStats(){
        characterNameLabel.setText(character.getName());
        characterCurrentHealth.setText(Integer.toString(character.getHealth()));
        characterGold.setText(Integer.toString(character.getGold()));
        characterLevel.setText(Integer.toString(character.getLevel()));
        characterMaxHealth.setText(Integer.toString(character.getMaxHealth()));
        characterHealthBar.setValue(character.getHealth()*100/character.getMaxHealth());
        specialButton.setText(character.getSpecialAttackName());
        
        enemyTypeLabel.setText(enemy.getEnemyType());
        enemyLevel.setText(Integer.toString(enemy.getLevel()));
        enemyMaxHealth.setText(Integer.toString(enemy.getMaxHealth()));
        enemyCurrentHealth.setText(Integer.toString(enemy.getHealth()));
        enemyHealthBar.setValue(enemy.getHealth()*100/enemy.getMaxHealth());
    }
    // Called when character (player) loses the battle
    public void characterDefeated(){
        this.setVisible(false);
        village.setVisible(true);
        character.setGold(character.getGold()/2);
        character.setHealth(character.getMaxHealth());
        village.updateStatLabels();
    }
    // Called when enemy loses the battle
    public void enemyDefeated(){
        int gold;
        // Used to check if battle was part of the path (story mode) and if so continues accordingly
        if(enemy.getEnemyType().matches("jack|hunter|knight2|orc|guardian3")){
            character.nextStage();
            story.sendVillage(village);
            story.sendCharacter(character);
            story.playStory();
            this.setVisible(false);
            story.setVisible(true);
            return;
        }
        else if("thug".equals(enemy.getEnemyType())){
            this.enemy = new Brawler("brawler", 6);
            updateBattleStats();
            return;
        }
        else if("brawler".equals(enemy.getEnemyType())){
            this.enemy = new Hunter("hunter", 7);
            updateBattleStats();
            return;
        }
        else if("knight1".equals(enemy.getEnemyType())){
            this.enemy = new Knight("knight2", 11);
            updateBattleStats();
            return;
        }
        else if("guardian1".equals(enemy.getEnemyType())){
            this.enemy = new Guardian("guardian2", 20);
            updateBattleStats();
            return;
        }
        else if("guardian2".equals(enemy.getEnemyType())){
            this.enemy = new Guardian("guardian3", 20);
            updateBattleStats();
            return;
        }
        else if("kingJack".equals(enemy.getEnemyType())){
            //Player has won
            character.nextStage();
            story.sendVillage(village);
            story.sendCharacter(character);
            story.playStory();
            this.setVisible(false);
            story.setVisible(true);
            return;
        }
        if("looter".equals(character.getCharacterType()))
            gold = enemy.getLevel()*80;
        else
            gold = enemy.getLevel()*40;
        character.setExperience((int) (character.getExperience()+Math.sqrt(enemy.getLevel()*1000)));
        character.setGold(character.getGold()+gold);
        this.setVisible(false);
        village.setVisible(true);
        if(character.getExperience() >= character.getLevel()*20){
            character.setLevel(character.getLevel()+1);
            character.setMaxHealth(character.getMaxHealth()+character.getLevel()*20);
            character.setHealth(character.getMaxHealth());
            character.setExperience(0);
        }
        village.updateStatLabels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enemyTypeLabel = new javax.swing.JLabel();
        characterNameLabel = new javax.swing.JLabel();
        attackButton = new javax.swing.JButton();
        specialButton = new javax.swing.JButton();
        inventoryButton = new javax.swing.JButton();
        escapeButton = new javax.swing.JButton();
        enemyLevelLabel = new javax.swing.JLabel();
        enemyHealthLabel = new javax.swing.JLabel();
        characterLevelLabel = new javax.swing.JLabel();
        characterHealthLabel = new javax.swing.JLabel();
        characterGoldLabel = new javax.swing.JLabel();
        enemyLevel = new javax.swing.JLabel();
        enemyMaxHealth = new javax.swing.JLabel();
        enemyCurrentHealth = new javax.swing.JLabel();
        splitEnemyHealth = new javax.swing.JLabel();
        characterLevel = new javax.swing.JLabel();
        characterMaxHealth = new javax.swing.JLabel();
        characterCurrentHealth = new javax.swing.JLabel();
        splitCharacterHealth = new javax.swing.JLabel();
        characterGold = new javax.swing.JLabel();
        enemyHealthBar = new javax.swing.JProgressBar();
        characterHealthBar = new javax.swing.JProgressBar();
        enemyResult = new javax.swing.JLabel();
        characterResult = new javax.swing.JLabel();
        characterSpecial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enemyTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        enemyTypeLabel.setText("Enemy");

        characterNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        characterNameLabel.setText("Character");

        attackButton.setText("Attack");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        specialButton.setText("Special");
        specialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialButtonActionPerformed(evt);
            }
        });

        inventoryButton.setText("Inventory");
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });

        escapeButton.setText("Escape");
        escapeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escapeButtonActionPerformed(evt);
            }
        });

        enemyLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enemyLevelLabel.setText("LEVEL");

        enemyHealthLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enemyHealthLabel.setText("HEALTH");

        characterLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        characterLevelLabel.setText("LEVEL");

        characterHealthLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        characterHealthLabel.setText("HEALTH");

        characterGoldLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        characterGoldLabel.setText("GOLD");

        enemyLevel.setText("level");

        enemyMaxHealth.setText("max");

        enemyCurrentHealth.setText("current");

        splitEnemyHealth.setText("/");

        characterLevel.setText("level");

        characterMaxHealth.setText("max");

        characterCurrentHealth.setText("current");

        splitCharacterHealth.setText("/");

        characterGold.setText("gold");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(characterHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(characterSpecial, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(characterResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enemyHealthBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enemyResult, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(characterLevel)
                                    .addGap(18, 18, 18)
                                    .addComponent(characterCurrentHealth)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(splitCharacterHealth)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(characterMaxHealth))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(characterLevelLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(characterHealthLabel)))
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(characterGoldLabel)
                                .addComponent(characterGold)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(inventoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(attackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(5, 5, 5)))
                    .addComponent(characterNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enemyLevelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enemyHealthLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(enemyCurrentHealth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(splitEnemyHealth))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enemyLevel)
                                .addGap(119, 119, 119)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enemyMaxHealth))
                    .addComponent(specialButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(escapeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enemyTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enemyTypeLabel)
                    .addComponent(characterNameLabel))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(characterLevelLabel)
                    .addComponent(characterHealthLabel)
                    .addComponent(characterGoldLabel)
                    .addComponent(enemyLevelLabel)
                    .addComponent(enemyHealthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(characterLevel)
                    .addComponent(characterCurrentHealth)
                    .addComponent(splitCharacterHealth)
                    .addComponent(characterMaxHealth)
                    .addComponent(characterGold)
                    .addComponent(enemyLevel)
                    .addComponent(enemyCurrentHealth)
                    .addComponent(splitEnemyHealth)
                    .addComponent(enemyMaxHealth))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enemyHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(characterHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enemyResult)
                    .addComponent(characterResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(characterSpecial)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attackButton)
                    .addComponent(specialButton))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inventoryButton)
                    .addComponent(escapeButton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escapeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escapeButtonActionPerformed
        // TODO add your handling code here:
        village.updateStatLabels();
        this.setVisible(false);
        village.setVisible(true);
    }//GEN-LAST:event_escapeButtonActionPerformed

    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed
        // TODO add your handling code here:
        int damage = character.primaryAttack();
        enemy.setHealth(enemy.getHealth()-damage);
        if(damage == 0)
            enemyResult.setText("Miss!");
        else
            enemyResult.setText("-" + Integer.toString(damage));
        characterSpecial.setText("");
        if(enemy.getHealth() <= 0){
            enemyDefeated();
            return;
        }
        damage = enemy.primaryAttack();
        character.setHealth(character.getHealth()-damage);
        if(damage == 0)
            characterResult.setText("Miss!");
        else
            characterResult.setText("-" + Integer.toString(damage));
        if(character.getHealth() <= 0){
            characterDefeated();
            return;
        }
        updateBattleStats();
    }//GEN-LAST:event_attackButtonActionPerformed

    private void specialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialButtonActionPerformed
        // TODO add your handling code here:
        int tmpHealth = character.getHealth();
        int damage = character.specialAttack();
        int gold;
        enemy.setHealth(enemy.getHealth()-damage);
        if(damage == 0){
            if("wizard".equals(character.getCharacterType()))
                enemyResult.setText("");
            else
                enemyResult.setText("Miss!");
        }
        else
            enemyResult.setText("-" + Integer.toString(damage));
        if("warrior".equals(character.getCharacterType()))
            characterSpecial.setText("Power Attack!");
        else if("wizard".equals(character.getCharacterType()))
            if(character.getHealth() == tmpHealth)
                characterSpecial.setText("Heal Failed!");
            else
                characterSpecial.setText("Healed!");
        else if("looter".equals(character.getCharacterType()))
            characterSpecial.setText("Quick Hit!");
        else
            enemyResult.setText("-" + Integer.toString(damage));
        if(enemy.getHealth() <= 0){
            enemyDefeated();
            return;
        }
        damage = enemy.primaryAttack();
        character.setHealth(character.getHealth()-damage);
        characterResult.setText("-" + Integer.toString(damage));
        if(character.getHealth() <= 0){
            characterDefeated();
            return;
        }
        updateBattleStats();
    }//GEN-LAST:event_specialButtonActionPerformed

    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed
        // TODO add your handling code here:
        Inventory inventory = new Inventory();
        inventory.sendCharacter(character);
        inventory.sendBattle(this);
        inventory.updateInventory();
        this.setVisible(false);
        inventory.setVisible(true);
    }//GEN-LAST:event_inventoryButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Battle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attackButton;
    private javax.swing.JLabel characterCurrentHealth;
    private javax.swing.JLabel characterGold;
    private javax.swing.JLabel characterGoldLabel;
    private javax.swing.JProgressBar characterHealthBar;
    private javax.swing.JLabel characterHealthLabel;
    private javax.swing.JLabel characterLevel;
    private javax.swing.JLabel characterLevelLabel;
    private javax.swing.JLabel characterMaxHealth;
    private javax.swing.JLabel characterNameLabel;
    private javax.swing.JLabel characterResult;
    private javax.swing.JLabel characterSpecial;
    private javax.swing.JLabel enemyCurrentHealth;
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JLabel enemyHealthLabel;
    private javax.swing.JLabel enemyLevel;
    private javax.swing.JLabel enemyLevelLabel;
    private javax.swing.JLabel enemyMaxHealth;
    private javax.swing.JLabel enemyResult;
    private javax.swing.JLabel enemyTypeLabel;
    private javax.swing.JButton escapeButton;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JButton specialButton;
    private javax.swing.JLabel splitCharacterHealth;
    private javax.swing.JLabel splitEnemyHealth;
    // End of variables declaration//GEN-END:variables
}
