// Maxim Argat (maxima5@nycstudents.net) and Ardian Agoes (ardiana@nycstudents.net)
//MAIN FILE AND DIRECTORY. OTHER COMMITS AND PROGRESS CAN BE SEEN IN THE OLD DIRECTORY (2024-09-30)
public class ArrayMethods
{
    public static void main(String[] args)
    {
        int[] array1D = new int[]{2, 3, 4, 9};
        int[] array1D2 = new int[]{};
        int[][] array1 = new int[][]{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}};
        int[][] array2 = new int[][]{{2, 7}, {3, 6, 1}, {7}};
        int[][] array3 = new int[][]{{11, 12}, {}, {20, 21}};
        int[][] array35 = new int[][]{{}, {}, {}, {}, {}, {}, {}, {}, {}};

        // 1D Array to String Method Tests
        System.out.println("\n-------1D Array to String Method Tests-------");
        System.out.println("\n1D Array1D as String: ");
        System.out.println(arrToString(array1D));
        System.out.println("\n1D Array1D2 as String: ");
        System.out.println(arrToString(array1D2));
        System.out.println("\n-------1D Array to String Method Tests-------");
        // 1D Array to String Method Tests

        // 2D Array to String Method Tests
        System.out.println("\n-------2D Array to String Method Tests-------");
        System.out.println("\nArray 1 as a String: ");
        System.out.println(arrToString(array1));
        System.out.println("\nArray 2 as a String: ");
        System.out.println(arrToString(array2));
        System.out.println("\nArray 3 as a String: ");
        System.out.println(arrToString(array3));
        System.out.println("\nArray 35 as a String: ");
        System.out.println(arrToString(array35));
        System.out.println("\n-------2D Array to String Method Tests-------");
        // 2D Array to String Method Tests

        // 2D Array Sum Method Tests
        System.out.println("\n-------2D Array Sum Method Tests-------");
        System.out.println("\nSum of the values in Array 1: " + arr2DSum(array1)); // 42
        System.out.println("Sum of the values in Array 2: " + arr2DSum(array2)); // 26
        System.out.println("Sum of the values in Array 3: " + arr2DSum(array3)); // 64
        System.out.println("Sum of the values in Array 35: " + arr2DSum(array35)); // 0
        System.out.println("\n-------2D Array Sum Method Tests-------");
        // 2D Array Sum Method Tests

        int[][] array4 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] array5 = new int[][]{{1, 4},{2, 5},{3, 6}};
        int[][] array6 = new int[][]{{6, 9},{4, 0}};

        // swapRC Method Tests
        System.out.println("\n-------SwapRC Method Tests-------");
        System.out.println("\nOriginal Array 4: " + arrToString(array4) + " --> " + arrToString(swapRC(array4))); // --> {{1, 4},{2, 5},{3, 6}}
        System.out.println("Original Array 5: " + arrToString(array5) + " --> " + arrToString(swapRC(array5))); // --> {{1, 2, 3}, {4, 5, 6}}
        System.out.println("Original Array 6: " + arrToString(array6) + " --> " + arrToString(swapRC(array6))); // --> {{6, 4},{9, 0}}
        System.out.println("\n-------SwapRC Method Tests-------");
        // swapRC Method Tests

        //replaceNegative Method Tests
        System.out.println("\n-------Replacenegative Method Tests-------");
        int[][] array7 = new int[][]{{-1, -2, -3}, {-4, -5, -6} , {-7, -8, -9}};
        System.out.println("\nOriginal Array 7: " + arrToString(array7));
        replaceNegative(array7);
        System.out.println("New Array 7: " + arrToString(array7));
        int[][] array8 = new int[][]{{-1, 15151, -3}, {15151, -5, -6} , {-7, 15151}};
        System.out.println("\nOriginal Array 8: " + arrToString(array8));
        replaceNegative(array8);
        System.out.println("New Array 8: " + arrToString(array8));
        int[][] array9 = new int[][]{{-1, 0}, {-1, 0}};
        System.out.println("\nOriginal Array 9: " + arrToString(array9));
        replaceNegative(array9);
        System.out.println("New Array 9: " + arrToString(array9));
        System.out.println("\n-------Replacenegative Method Tests-------");
        //replaceNegative Method Tests

        //Copy 2D Array Method Tests
        System.out.println("\n-------Copy2D Method Tests-------");
        int[][] array10 = new int[][]{{-2, 1, -3}, {-41, 56, 97}};
        int[][] array10Copy = copy(array10);

        System.out.println("\nOriginal Array 10: " + arrToString(array10));
        System.out.println("Copied Array 10: " + arrToString(array10Copy));
        array10[0][0] = 1049104;
        System.out.println("\nModified Array 10: " + arrToString(array10));
        System.out.println("Copied Array 10: " + arrToString(array10Copy));

        int[][] array11 = new int[][]{{31, 23, 47}, {-41}};
        int[][] array11Copy = copy(array11);

        System.out.println("\nOriginal Array 11: " + arrToString(array11));
        System.out.println("Copied Array 11: " + arrToString(array11Copy));
        array11[0][0] = 93999;
        System.out.println("\nModified Array 11: " + arrToString(array11));
        System.out.println("Copied Array 11: " + arrToString(array11Copy));
        System.out.println("\n-------Copy2D Method Tests-------");
        //Copy 2D Array Method Tests

    }

    public static String arrToString(int[] array)
    {
        String s = "[";
        for(int i = 0; i < array.length; i++)
        {
            s += array[i] + ", ";
        }
        if(array.length > 0)
            return s.substring(0, s.length() - 2) + "]";
        return s + "]";
    }

    public static String arrToString(int[][] array)
    {
        String s = "[";
        for(int i = 0; i < array.length; i++)
        {
            s += arrToString(array[i]) + ", ";
        }
        if(array.length > 0)
            return s.substring(0, s.length() - 2) + "]";
        return s + "]";
    }

    public static int arr2DSum(int[][] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            int[] subarray = array[i];
            for(int j = 0; j < subarray.length; j++)
            {
                sum += subarray[j];
            }
        }
        return sum;
    }

    public static int[][] swapRC(int[][] nums)
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

    public static int[][] copy(int[][] nums)
    {
    int[][] returnArray =  new int[nums.length][0];
    for(int i = 0; i < nums.length; i++)
    {
        returnArray[i] = copy(nums[i]);
    }
    return returnArray;
    }

    public static int[] copy(int[] nums)
    {
      int[] returnArray = new int[nums.length];
      for(int i = 0; i < nums.length; i++)
      {
          returnArray[i] = nums[i];
      }
      return returnArray;
    }
}
