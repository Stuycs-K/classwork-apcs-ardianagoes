public class Driver {

  public static void main(String[] args){
    System.out.print(Text.CLEAR_SCREEN); // Clear the screen
    System.out.print(Text.HIDE_CURSOR); // Hide the cursor

    makeBorder();

    Text.go(31, 1); // Move the cursor to the end to avoid overwriting
    System.out.print(Text.RESET); // Reset terminal colors and show the cursor
  }


  public static void makeBorder(){
    int borderColor = Text.BRIGHT;
    int borderForeground = Text.BLUE;
    int borderBackground = Text.background(Text.CYAN);
    Text.color(borderColor, borderForeground, borderBackground);
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
}
