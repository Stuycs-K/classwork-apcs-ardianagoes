import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class dayFour {
  public static void main(String[] args){
    System.out.println(roomChecker("dayFour.txt"));
  }
  public static int roomChecker(String filename){
    try {
      File file = new File("dayFour.txt");
      Scanner input = new Scanner(file);
      ArrayList<String> letters = new ArrayList<String>();
      ArrayList<String> numbers = new ArrayList<String>();
      while (input.hasNextLine()){
        String s = input.nextLine();
        for (int i = 0; i < s.length(); i++){
          if (Character.isLetter(s.charAt(i))){
            return 1;
          }
        }
        }
        return 2;
        } catch (FileNotFoundException ex){
          System.out.println("File not found");
          return 0;
        }
      }
    }
