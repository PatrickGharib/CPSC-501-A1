 /**
 * CPSC 501 Assignment 1
 * @author Patrick Abou Gharib
 * Original @author Patrick Abou Gharib
 * Code from cpsc 223 assignment
 *
 * 501 -v1.1 
 * renamed set and get methods to match player and boss
 * Driver class to run game
 *
 */
import java.util.*;
public class Driver {

    
    public static void main(String[] args) {
        //setup game stats
        Player player = new Player();
        Boss boss = new Boss();
        int turn = 1;
        int choice = -1;
        System.out.println("Welcome to the game!");
        Scanner input = new Scanner(System.in);
        characterCreation(input,choice,player);
        player.displayAttributes();
        //spawn boss
        System.out.println("\nSpawning boss! Get Ready!");
        boss = new Boss(player);
        //keep playing while player and boss still alive
        while(player.getHealth() > 0 && boss.getHealth() > 0) {
            System.out.println("------------------------------");
            System.out.println("\nTURN: " + turn);
            boss.displayAttributes();
            player.displayAttributes();

            System.out.println("\n1| Physical Attack\n" +
                    "2| Magical Attack\n" +
                    "3| Quit game");
            System.out.print("Enter a choice: ");

            while(!input.hasNextInt()) {
                input.next();
                System.out.print("Enter a valid integer: ");
            }
            choice =  input.nextInt();

            if(choice == 1) {
                player.attack(1, boss);
                boss.counterAttack(player);
            }
            else if(choice == 2) {
                player.attack(2, boss);
                boss.counterAttack(player);
            }
            else if(choice == 3) {
                System.out.println("quitting game...");
                break;
            }
            else {
                System.out.print("Enter a valid integer:");
            }
            //increase Health every 2 turns
            
            if((turn%2) == 0 && player.getHealth() > 0) {
               player.healthBoost();
               System.out.println("\nPlayer gets a whole 10 health every 2 turns\n");
            }
            turn++;
        }
        if(player.getHealth() <= 0) {
            System.out.println("YOU DIED");
            if(turn <= 3)
                System.out.println("lol git gud");
        }
        else if (boss.getHealth() <= 0) {
            System.out.printf("You won the game in %d turns!", turn);
        }
    }
    public static void characterCreation(Scanner input, int choice ,Player player) {while(true){
        System.out.println( "1| Select Warrior Class\n" +
                "2| Select Mage Class\n" +
                "3| Select Thief Class" );
        System.out.print("Enter a choice: ");
        //check if integer input
        while(!input.hasNextInt()){
            input.next();
            System.out.print("Enter a valid integer: ");
        }
        choice = input.nextInt();

        if(choice == 1){
            //make a warrior
            player.generateWarrior(player);
            break;
        }
        else if(choice == 2){
            //create mage
            player.generateMage(player);
            break;
        }
        else if(choice == 3){
            //create thief
            player.generateThief(player);
            break;
        }
        else {
            System.out.println("Not an option SCRUB");
        }
    }
}
}