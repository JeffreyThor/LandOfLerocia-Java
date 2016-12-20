/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class KingJack extends Enemy{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param enemyType The enemy's type.
     * @param level The enemy's level.
     */
    KingJack(String enemyType, int level){
        super(enemyType, level);
        health = 20000;
	maxHealth = 20000;
	criticalPoint = 3;
	missPoint = 18;
	damageMultiplier = 6;
    }
}
