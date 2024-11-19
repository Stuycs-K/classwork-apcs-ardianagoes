import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class dayOne {

  public static void main(String[] args){
    System.out.println(countBlocks("text.txt"));
    System.out.println(countBlocksDay2("text.txt"));
  }

  public static int countBlocks(String filename){
    try {
      char direction = 'n';
      int horizontalDistance = 0;
      int verticalDistance= 0;
      File file = new File("text.txt");
      Scanner input = new Scanner(file);
      String arrayAsString = "";
      while (input.hasNext()){
        arrayAsString += input.next();
          }
      String[] array = arrayAsString.split(",");
      for (int i = 0; i < array.length; i++){
        if (array[i].charAt(0) == 'R'){
          if (direction =='n'){
            direction = 'e';
          }
          else if (direction == 'e'){
            direction = 's';
          }
          else if (direction == 's'){
            direction = 'w';
          }
          else if (direction == 'w') {
            direction = 'n';
          }
        }
        else if (array[i].charAt(0) == 'L'){
          if (direction == ('n')){
            direction = 'w';
          }
          else if (direction == 'w'){
            direction = 's';
          }
          else if (direction == 's'){
            direction = 'e';
          }
          else if (direction == 'e') {
            direction = 'n';
          }
        }
        if (direction == 'n'){
          verticalDistance += Integer.parseInt(array[i].substring(1));
        }
        else if (direction == 's'){
          verticalDistance -= Integer.parseInt(array[i].substring(1));
        }
        else if (direction == 'e'){
          horizontalDistance += Integer.parseInt(array[i].substring(1));
        }
        else if (direction == 'w'){
          horizontalDistance -= Integer.parseInt(array[i].substring(1));
        }
      }
      return Math.abs(horizontalDistance) + Math.abs(verticalDistance);
      } catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return 0; //you can return from a void function just don't put a value.
      }
  }

  public static String[] countBlocksDay2(String filename){
    try {
      char direction = 'n';
      int horizontalDistance = 0;
      int verticalDistance= 0;
      File file = new File("text.txt");
      Scanner input = new Scanner(file);
      String arrayAsString = "";
      while (input.hasNext()){
        arrayAsString += input.next();
          }
      String[] array = arrayAsString.split(",");
      return array;
      } catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return new String[3]; //you can return from a void function just don't put a value.
      }
  }
}
