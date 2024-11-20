import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class dayTwo{
  public static void main(String[] args){
    System.out.println(codeReader("dayTwo.txt"));
  }
  public static int codeReader(String filename){
    try {
      File file = new File("dayTwo.txt");
      Scanner input = new Scanner(file);
      int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      ArrayList<String> combination = new ArrayList<String>();
      String returnNumber = "";
      while (input.hasNextLine()){
        combination.add(input.nextLine().trim());
      }
      for (int i = 0; i < combination.size(); i++){
        int row = 1;
        int column = 1;
        for (int n = 0; n < combination.get(i).length(); n++){
          if (combination.get(i).charAt(n) == 'L' && column > 0){
            column--;
          }
          else if(combination.get(i).charAt(n) == 'R' && column < 2){
            column++;
          }
          else if(combination.get(i).charAt(n) == 'D' && row < 2){
            row++;
          }
          else if(combination.get(i).charAt(n) == 'U' && row > 0){
            row--;
          }
        }
        returnNumber += keypad[row][column];
      }
      return Integer.parseInt(returnNumber);
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
  }
}
