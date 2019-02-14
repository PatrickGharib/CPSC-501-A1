
/**
 * CPSC 501 Assignment 1
 * @author Patrick Abou Gharib
 * Original @author Patrick Abou Gharib
 * Code from cpsc 223 assignment
 *
 *
 * Boss class
 */
public class Boss {

    //boss attributes
    private int hp;
    private int str;
    private int dex;
    private int dodge;
    private int defence;
  

    //Constructor
    public Boss(){
        this.hp = -1;
        this.str = -1;
        float dex = 0;
        this.defence = -1;
        this.dodge = -1;

    }

    //constructor scaling with player
    public Boss(Player player) {
        this.hp = player.gethp() * 20;
        this.str =  player.getstr() * 2;
        this.dex = 100 - 2*(player.getevs());
        this.defence = 20;
        this.dodge = 0.1; 

    }

    //set functions for Boss attributes
    public void sethp(int hp){ this.hp = hp; }
    public void setstr(int str){ this.str = str; }
    public void setDodge(int dodge){ this.dodge = dodge;}
    public void setDodge(int defence){ this.dodge = defence;}


    //get functions for Boss attributes
    public int gethp(){ return this.hp; }
    public int getstr(){ return this.str ;}
    public int getdex(){ return this.dex; }
    public int getdex(){ return this.dodge;}
    public int getdex(){ return this.defence;}


    /**
	 * display boss's status
	 */
	public String displayAttributes() {
        return ("\n" + getName() + 
                "\n" + " HP: " + getHealth() + 
                "\n" + "STR: " + getStrength() + 
                "\n" + "DGE: " + getDodge() + 
                "\n" + "DEF: " + getDefense() + "\n");


}