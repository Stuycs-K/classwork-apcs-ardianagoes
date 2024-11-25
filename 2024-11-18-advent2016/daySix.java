import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class daySix{
  public static void main(String[] args){
    System.out.println(codeReader("daySix.txt"));
  }
  public static String codeReader(String filename){
    try {
      File file = new File("daySix.txt");
      Scanner input = new Scanner(file);
      ArrayList<String> stringArray = new ArrayList<String>();
      while (input.hasNextLine()){
        stringArray.add(input.nextLine());
      }
      char[] commonLetters = new char[stringArray.get(0).length()];
      for (int i = 0; i < stringArray.get(0).length(); i++){
        int[] array = new int[26];
        for (int n = 0; n < stringArray.size(); n++){
          char letter = stringArray.get(n).charAt(i);
          array[letter - 'a']++;
        }
        int mostFrequency = 0;
        char mostCommon =  'a';
        for (int z = 0; z < 26; z++){
          if (array[z] > mostFrequency){
            mostFrequency = array[z];
            mostCommon = (char) (z + 'a');
          }
        }
        commonLetters[i] = mostCommon;
      }
      return new String(commonLetters);
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "no";
    }
  }
}
