import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    //2 Opening a file requires a try/catch
    try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      int counter = 0;
      /* Prints every other line of text
      while(input.hasNextLine()){
          counter++;
          if (counter % 2 != 1){
            input.nextLine();
          }
          else {
            System.out.println(input.nextLine());
          }
      }
      */
      while(input.hasNextLine()){
        String currentLine = input.nextLine();
          if (currentLine.contains("{")){
            System.out.println(currentLine);
          }
      }
      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
  }
}
