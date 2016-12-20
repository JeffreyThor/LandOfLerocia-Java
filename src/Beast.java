/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class Beast extends Enemy{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param enemyType The enemy's type.
     * @param level The enemy's level.
     */
    Beast(String enemyType, int level){
        super(enemyType, level);
        health = level*level*10;
	maxHealth = level*level*10;
	criticalPoint = 12;
	missPoint = 12;
	damageMultiplier = 1.2;
    }
}
