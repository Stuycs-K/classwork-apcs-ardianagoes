import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    int[][] array1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    //arrayToString() Method Tests
    System.out.println("\n-------arrToString() Method Tests-------");
    System.out.println("\nArrays.deepToString --> " + Arrays.deepToString(array1));
    System.out.println("arrToString() --> " + arrToString(array1));
    System.out.println("\n-------arrToString() Method Tests-------");
    //arrayToString() Method Tests

    int[][] array2 = new int[][]{{10, -30}, {-40, 60}, {70, 90, 10}};
    int[][] array3 = new int[][]{{0, 0}, {0}, {0, 0, 0}};
    int[][] array4 = new int[][]{{0, 0, 0}, {0, 0, -2}, {2, -1000, -9}};

    //countZeros2D Method Tests
    System.out.println("\n-------countZeros2D Method Tests-------");
    System.out.println("\n" + arrToString(array2) + "--> Zero Count: " + countZeros2D(array2));
    System.out.println(arrToString(array3) + "--> Zero Count: " + countZeros2D(array3));
    System.out.println(arrToString(array4) + "--> Zero Count: " + countZeros2D(array4));
    System.out.println("\n-------countZeros2D Method Tests-------");
    //countZeros2D Method Tests

    System.out.println(countZeros2D(array1));
    System.out.println(arr2DSum(array1));
    replaceNegative(array1);
    System.out.println(arrToString(array1));
    int[][] array1Copy = copy(array1);
    System.out.println("\nOriginal Array 1: " + arrToString(array1));
    System.out.println("Copied Array 1: " + arrToString(array1Copy));
    array1[0][0] = 93999;
    System.out.println("\nModified Array 1: " + arrToString(array1));
    System.out.println("Copied Array 1: " + arrToString(array1Copy));

    int[][] array9 = new int[][]{{1, 2, 3}, {4, 5, 6}};
    System.out.println("\nOriginal Array 1: " + arrToString(array2) + " --> " + arrToString(swapRC(array2)));
    System.out.println(htmlTable(array2));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[] ary)
  {
      String s = "[";
      for(int i = 0; i < ary.length; i++)
      {
          s += ary[i] + ", ";
      }
      if(ary.length > 0)
          return s.substring(0, s.length() - 2) + "]";
      return s + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary)
    {
        String s = "[";
        for(int i = 0; i < ary.length; i++)
        {
            s += arrToString(ary[i]) + ", ";
        }
        if(ary.length > 0)
            return s.substring(0, s.length() - 2) + "]";
        return s + "]";
    }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums)
  {
    int zeroCount = 0;
    for (int i = 0; i < nums.length; i++){
      for (int n = 0; n < nums[i].length; n++){
        if (nums[i][n] == 0){
          zeroCount++;
        }
      }
    }
    return zeroCount;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums)
  {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
          for (int n = 0; n < nums[i].length; n++){
            sum += nums[i][n];
          }
        }
        return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals)
  {
    for (int i = 0; i < vals.length; i++)
    {
      for (int j = 0; j < vals[i].length; j++)
      {
        if (vals[i][j] < 0)
        {
          if (i == j)
              vals[i][j] = 1;
          else
              vals[i][j] = 0;
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods

  public static int[] copyHelper(int[] nums)
  {
    int[] returnArray = new int[nums.length];
    for(int i = 0; i < nums.length; i++)
    {
        returnArray[i] = nums[i];
    }
    return returnArray;
  }

  public static int[][] copy(int[][] nums)
  {
    int[][] returnArray =  new int[nums.length][0];
    for(int i = 0; i < nums.length; i++)
    {
        returnArray[i] = copyHelper(nums[i]);
    }
    return returnArray;  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums)
  {
    int rows = nums[0].length;
    int columns = nums.length;
    int[][] returnArray = new int[rows][columns];
    for (int n = 0; n < columns; n++)
    {
      for (int i = 0; i < rows; i++)
      {
          returnArray[i][n] = nums[n][i];
      }
    }
    return returnArray;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String table = "<table>";
    for (int i = 0; i < nums.length; i++){
      table += "<tr>";
      for (int n = 0; n < nums[i].length; n++){
        table += "<td>" + nums[i][n] + "</td>";
      }
      table += "</tr>";
    }
  return table + "</table>";
}
}
