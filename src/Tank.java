/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class Tank extends Enemy{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param enemyType The enemy's type.
     * @param level The enemy's level.
     */
    Tank(String enemyType, int level){
        super(enemyType, level);
        health = level*level*16;
	maxHealth = level*level*16;
	alive = true;
	criticalPoint = 20;
	missPoint = 20;
	damageMultiplier = .8;
    }
}
