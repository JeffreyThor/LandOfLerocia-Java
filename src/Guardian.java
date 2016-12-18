/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class Guardian extends Enemy{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param enemyType The enemy's type.
     * @param level The enemy's level.
     */
    Guardian(String enemyType, int level){
        super(enemyType, level);
        health = 5000;
	maxHealth = 5000;
	alive = true;
	criticalPoint = 6;
	missPoint = 8;
	damageMultiplier = 2.6;
    }
}
