import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class dayOne {

  public static void main(String[] args){
    System.out.println(Arrays.toString(countBlocks("text.txt")));
  }

  public static String[] countBlocks(String filename){
    try {
      int horizontalDistance = 0;
      int verticalDistance= 0;
      File file = new File("text.txt");
      Scanner input = new Scanner(file);
      String arrayAsString = "";
      while (input.hasNext()){
        arrayAsString += input.next();
          }
      String[] array = arrayAsString.split(",");
      } catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return new String[1]; //you can return from a void function just don't put a value.
      }
  }
}

//95
