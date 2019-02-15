/**
 * CPSC 501 Assignment 1
 * @author Patrick Abou Gharib
 * Original @author Patrick Abou Gharib
 * Code from cpsc 223 assignment
 *
 * Player class
 * 
 * 501-v1.1 
 * removed unsused variables/setters/getters
 * 
 * 501-v 1.2 
 * renamed variables for transparency
 * 501-v1.3
 * moved strength and health to abstract class called Character Attributes
 * 
 */
import java.util.*;
public class Player extends CharacterAttributes{
    //Player attributes
    private int intelligence;
    private int evade;
    //Constructor
    public Player() {
        this.intelligence = -1;
        this.evade = -1;
    }
    //Set functions for player attributes
    public void setIntelligence(int intelligence){ this.intelligence = intelligence; }
    public void setEvade(int evade){this.evade = evade;}
    //Get functions for player attributes
    public int getIntelligence(){ return this.intelligence; }
    public int getEvade(){return this.evade;}
    public void displayAttributes(){
        System.out.println( "\nPlayer \n"    +
                "HP : " + this.getHealth() + "\n" +
                "STR: " + this.getStrength() + "\n" +
                "INT: " + this.intelligence + "\n" +
                "EVD: " + this.evade);
    }
    
    public void generateThief(Player player){
        Random random = new Random();
        player.setHealth(random.nextInt(5) + 10);
        player.setStrength(random.nextInt(5));
        player.setIntelligence(random.nextInt(5) + 5);
        player.setEvade(random.nextInt(10) + 15);
    }
    public void generateWarrior(Player player){ 
        Random random =  new Random();
        player.setHealth(random.nextInt(5) + 15);
        player.setStrength(random.nextInt(10) + 15);
        player.setIntelligence(random.nextInt(5) + 5);
        player.setEvade(random.nextInt(5) +5);
    }
    public void generateMage(Player player){
        Random random =  new Random();
        player.setHealth(random.nextInt(5) + 10);
        player.setStrength(random.nextInt(5) + 5);
        player.setIntelligence(random.nextInt(10) + 20);
        player.setEvade(random.nextInt(5) + 5);
    }
    public void attack(int attackType, Boss boss){
        if (attackType == 1){
            boss.setHealth(boss.getHealth()-this.getStrength());
            System.out.printf("\nYou did %d damage!\n", this.getStrength());

        }else{
            boss.setHealth(boss.getHealth()-this.getIntelligence());
            System.out.printf("\nYou did %d damage!\n", this.getIntelligence());
        }
    }
    public void healthBoost(){
        this.setHealth(this.getHealth() + 10);
    }
}