import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.util.Random;

public class dungeonGame {
  public static void main(String[] args) throws InterruptedException{
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    // enemy
    String[] enemies = { "Ghoul", "Mind Flayer", "Goblin", "Ghost"};
    int enemyMaxHealth = 100;
    int enemyMaxDamageDealt = 40;
    int enemyRegeneration = 15;

    // player
    int maxHealth = 100;
    int swordDamage = 40;
    int magicDamage = 30;
    int maxRegeneration = 40;
    

    //condition for while loop so game keeps iterating until we tell it to stop
    boolean working = true;

    System.out.println("\n \n \n Loading....");
    // used a for loop as a countdown
    for(int i = 3; i > 0; i--)
      {
        System.out.println(i);
        Thread.sleep(2000);  
      }

    //Title and Instructions
    System.out.println("\n \n \t DUNGEON ADVENTURE ");

    System.out.println("|_________________________|\n");
    
    System.out.println("****************Description(please read before starting game)****************\n");

    System.out.println("*Your sword attacks have a chance to damage the enemy more but you get hit for a little bit of damage as well*\n");

    System.out.println("*Your magic attacks cannot hit for as much as your sword attacks damage for less but you are able to regain a little bit of health after each hit.Your health must be less than 70 in order to use your magic attack.Your magic attacks however also allow the enemy to regain a little bit of health back as well*\n");


    System.out.println("_____________________________________");


    
    
    //labeled the loop to iterate back to it later
    GAME: while (working) {
      

      //gives enemy random health between 1 to 100
      int enemyHealth = rand.nextInt(enemyMaxHealth);

      //picks a random enemy from the array written earlier using the string method .length
      String enemy = enemies[rand.nextInt(enemies.length)];
      System.out.println("a " + enemy + " has appeared!\n");

      //create loop that starts game and asks for user input
      while(enemyHealth > 0)
      {
        System.out.println("Your Health: " + maxHealth);
        System.out.println(enemy + "'s Health: " + enemyHealth + "\n");
        System.out.println("choose your way to proceed by typing number before specified action\n");
        
        System.out.println("1. Sword Attack");
        System.out.println("2. Magic Attack");
        System.out.println("3. Run");
        
        //Asks for user to input a number needed to perform an action
        String userInput = input.nextLine();

        System.out.println("\n");
        System.out.println("_____________________________________\n");
         
        //If statement to show what would happen in a sword attack
        if(userInput.equals("1"))
        {
          //Creates a random amount of damage taken and a random amount of damage given so it keeps game interesting
          int damageDealt = rand.nextInt(swordDamage);
          int damageTaken = rand.nextInt(enemyMaxDamageDealt);
          
          
          //Takes damage off both players and enemies health
          enemyHealth -= damageDealt;
          maxHealth -= damageTaken;


          System.out.println("Your sword slash strikes the " + enemy + " for " + damageDealt + " damage");
          System.out.println("HOWEVER, the " + enemy + " was able to get a hit of you and hit you for " + damageTaken + " health\n");
          
        }
         if(maxHealth < 1)
          {
          System.out.println("You sustained too much damage, you limp out the dungeon in retreat\n");
          break GAME;
          }
         

        //else if statement to show what happens if user were to do a  magic attack
        else if(userInput.equals("2") )
        {
          if(maxHealth >=1 && maxHealth <=70)
          {
           int enemyHealthBack = rand.nextInt(enemyRegeneration);
           int magicAttack = rand.nextInt(magicDamage);
           int playerRegeneration = rand.nextInt(maxRegeneration);

           enemyHealth += enemyHealthBack;
           enemyHealth -= magicAttack;
           maxHealth += playerRegeneration;

           System.out.println("You have used your magic attack on the " + enemy + " and have induced " + magicAttack + " damage upon it\n");

           System.out.println("In doing this you have gained " + playerRegeneration + " health back....However some of this magic bounced of the " + enemy + " and they have received " + enemyHealthBack + " health back as well\n");

          }
          //if players health is above 70 they are not allowed to use magic attack
          else
          {
          System.out.println("You have too much health to use a magic attack. Once you get below 70 then you will be able to use it\n \n \n ");
          }

         
          
        }
        //else if statement to show what happens if user decides to run
        else if(userInput.equals("3"))
        {
         System.out.print("You have successfully run away from the " + enemy + "\n \n");
         System.out.println("_____________________________________\n");
         //reitterates back to GAME loop so the game can continue and a new enemy can appear for player to fight
         continue GAME;
        }
      }
      
      
      System.out.println("_____________________________________");
       System.out.println("You have defeated the " + enemy );
       System.out.println("You have " + maxHealth + " HP left");
       System.out.println("_____________________________________\n");
       System.out.println("How do you wish to proceed?");
       System.out.println("1. Continue Fighting");
       System.out.println("2. Leave The Dungeon");
       //Using scanner class again to get user input
       String decisions = input.nextLine();
       System.out.println("\n");

       if(decisions.equals("1"))
       {
        System.out.println("Brave choice. You continue on in your adventure\n \n \n ");
       }
       else if(decisions.equals("2"))
       {
       //breaks loop and ends game
       System.out.println("having conquered the enemy you successfully leave the dungeon");
       break;
       }


      }
      //final message to player once they finish or retreat
     System.out.println("THANK YOU FOR PLAYING DUNGEON ADVENTURE");
     
    
  

  
    
    

  }
}
