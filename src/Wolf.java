/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class Wolf extends Enemy{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param enemyType The enemy's type.
     * @param level The enemy's level.
     */
    Wolf(String enemyType, int level){
        super(enemyType, level);
        health = level*level*15;
	maxHealth = level*level*15;
	alive = true;
	criticalPoint = 5;
	missPoint = 16;
	damageMultiplier = 1.8;
    }
}
