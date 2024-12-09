import java.util.Scanner;

public class Game{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter player name");
    String playerName = userInput.nextLine();
    System.out.println("Enter enemy name");
    String enemyName = userInput.nextLine();
    Adventurer Player = new Warrior(playerName, 100);
    Adventurer Enemy = new CodeWarrior(enemyName, 100);
    Game(Player, Enemy);
  }

  public static void Game(Adventurer player, Adventurer enemy){
    while (player.getHP() > 0 || enemy.getHP() > 0){
      System.out.println(player.getName() + " Current Stats: HP: " + player.getHP() + "/" + player.getmaxHP() + ", Special: " + player.getSpecial() + "/" + player.getSpecialMax());
      System.out.println(enemy.getName() + " Current Stats: HP: " + enemy.getHP() + "/" + enemy.getmaxHP() + ", Special: " + enemy.getSpecial() + "/" + enemy.getSpecialMax());

    }
  }
}
