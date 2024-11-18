import java.util.ArrayList;


public class day1part1 {
  public static void main(String[] args){

  }

  public static int countBlock(String filename){
    try {
      File file = new File("text.txt");
      Scanner input = new Scanner(file);
      int counter = 0;
      ArrayList<String> currentArray = new ArrayList<String>;
      while (input.hasNext()){
        currentString = input.next();
        currentArray.add(currentString)
      }
      return currentString;
    }  catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return 0; //you can return from a void function just don't put a value.
      }
  }
}
