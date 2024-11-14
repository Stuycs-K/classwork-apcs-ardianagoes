import java.util.ArrayList;

public class ArrayListPractice {

  public static void main(String[] args){
    ArrayList<String> Triangle = createRandomArray(20);
    System.out.println(Triangle);
    replaceEmpty(Triangle);
    System.out.println(Triangle);


  }

  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> randomArray = new ArrayList<String>(size);
    int randomNumber = 0;
    for (int i = 0; i < size; i++){
      randomNumber = (int) (Math.random() * 11);
      if (randomNumber == 0){
        randomArray.add("");

      }
      else {
        randomArray.add("" + randomNumber);
      }
    }
    return randomArray;
  }
  public static void replaceEmpty(ArrayList<String> original){
    for(int i = 0; i < original.size(); i++){
      if(original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }


}
