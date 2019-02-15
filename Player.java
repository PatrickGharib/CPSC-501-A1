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
                "HP : " + this.health + "\n" +
                "STR: " + this.strength + "\n" +
                "INT: " + this.intelligence + "\n" +
                "EVD: " + this.evade);

    }
}