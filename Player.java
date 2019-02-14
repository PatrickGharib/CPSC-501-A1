/**
 * CPSC 501 Assignment 1
 * @author Patrick Abou Gharib
 * Original @author Patrick Abou Gharib
 * Code from cpsc 223 assignment
 *
 * Player class
 */
import java.util.*;
public class Player {
    //Player attributes
    private int hp;
    private int str;
    private int intel;
    private int evs;
  

    //Constructor
    public Player() {
        this.hp = -1;
        this.str = -1;
        this.intel = -1;
        this.evs = -1;

    }
    //Set functions for player attributes
    public void sethp(int hp){ this.hp = hp; }
    public void setstr(int str){ this.str = str; }
    public void setintel(int intel){ this.intel = intel; }
    public void setevs(int evs){this.evs =evs;}


    //Get functions for player attributes
    public int gethp(){ return this.hp; }
    public int getstr(){ return this.str ;}
    public int getintel(){ return this.intel; }
    public int getevs(){return this.evs;}
    public char getPlayerClass(){ return this.playerClass; }
    public void displayAttributes(){
        System.out.println( "\nPlayer \n"    +
                "HP : " + this.hp + "\n" +
                "STR: " + this.str + "\n" +
                "INT: " + this.intel + "\n" +
                "EVD: " + this.evs);

    }
}