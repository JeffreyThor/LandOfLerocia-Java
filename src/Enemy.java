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

public class Enemy {
    private String enemyType;
    protected int level;
    protected int health;
    protected int maxHealth;
    protected boolean alive;
    protected int criticalPoint;
    protected int missPoint;
    protected double damageMultiplier;
    protected Random rand = new Random();
    
    //Default Constructor
    public Enemy(){
        enemyType = "";
	level = 0;
	health = 0;
	maxHealth = 0;
	alive = false;
    }
    
    /**
     * Constructor. Sets all of the data members.
     *
     * @param enemyType The enemies type.
     * @param level The enemy's level.
     */
    Enemy(String enemyType, int level){
        this.enemyType = enemyType;
        this.level = level;
    }
    
    //Gets enemy's type.
    String getEnemyType() {
        return enemyType;
    }
    //Gets enemy's level.
    int getLevel() {
        return level;
    }
    //Gets enemy's health.
    int getHealth() {
        return health;
    }
    //Gets enemy's max health.
    int getMaxHealth() {
        return maxHealth;
    }
    //Gets enemy's state of life.
    boolean getAlive() {
        return alive;
    }
    //Sets enemy's level.
    void setLevel(int level){
        this.level = level;
    }
    //Sets enemy's health.
    void setHealth(int health){
        this.health = health;
    }
    //Sets enemy's state of life.
    void setAlive(boolean alive){
        this.alive = alive;
    }
    
    /**
     * Calculates damage of the enemy's primary attack.
     *
     * @param temp A temp string variable that holds "miss", "hit", or "critical".
     * @return The damage of the attack.
     */
    int primaryAttack(){
        int damage = 0;
        if (rand.nextInt(MAX_VALUE) % missPoint == 0){
            return damage;
        }
        else if (rand.nextInt(MAX_VALUE) % criticalPoint == 0){
            damage = (int) (((rand.nextInt(MAX_VALUE)% (level * 2) + (level * level)) * damageMultiplier) * 2);
            return damage;
        }
        else{
            damage = (int) ((rand.nextInt(MAX_VALUE)% (level * 2) + (level * level)) * damageMultiplier);
            return damage;
        }
    }
}
