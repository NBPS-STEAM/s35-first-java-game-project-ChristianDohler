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

    GAME: while (working) {

      //gives enemy random health between 1 to 100
      int enemyHealth = rand.nextInt(enemyMaxHealth);
      //picks a random enemy from the array written earlier using the string method .length
      String enemy = enemies[rand.nextInt(enemies.length)];



