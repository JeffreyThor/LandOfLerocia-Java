/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class Jack extends Enemy{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param enemyType The enemy's type.
     * @param level The enemy's level.
     */
    Jack(String enemyType, int level){
        super(enemyType, level);
        health = 150;
        maxHealth = 150;
        alive = true;
        criticalPoint = 10;
        missPoint = 10;
        damageMultiplier = 1;
    }
}
