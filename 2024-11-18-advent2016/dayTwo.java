import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class dayTwo{
  public static void main(String[] args){

  }
  public static int codeReader(String filename){
    try {
      File file = new File("dayTwo.txt");
      Scanner input = new Scanner(file);
      return 0;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
  }
}
