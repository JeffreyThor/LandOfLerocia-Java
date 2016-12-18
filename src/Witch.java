/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class Witch extends Enemy{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param enemyType The enemy's type.
     * @param level The enemy's level.
     */
    Witch(String enemyType, int level){
        super(enemyType, level);
        health = level*level*12;
	maxHealth = level*level*12;
	alive = true;
	criticalPoint = 24;
	missPoint = 2;
	damageMultiplier = 2.6;
    }
}
