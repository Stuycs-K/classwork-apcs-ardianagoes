import java.util.Scanner;
import java.util.Random;

public class Game{

  public static void main(String[] args){
    Game();
  }

  public static void Game(){
    Random rand = new Random();
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter player name");
    String playerName = userInput.nextLine();
    System.out.println("Enter enemy name");
    String enemyName = userInput.nextLine();
    Adventurer player = new Warrior(playerName, 100);
    Adventurer enemy = new CodeWarrior(enemyName, 100);
    while (player.getHP() > 0 || enemy.getHP() > 0){
        System.out.println(player.getName() + " Current Stats: HP: " + player.getHP() + "/" + player.getmaxHP() + ", Special: " + player.getSpecial() + "/" + player.getSpecialMax());
        System.out.println(enemy.getName() + " Current Stats: HP: " + enemy.getHP() + "/" + enemy.getmaxHP() + ", Special: " + enemy.getSpecial() + "/" + enemy.getSpecialMax());
        System.out.println("\nType: (a)ttack / (sp)ecial / (su)pport / quit");
        String choice = userInput.nextLine().trim().toLowerCase();

    while (!choice.equals("a") && !choice.equals("attack") && !choice.equals("sp") && !choice.equals("special") && !choice.equals("su") && !choice.equals("support") && !choice.equals("quit")){
        System.out.println("Invalid input! Please type: (a)ttack / (sp)ecial / (su)pport / quit");
        choice = userInput.nextLine().trim().toLowerCase();
    }
    if (choice.equals("quit")){
        System.out.println("Game ended");
        return;
    }
    String result = "";
    if (choice.equals("a") || choice.equals("attack")) {
        result = player.attack(enemy);
    }
    else if (choice.equals("sp") || choice.equals("special")) {
        result = player.specialAttack(enemy);
    }
    else if (choice.equals("su") || choice.equals("support")) {
        result = player.support();
    }
    System.out.println(result);
    if (enemy.getHP() <= 0) {
       System.out.println("\n" + enemy.getName() + " has been defeated! You win!");
       return;
    }
    int enemyChoice = rand.nextInt(3);
    if (enemyChoice == 0) {
        result = enemy.attack(player);
    }
    else if (enemyChoice == 2) {
        result = enemy.specialAttack(player);
    }
    else if (enemyChoice == 3) {
        result = enemy.support();
    }
    System.out.println(result);
    if (player.getHP() <= 0) {
       System.out.println("\n" + player.getName() + " has been defeated! Enemy wins!");
       return;
    }
    }
  }
}
