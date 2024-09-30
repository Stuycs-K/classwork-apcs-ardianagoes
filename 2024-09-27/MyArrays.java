public class MyArrays {
  public static void main(String[] args){
    int[] array = {1, 2, 3, 4, 5};
    int[] copy = returnCopy(array);
    boolean sameValue = true;

    System.out.println("\nOriginal Array: " + arrayToString(array));
    System.out.println("Copied Array: " + arrayToString(copy));

    //Check if arrays have the same values
    for (int i = 0; i < copy.length; i++){
      if (copy[i] != array[i]){
        sameValue = false;
      }
    }
    System.out.println("Same Values: " + sameValue);

    //Check if arrays are the same array
    array[0] = 99;
    System.out.println("\nModified Array: " + arrayToString(array));
    System.out.println("Copied Array: " + arrayToString(copy));

    //Check if arrays have different values
    System.out.println("\nModified Array: " + arrayToString(array));
    System.out.println("Copied Array: " + arrayToString(copy));

    //Check if arrays have the same values
    for (int i = 0; i < copy.length; i++){
      if (copy[i] != array[i]){
        sameValue = false;
      }
    }
    System.out.println("Same Values: " + sameValue);
    //Check array concatentation
    int[] array1 = {0, 1, 2, 3, 4, 5};
    int[] array2 = {6, 7, 8, 9};

    System.out.println("\nArray 1: " + arrayToString(array1));
    System.out.println("Array 2: " + arrayToString(array2));
    System.out.println("Array 1 + 2: " + arrayToString(concatArray(array1, array2)));

    int[] array12 = {0, 1, 2, 3};
    int[] array22 = {4, 5, 6, 7, 8, 9, 10};

    System.out.println("\nArray 1: " + arrayToString(array12));
    System.out.println("Array 2: " + arrayToString(array22));
    System.out.println("Array 1 + 2: " + arrayToString(concatArray(array12, array22)));
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

  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] newArray = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++){
      newArray[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++){
      newArray[ary1.length + i] = ary2[i];
    }
    return newArray;
  }
}
