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
    private int mana;
    private int totalMana;
    private int Money; 

    //Constructor
    public Player() {
        this.hp = -1;
        this.str = -1;
        this.intel = -1;
        this.evs = -1;
        this.mana = -1; 
        this.totalMana = -1;
        this.money = -1;
    }
    //Set functions for player attributes
    public void sethp(int hp){ this.hp = hp; }
    public void setstr(int str){ this.str = str; }
    public void setintel(int intel){ this.intel = intel; }
    public void setevs(int evs){this.evs =evs;}
    public void setMana(int mana){ this.mana = mana; }
	public void setTotalMana(int totalMana) { this.totalMana = totalMana; }
    public void setMoney(int money){ this.money = money; }

    //Get functions for player attributes
    public int gethp(){ return this.hp; }
    public int getstr(){ return this.str ;}
    public int getintel(){ return this.intel; }
    public int getevs(){return this.evs;}
    
    public int getMana(){ return this.mana; }
	public int getTotalMana(){ return this.totalMana; }
    public int getMoney(){ return this.money;}
    public char getPlayerClass(){ return this.playerClass; }
    public void displayAttributes(){
        System.out.println( "\nPlayer \n"    +
                "HP : " + this.hp + "\n" +
                "STR: " + this.str + "\n" +
                "INT: " + this.intel + "\n" +
                "EVD: " + this.evs);

    }
}