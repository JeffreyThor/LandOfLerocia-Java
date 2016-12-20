
import static java.lang.Integer.MAX_VALUE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey Thor
 */
public class Warrior extends Character{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param name The name of the character.
     * @param characterType The character's type.
     */
    public Warrior(String name, String characterType){
        super(name, characterType);
        experience = 0;
	level = 1;
	health = 50;
	maxHealth = 50;
	gold = 500;
	criticalPoint = 20;
	missPoint = 20;
	damageMultiplier = 1.8;
	specialAttackName = "power-attack";
    }
    
    /**
     * The warrior subclasses special attack.
     *
     * @return The damage of the special attack.
     */
    @Override
    public int specialAttack(){
	int damage = 0;
	if (rand.nextInt(MAX_VALUE)% 4 == 0){
            return damage;
        }
        else if (rand.nextInt(MAX_VALUE)% criticalPoint == 0){
            damage = (int) ((((rand.nextInt(MAX_VALUE)% (level * 2) + (level * level)) * damageMultiplier) * 2) * 2);
            return damage;
        }
        else{
            damage = (int) (((rand.nextInt(MAX_VALUE)% (level * 2) + (level * level)) * damageMultiplier) * 2);
            return damage;
        }
    }
}