import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt"));

  }

  public static int countTrianglesA(String filename){
    try {
      File file = new File("inputTri.txt");
      Scanner input = new Scanner(file);
      int counter = 0;
      while (input.hasNextLine()){
        String currentLine = input.nextLine();
        String[] currentArray = new String[3];
        currentArray = currentLine.split("");
          if (checkTriangle(currentArray)){
            counter++;
          }
      }
      return counter;
    }  catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return 0; //you can return from a void function just don't put a value.
      }
  }

  public static boolean checkTriangle(String[] array){
    int[] intArray = new int[3];
    for (int i = 0; i < array.length; i++){
      intArray[i] = Integer.parseInt(array[i]);
    }
    return (intArray[0] + intArray[1] < intArray[2] && intArray[2] + intArray[1] < intArray[0] && intArray[0] + intArray[2] < intArray[1]);

    //return (Math.max(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2])) < (Integer.parseInt(array[0]) + Integer.parseInt(array[1]) + Integer.parseInt(array[2]) - Math.max(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]))));
  }

}

//
