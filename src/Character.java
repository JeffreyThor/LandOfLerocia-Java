/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */

import static java.lang.Integer.MAX_VALUE;
import java.util.Random;

public class Character {
    
    private String name;
    private String characterType;
    protected int experience;
    protected int level;
    protected int maxHealth;
    protected int health;
    protected int gold;
    protected String specialAttackName;
    protected int criticalPoint;
    protected int missPoint;
    protected double damageMultiplier;
    protected Random rand = new Random();
    protected int[] inventory = new int[4];
    protected int stageNum;
    
    //Default Character constructor
    public Character() {
        name = "";
        characterType = "";
        experience = 0;
        level = 0;
        health = 0;
        maxHealth = 0;
        gold = 0;
        specialAttackName = "";
    }
    
    /**
     * Constructor. Sets all of the data members.
     *
     * @param name The name of the character.
     * @param characterType The character's type.
     */
    public Character(String name, String characterType) {
        this.name = name;
        this.characterType = characterType;
        inventory[0] = 1; // potion
        inventory[1] = 0; // strong potion
        inventory[2] = 0; // stronger potion
        inventory[3] = 0; // strongest potion
        stageNum = 1;
    }
    
    //Gets character's name.
    public String getName(){
	return name;
    }
    //Gets character's type.
    public String getCharacterType(){
	return characterType;
    }
    //Gets character's experience.
    public int getExperience(){
	return experience;
    }
    //Gets character's level.
    public int getLevel(){
	return level;
    }
    //Gets character's health.
    public int getHealth(){
	return health;
    }
    //Gets character's max health.
    public int getMaxHealth(){
	return maxHealth;
    }
    //Gets character's gold.
    public int getGold(){
	return gold;
    }
    //Gets character's special attack name
    public String getSpecialAttackName(){
	return specialAttackName;
    }
    //Get character's stage number (for story mode aka the path)
    public int getStageNum(){
        return stageNum;
    }
    
    /**
     * Constructor. Sets all of the data members.
     *
     * @param characterType The character's type.
     * @param name The character's name.
     * @param experience The character's experience.
     * @param level The character's level.
     * @param health The character's health.
     * @param maxHealth The character's max health.
     * @param gold The character's gold.
     */
    void setStats(String characterType, String name, int experience, int level, int health, int maxHealth, int gold, int stageNum){
        this.characterType = characterType;
        this.name = name;
        this.experience = experience;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.gold = gold;
        this.stageNum = stageNum;
    }

    //Sets character's type.
    void setCharacterType(String characterType){
        this.characterType = characterType;
    }
    //Sets character's name.
    void setName(String name){
        this.name = name;
    }
    //Sets character's experience.
    void setExperience(int experience){
        this.experience = experience;
    }
    //Sets character's level.
    void setLevel(int level){
        this.level = level;
    }
    //Sets character's health.
    void setHealth(int health){
        this.health = health;
    }
    //Sets character's max health.
    void setMaxHealth(int maxHealth){
        this.maxHealth = maxHealth;
    }
    //Sets character's gold.
    void setGold(int gold){
        this.gold = gold;
    }
    //Advances to next stage
    void nextStage(){
        this.stageNum += 1;
    }
    
    /**
     * The character's primary attack.
     *
     * @return The damage of the primary attack.
     */
    int primaryAttack(){
        int damage = 0;
        if (rand.nextInt(MAX_VALUE) % missPoint == 0){
            return damage;
        }
        else if (rand.nextInt(MAX_VALUE) % criticalPoint == 0){
            damage = (int) (((rand.nextInt(MAX_VALUE) % (level * 2) + (level * level)) * damageMultiplier) * 2);
            return damage;
        }
        else{
            damage = (int) ((rand.nextInt(MAX_VALUE) % (level * 2) + (level * level)) * damageMultiplier);
            return damage;
        }
    }
    
    public int specialAttack(){
	return 0;
    }
    
    void addItem(String item){
        if("potion".equals(item))
            inventory[0] += 1;
        else if("strong potion".equals(item))
            inventory[1] += 1;
        else if("stronger potion".equals(item))
            inventory[2] += 1;
        else if("strongest potion".equals(item))
            inventory[3] += 1;
        else
            System.err.println("Item input error");
    }
}
