public abstract class CharacterAttributes{
/**
 * CPSC 501 A1
 * @author Patrick Abou Gharib
 *
 * abstract class to house shared attributes of Player and Boss classes
 * 
 */
private int health;
private int strength; 

public CharacterAttributes(){
    this.strength = -1;
    this.health = -1;
    }
public int getHealth(){return this.health;}
public int getStrength(){return this.strength;}
public void setHealth(int health){this.health = health;}
public void setStrength(int strength){this.strength = strength;}
public abstract void displayAttributes();
}