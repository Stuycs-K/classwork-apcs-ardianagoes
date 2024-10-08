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

    //arr2DSum Method Tests
    System.out.println("\n-------arr2DSum Method Tests-------");
    System.out.println("\nSum of the values in Array 2: " + arr2DSum(array2));
    System.out.println("Sum of the values in Array 3: " + arr2DSum(array3));
    System.out.println("Sum of the values in Array 4: " + arr2DSum(array4));
    System.out.println("\n-------arr2DSum Method Tests-------");
    //arr2DSum Method Tests

    //replaceNegative Method Tests
    System.out.println("\n-------replaceNegative Method Tests-------");
    int[][] array5 = new int[][]{{-1, -2, -3}, {-4, -5, -6} , {-7, -8, -9}};
    System.out.println("\nOriginal Array 5: " + arrToString(array5));
    replaceNegative(array5);
    System.out.println("New Array 5: " + arrToString(array5));
    int[][] array6 = new int[][]{{-1, 15151, -3}, {15151, -5, -6} , {-7, 15151}};
    System.out.println("\nOriginal Array 6: " + arrToString(array6));
    replaceNegative(array6);
    System.out.println("New Array 6: " + arrToString(array6));
    int[][] array7 = new int[][]{{-1, 0}, {-1, 0}};
    System.out.println("\nOriginal Array 7: " + arrToString(array7));
    replaceNegative(array7);
    System.out.println("New Array 7: " + arrToString(array7));
    System.out.println("\n-------replaceNegative Method Tests-------");
    //replaceNegative Method Tests

    //copy Method Tests
    System.out.println("\n-------copy Method Tests-------");
    int[][] array9 = new int[][]{{-2, 1, -3}, {-41, 56, 97}};
    int[][] array9Copy = copy(array9);

    System.out.println("\nOriginal Array 9: " + arrToString(array9));
    System.out.println("Copied Array 9: " + arrToString(array9Copy));
    array9[0][0] = 1049104;
    System.out.println("\nModified Array 9: " + arrToString(array9));
    System.out.println("Copied Array 9: " + arrToString(array9Copy));

    int[][] array10 = new int[][]{{31, 23, 47}, {-41}};
    int[][] array10Copy = copy(array10);

    System.out.println("\nOriginal Array 10: " + arrToString(array10));
    System.out.println("Copied Array 10: " + arrToString(array10Copy));
    array10[0][0] = 93999;
    System.out.println("\nModified Array 10 " + arrToString(array10));
    System.out.println("Copied Array 10: " + arrToString(array10Copy));
    System.out.println("\n-------copy Method Tests-------");
    //copy Method Tests

    int[][] array11 = new int[][]{{1, 2, 3}, {4, 5, 6}};
    int[][] array12 = new int[][]{{1, 4},{2, 5},{3, 6}};
    int[][] array13 = new int[][]{{6, 9},{4, 0}};
    int[][] array14 = new int[][]{{}, {}};

    //swapRC Method Tests
    System.out.println("\n-------swapRC Method Tests-------");
    System.out.println("\nOriginal Array 11: " + arrToString(array11) + " --> " + arrToString(swapRC(array11)));
    System.out.println("Original Array 12: " + arrToString(array12) + " --> " + arrToString(swapRC(array12)));
    System.out.println("Original Array 13: " + arrToString(array13) + " --> " + arrToString(swapRC(array13)));
    System.out.println("\n-------swapRC Method Tests-------");
    //swapRC Method Tests

    //htmlTable Method Tests
    System.out.println("\n-------htmlTable Method Tests-------");
    System.out.println("\nOriginal Array: " + arrToString(array11));
    System.out.println(htmlTable(array11));
    System.out.println("\nOriginal Array: " + arrToString(array12));
    System.out.println(htmlTable(array12));
    System.out.println("\nOriginal Array: " + arrToString(array13));
    System.out.println(htmlTable(array13));
    System.out.println("\nOriginal Array: " + arrToString(array14));
    System.out.println(htmlTable(array14));
    System.out.println("\n-------htmlTable Method Tests-------");
    //htmlTable Method Tests
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
    for (int i = 0; i < nums.length; i++)
    {
      for (int n = 0; n < nums[i].length; n++)
      {
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
        for (int i = 0; i < nums.length; i++)
        {
          for (int n = 0; n < nums[i].length; n++)
          {
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
    return returnArray;
  }

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
  public static String htmlTable(int[][]nums)
  {
    String table = "<table>";
    for (int i = 0; i < nums.length; i++)
    {
      table += "<tr>";
      for (int n = 0; n < nums[i].length; n++)
      {
        table += "<td>" + nums[i][n] + "</td>";
      }
      table += "</tr>";
    }
  return table + "</table>";
  }
}
