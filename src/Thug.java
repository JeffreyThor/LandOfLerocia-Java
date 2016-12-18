/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class Thug extends Enemy{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param enemyType The enemy's type.
     * @param level The enemy's level.
     */
    Thug(String enemyType, int level){
        super(enemyType, level);
        health = 350;
        maxHealth = 350;
        alive = true;
        criticalPoint = 16;
        missPoint = 12;
        damageMultiplier = 1;
    }
}
