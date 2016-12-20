/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class Hunter extends Enemy{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param enemyType The enemy's type.
     * @param level The enemy's level.
     */
    Hunter(String enemyType, int level){
        super(enemyType, level);
        health = 490;
	maxHealth = 490;
	criticalPoint = 3;
	missPoint = 24;
	damageMultiplier = 1.4;
    }
}
