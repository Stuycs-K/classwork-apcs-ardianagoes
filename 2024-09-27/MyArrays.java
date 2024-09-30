public class MyArrays {
  public static void main(String[] args){
    int[] array = {1, 2, 3, 4, 5};
    int[] copy = returnCopy(array);
    boolean sameValue = true;

    System.out.println("Original Array: " + arrayToString(array));
    System.out.println("Copied Array: " + arrayToString(copy));

    //Check if arrays have the same values
    for (int i = 0; i < copy.length; i++){
      if (copy[i] != array[i]){
        sameValue = false;
      }
    }
    System.out.println("Same Values: " + sameValue);

    //Check if arrays are the same
    array[0] = 99;
    System.out.println("Modified Array: " + arrayToString(array));
    System.out.println("Copied Array: " + arrayToString(copy));

    /*int[] array1 = {0, 1, 2, 3, 4, 5};
    int[] array2 = {6, 7, 8, 9};

    System.out.println("Array 1: " + arrayToString(array1));
    System.out.println("Array 2: " + arrayToString(array2));
    System.out.println("Array 1 + 2: " + arrayToString(concatArray(array1, array2)));*/
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
