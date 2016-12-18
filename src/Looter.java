
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
public class Looter extends Character{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param name The name of the character.
     * @param characterType The character's type.
     */
    public Looter(String name, String characterType){
        super(name, characterType);
        experience = 0;
	level = 1;
	health = 30;
	maxHealth = 30;
	gold = 1000;
	alive = true;
	criticalPoint = 16;
	missPoint = 16;
	damageMultiplier = 1.5;
	specialAttackName = "quick-hit";
    }
    
    /**
     * The looter subclasses special attack.
     *
     * @return The damage of the special attack.
     */
    @Override
    public int specialAttack(){
	int damage = 0;
	int counter = 0;
	damage = (int) (((rand.nextInt(MAX_VALUE)% (level * 2) + (level * level)) * damageMultiplier) / 2);
	do{
            counter++;
	}while(rand.nextInt(MAX_VALUE)% 2 == 0);
	damage *= counter;
	if(damage == 0)
            damage = 1;
	if(counter == 0){
            damage = 0;
	}
	else{
            
	}
	return damage;
    }
}
