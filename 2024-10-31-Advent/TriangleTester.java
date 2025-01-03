import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class TriangleTester {

  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }

  public static int countTrianglesA(String filename){
    try {
      File file = new File("inputTri.txt");
      Scanner input = new Scanner(file);
      int counter = 0;
      while (input.hasNextLine()){
        String currentLine = input.nextLine().trim();
        String[] currentArray = new String[3];
        currentArray = currentLine.split("\\s+");
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

    public static int countTrianglesB(String filename){
      try {
        File file = new File("inputTri.txt");
        Scanner input = new Scanner(file);
        int counter = 0;
        ArrayList<String> column1 = new ArrayList<String>();
        ArrayList<String> column2 = new ArrayList<String>();
        ArrayList<String> column3 = new ArrayList<String>();
        while (input.hasNextLine()){
          String currentLine = input.nextLine().trim();
          String[] currentArray = new String[3];
          currentArray = currentLine.split("\\s+");
          column1.add(currentArray[0]);
          column2.add(currentArray[1]);
          column3.add(currentArray[2]);
            }
        for (int i = 0; i < column1.size() - 2; i+=3){
          String[] stringArray = new String[3];
          stringArray[0] = column1.get(i);
          stringArray[1] = column1.get(i + 1);
          stringArray[2] = column1.get(i + 2);
          if (checkTriangle(stringArray)){
           counter++;
          }
        }
        for (int i = 0; i < column2.size() - 2; i+=3){
          String[] stringArray = new String[3];
          stringArray[0] = column2.get(i);
          stringArray[1] = column2.get(i + 1);
          stringArray[2] = column2.get(i + 2);
          if (checkTriangle(stringArray)){
           counter++;
          }
        }
        for (int i = 0; i < column3.size() - 2; i+=3){
          String[] stringArray = new String[3];
          stringArray[0] = column3.get(i);
          stringArray[1] = column3.get(i + 1);
          stringArray[2] = column3.get(i + 2);
          if (checkTriangle(stringArray)){
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
    return (intArray[0] + intArray[1] > intArray[2] && intArray[2] + intArray[1] > intArray[0] && intArray[0] + intArray[2] > intArray[1]);

    //return (Math.max(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2])) < (Integer.parseInt(array[0]) + Integer.parseInt(array[1]) + Integer.parseInt(array[2]) - Math.max(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]))));
  }

}

//95
