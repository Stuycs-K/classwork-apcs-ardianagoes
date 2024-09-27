public class MyArrays {
  public static void main(String[] args){
    int[] array = {1, 2, 3, 4, 5};
    System.out.println(arrayToString(returnCopy(array)));
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
    ary[0] = ary[0] + 1;
    return newArray;
    }
}
