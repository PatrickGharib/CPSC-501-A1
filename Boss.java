
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
import java.util.*;
public class Boss extends CharacterAttributes {

    //boss attributes
    private int accuracy;


    //Constructor
    public Boss(){
        super();
        float accuracy = 0;

    }

    //constructor scaling with player
    public Boss(Player player) {
        this.setHealth(player.getHealth() * 20);
        this.setStrength(player.getStrength() * 2);
        this.accuracy = 100 - 2*(player.getEvade());

    }
    //get functions for Boss attributes
    public int getAccuracy(){ return this.accuracy;}
    /**
	 * display boss's status
	 */
	public void displayAttributes() {
        System.out.println ("\nFINAL BOSSMAN\n" + " HP: " + this.getHealth() + 
                "\n" + "STR: " + this.getStrength() + "\n");
    }
    
    public void counterAttack(Player player){
        Random random = new Random();
        int chanceToHit = random.nextInt(100);
        if(chanceToHit < this.getAccuracy()){
            player.setHealth(player.getHealth()-this.getStrength());
            System.out.printf("The Boss fights back, Striking you for %d damage!\n", this.getStrength());
        }else{System.out.printf("The Boss didnt pay attention and missed their attack\n");}
    }
}