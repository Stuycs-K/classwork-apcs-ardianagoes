public class MyArrays {
  public static void main(String[] args){
    int[] array = {1, 2, 3, 4, 5};
    int[] copy = returnCopy(array);

    System.out.println("Original Array: " + arrayToString(array));
    System.out.println("Copied Array: " + arrayToString(copy));

    array[0] = 99;
    System.out.println("Modified Array: " + arrayToString(array));
    System.out.println("Copied Array: " + arrayToString(copy));
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

  public static int[] returnCopy(int[] ary){
    int[] newArray = new int[ary.length];
    for (int i = 0; i < newArray.length; i++){
      newArray[i] = ary[i];
    }
    return newArray;
  }
}
