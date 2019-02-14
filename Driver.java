 /**
 * CPSC 501 Assignment 1
 * @author Patrick Abou Gharib
 * Original @author Patrick Abou Gharib
 * Code from cpsc 223 assignment
 *
 *
 * Driver class to run game
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
        while(true){
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
                //create warrior
                Random random =  new Random();
                player.sethp(random.nextInt(5) + 15);
                player.setstr(random.nextInt(10) + 15);
                player.setintel(random.nextInt(5) + 5);
                player.setevs(random.nextInt(5) +5);
                break;
            }
            else if(choice == 2){
                //create mage
                Random random =  new Random();
                player.sethp(random.nextInt(5) + 10);
                player.setstr(random.nextInt(5) + 5);
                player.setintel(random.nextInt(10) + 20);
                player.setevs(random.nextInt(5) + 5);

                break;
            }
            else if(choice == 3){
                //create thief
                Random random = new Random();
                player.sethp(random.nextInt(5) + 10);
                player.setstr(random.nextInt(5));
                player.setintel(random.nextInt(5) + 5);
                player.setevs(random.nextInt(10) + 15);
                break;
            }
            else {
                System.out.println("Out of range");
            }
        }
        player.displayAttributes();


        //spawn boss
        System.out.println("\nSpawning boss! Get Ready!");
        boss = new Boss(player);

        //keep playing while player and boss still alive
        while(player.gethp() > 0 && boss.gethp() > 0) {
            System.out.println("------------------------------");
            System.out.println("\nTURN: " + turn);
            boss.displayAttributes();
            player.displayAttributes();
            System.out.println("NOTE: every 2 turns survived increases your HP");

            System.out.println("\n1| Physical Attack\n" +
                    "2| Magical Attack\n" +
                    "3| Quit game");
            System.out.print("Enter a choice: ");

            while(!input.hasNextInt()) {
                input.next();
                System.out.print("Enter a valid integer: ");
            }
            choice =  input.nextInt();

            Random random = new Random();
            int chanceToHit = random.nextInt(100);


            if(choice == 1) {
                System.out.printf("\nYou did %d damage!\n", player.getstr());
                boss.sethp(boss.gethp() - player.getstr());

                if(chanceToHit < boss.getdex()) {
                    System.out.printf("The boss retaliates and does %d damage!\n", boss.getstr());
                    player.sethp(player.gethp() - boss.getstr());
                }
                else {
                    System.out.println("The boss missed its counterattack!");
                }
            }
            else if(choice == 2) {
                System.out.printf("\nYou did %d damage!\n", player.getintel());
                boss.sethp(boss.gethp() - player.getintel());

                if(chanceToHit < boss.getdex()) {
                    System.out.printf("The boss retaliates and does %d damage!\n", boss.getstr());
                    player.sethp(player.gethp() - boss.getstr());
                }
                else {
                    System.out.println("The boss missed its counterattack!\n");
                }
            }
            else if(choice == 3) {
                System.out.println("quitting game...");
                break;
            }
            else {
                System.out.print("Enter a valid integer:");
            }

            //increase hp every 2 turns
            if((turn%2) == 0) {
                player.sethp(player.gethp() + 10);
            }
            turn++;
        }

        if(player.gethp() <= 0) {
            System.out.println("YOU DIED");
            if(turn <= 3)
                System.out.println("lol git gud");

        }
        else if (boss.gethp() <= 0) {
            System.out.printf("You won the game in %d turns!", turn);
        }

    }



}