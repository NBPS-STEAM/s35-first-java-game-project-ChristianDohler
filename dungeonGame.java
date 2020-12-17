import java.util.Scanner;
import java.util.Random;

public class dungeonGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    // enemy
    String[] enemies = { "Ghoul", "Mind Flayer", "Goblin" };
    int EnemyMaxHealth = 80;
    int EnemyMaxDamageDealt = 20;
    int EnemyHealthPotions = 1;
    int EnemyRegeneration = 20;

    // player
    int health = 100;
    int attackDamage = 45;
    int healthPotions = 3;
    int maxRegeneration = 25;

    boolean working = true;

    System.out.println("\t DUNGEON ADVENTURE   ");

    GAME: while (working) {

      System.out.println("Hello Mortal, welcome to the dungeon!");

    }

  }
}
