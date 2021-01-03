import java.util.Scanner;
import java.util.Random;

public class dungeonGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    // enemy
    String[] enemies = { "Ghoul", "Mind Flayer", "Goblin" };
    int enemyMaxHealth = 100;
    int enemyMaxDamageDealt = 30;
    int enemyRegeneration = 15;

    // player
    int maxHealth = 100;
    int swordDamage = 45;
    int magicDamage = 30;
    int maxRegeneration = 30;
    int chanceAttack = 100;

    //condition for while loop so game keeps iterating until we tell it to stop
    boolean working = true;

    System.out.println("\n \n \n Loading....");
    // used a for loop as a countdown
    for(int i = 3; i > 0; i--)
      {
        System.out.println(i);  
      }


    System.out.println("\n \n \t DUNGEON ADVENTURE ");

    System.out.println("|_________________________|\n");
    
    System.out.println("****************Description(please read before starting game)****************\n");

    System.out.println("*Your sword attacks have a chance to damage the enemy more but you get hit for a little bit of damage as well*\n");

    System.out.println("*Your magic attacks cannot hit for as much as your sword attacks damage for less but you are able to regain a little bit of health after each hit.Your health must be less than 70 in order to use your magic attack.Your magic attacks however also allow the enemy to regain a little bit of health back as well*\n");

    System.out.println("*Chance attacks are 50/50 attacks. You have to guess a number between 1 and 3 and if you get it right you fully eliminate the enemy. However if you guess wrong you automatically lose and end the game*\n \n \n \n \n \n \n");


    
    
    //labeled the loop to iterate back to it later
    GAME: while (working) {
      

      //gives enemy random health between 1 to 100
      int enemyHealth = rand.nextInt(enemyMaxHealth);

      //picks a random enemy from the array written earlier using the string method .length
      String enemy = enemies[rand.nextInt(enemies.length)];
      System.out.println("a " + enemy + " has appeared!\n");

      //create loop that starts game and asks for user input
      while(enemyHealth > 1)
      {
        System.out.println("Your Health: " + maxHealth);
        System.out.println(enemy + "'s Health: " + enemyHealth + "\n");
        System.out.println("choose your way to proceed by typing number before specified action\n");
        
        System.out.println("1. Sword Attack");
        System.out.println("2. Magic Attack");
        System.out.println("3. Chance Attack");
        System.out.println("3. Run\n");

        String userInput = input.nextLine();

        System.out.println("\n");

        if(userInput.equals("1"))
        {
          int damageDealt = rand.nextInt(swordDamage);
          int damageTaken = rand.nextInt(enemyMaxDamageDealt);
          
          
          
          enemyHealth -= damageDealt;
          maxHealth -= damageTaken;


          System.out.println("Your sword slash strikes the " + enemy + " for " + damageDealt + " damage");
          System.out.println("HOWEVER, the " + enemy + " was able to get a hit of you and hit you for " + damageTaken + " health\n");


        }
        else if(userInput.equals("2") && maxHealth <= 70)
        {
          
          int enemyHealthBack = rand.nextInt(enemyRegeneration);
          int magicAttack = rand.nextInt(magicDamage);
          int playerRegeneration = rand.nextInt(maxRegeneration);
        }

      

      }

      
      


    }

  }
}
