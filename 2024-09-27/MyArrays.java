public class MyArrays {
  public static void main(String[] args){
    int[] array = {1, 2, 3, 4, 5};
    System.out.println(arrayToString(array));
  }

  public static String arrayToString(int[] nums){
    String s = "[";
    for (int i = 0; i < nums.length; i++){
      s += nums[i];
      if(i < nums.length - 1){
        s += ", ";
      }
    }
    return s + "]";
  }
}
