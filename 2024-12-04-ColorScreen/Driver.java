import java.util.Random;


public class Driver {

  public static void main(String[] args){
    System.out.print(Text.CLEAR_SCREEN); // Clear the screen
    System.out.print(Text.HIDE_CURSOR); // Hide the cursor
    makeBorder();
    randomInts();
    separator();
    Text.go(31, 1); // Move the cursor to the end to avoid overwriting
    System.out.print(Text.RESET); // Reset terminal colors and show the cursor
  }


    public static void makeBorder(){
    Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.CYAN));
    for (int col = 1; col <= 80; col++) {
        Text.go(1, col);
        System.out.print("*");
        Text.go(30, col);
        System.out.print("*");
      }
    for (int row = 1; row <= 30; row++) {
       Text.go(row, 1);
       System.out.print("*");
       Text.go(row, 80);
       System.out.print("*");
      }
    }

   public static void randomInts(){
     Random random = new Random();
     int[] numbers = new int[3];
     for (int i = 0; i < 3; i++){
        numbers[i] = random.nextInt(100);
     }
     int[] position = {20, 40, 60};
     for (int i = 0; i < 3; i++){
        if (numbers[i] < 25){
          Text.color(Text.BRIGHT, Text.RED, Text.background(Text.BLACK));
        }
        else if (numbers[i] > 75){
          Text.color(Text.BRIGHT, Text.GREEN, Text.background(Text.BLACK));
        }
        else {
          Text.color(Text.BRIGHT, Text.WHITE, Text.background(Text.BLACK));
        }
        Text.go(2, position[i]);
        System.out.println(numbers[i]);
      }
    }

    public static void separator(){
      Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.CYAN));
      for (int col = 1; col <= 80; col++){
        Text.go(3, col);
        System.out.println("-");
      }
    }

}
