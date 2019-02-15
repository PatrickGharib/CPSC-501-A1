
/**
 * CPSC 501 Assignment 1
 * @author Patrick Abou Gharib
 * Original @author Patrick Abou Gharib
 * Code from cpsc 223 assignment
 *
 * 501 -v1.1 
 * removed setters/getters/variable that were unused
 * 501 -v1.2
 * renamed variables hp,str,dex for transparency
 * moved health and strength to abstract class CharacterAttributes
 * 
 * Boss class
 */
public class Boss {

    //boss attributes
    private int health;
    private int strength;
    private int accuracy;


    //Constructor
    public Boss(){
        super();
        float accuracy = 0;

    }

    //constructor scaling with player
    public Boss(Player player) {
        this.health = player.getHealth() * 20;
        this.strength =  player.getStrength() * 2;
        this.accuracy = 100 - 2*(player.getEvade());

    }

    //set functions for Boss attributes
    public void setHealth(int health){ this.health = health;}
    public void setstr(int strength){ this.strength = strength;}
    //get functions for Boss attributes
    public int getAccuracy(){ return this.accuracy;}
    /**
	 * display boss's status
	 */
	public String displayAttributes() {
        return ("\n" + getName() + 
                "\n" + " HP: " + getHealth() + 
                "\n" + "STR: " + getStrength() + "\n");
    }
}