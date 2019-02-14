
/**
 * CPSC 501 Assignment 1
 * @author Patrick Abou Gharib
 * Original @author Patrick Abou Gharib
 * Code from cpsc 223 assignment
 *
 * 501 -v1.1 
 * removed setters/getters/variable that were unused
 *
 * Boss class
 */
public class Boss {

    //boss attributes
    private int hp;
    private int str;
    private int dex;


    //Constructor
    public Boss(){
        this.hp = -1;
        this.str = -1;
        float dex = 0;

    }

    //constructor scaling with player
    public Boss(Player player) {
        this.hp = player.gethp() * 20;
        this.str =  player.getstr() * 2;
        this.dex = 100 - 2*(player.getevs());

    }

    //set functions for Boss attributes
    public void sethp(int hp){ this.hp = hp; }
    public void setstr(int str){ this.str = str; }



    //get functions for Boss attributes
    public int gethp(){ return this.hp; }
    public int getstr(){ return this.str ;}
    public int getdex(){ return this.dex; }


    /**
	 * display boss's status
	 */
	public String displayAttributes() {
        return ("\n" + getName() + 
                "\n" + " HP: " + getHealth() + 
                "\n" + "STR: " + getStrength() + "\n");
    }
}