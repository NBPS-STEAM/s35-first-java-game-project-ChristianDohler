import java.util.Scanner;
import java.util.Random;

public class dungeonGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    // enemy
    String[] enemies = { "Ghoul", "Mind Flayer", "Goblin" };
    int enemyMaxHealth = 100;
    int enemyMaxDamageDealt = 20;
    int enemyRegeneration = 20;

    // player
    int maxHealth = 100;
    int attackDamage = 45;
    int maxRegeneration = 100;

    //condition for while loop so game keeps iterating until we tell it to stop
    boolean working = true;

    System.out.println("\n \n \n \t DUNGEON ADVENTURE   ");

    System.out.println("|_________________________|");

    // used a for loop as a countdown
    for(int i = 3; i > 0; i--)
      {
        System.out.println(i);  
      }

    //labeled the loop to iterate back to it later
    GAME: while (working) {

      //gives enemy random health between 1 to 100
      int enemyHealth = rand.nextInt(enemyMaxHealth);

      //picks a random enemy from the array written earlier using the string method .length
      String enemy = enemies[rand.nextInt(enemies.length)];
      System.out.println(enemy "has appeared!");

      //create loop that starts game and asks for user input
      while(enemyHealth > 1)
      {
        System.out.println("Your Health: " + maxHealth);
        System.out.println(enemy + "'s Health: " + enemyHealth);
        System.out.println("choose your way to proceed by typing number before specified action");
        System.out.println("1. Attack");
        System.out.println("2. Run") 

        String input = input.nextLine();
        if(input.equals("1"))
        {
          int damageDealt = rand.nextInt(attackDamage);
          int damageTaken = rand.nextInt(enemyMaxDamageDealt);
          int enemyHealthBack = rand.nextInt(enemyRegeneration);
          int regainHealth = rand.nextInt(maxRegeneration);

          enemyHealth -= damageDealt;
          maxHealth -= damageTaken;
          enemyHealth += enemyHealthBack;


        }

      

      }

      
      


    }

  }
}
