/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class Brawler extends Enemy{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param enemyType The enemy's type.
     * @param level The enemy's level.
     */
    Brawler(String enemyType, int level){
        super(enemyType, level);
        health = 420;
        maxHealth = 420;
        alive = true;
        criticalPoint = 16;
        missPoint = 14;
        damageMultiplier = 1;
    }
}
