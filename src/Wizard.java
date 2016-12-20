
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
public class Wizard extends Character{
    /**
     * Constructor. Sets all of the data members.
     *
     * @param name The name of the character.
     * @param characterType The character's type.
     */
    public Wizard(String name, String characterType){
        super(name, characterType);
        experience = 0;
	level = 1;
	health = 30;
	maxHealth = 30;
	gold = 500;
	criticalPoint = 12;
	missPoint = 12;
	damageMultiplier = 1.5;
	specialAttackName = "heal";
    }
    
    /**
     * The wizard subclasses special attack.
     *
     * @return The points healed by the attack.
     */
    @Override
    public int specialAttack(){
        int damage = 0;
        if (rand.nextInt(MAX_VALUE) % 3 == 0){
                   
        }
        else{
            health += maxHealth/2;
            if(health > maxHealth)
                health = maxHealth;
            }
        return 0;
    }
}
