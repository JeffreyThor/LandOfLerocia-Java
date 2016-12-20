/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class Brute extends Enemy{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param enemyType The enemy's type.
     * @param level The enemy's level.
     */
    Brute(String enemyType, int level){
        super(enemyType, level);
        health = level*level*18;
	maxHealth = level*level*18;
	criticalPoint = 16;
	missPoint = 20;
	damageMultiplier = 1.6;
    }
}
