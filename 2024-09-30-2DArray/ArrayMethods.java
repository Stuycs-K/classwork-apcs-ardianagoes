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
        System.out.println("\n1D Array1D as String: ");
        System.out.println(arrToString(array1D));
        System.out.println("\n1D Array1D2 as String: ");
        System.out.println(arrToString(array1D2));
        // 1D Array to String Method Tests

        // 2D Array to String Method Tests
        System.out.println("\nArray 1 as a String: ");
        System.out.println(arrToString(array1));
        System.out.println("\nArray 2 as a String: ");
        System.out.println(arrToString(array2));
        System.out.println("\nArray 3 as a String: ");
        System.out.println(arrToString(array3));
        System.out.println("\nArray 35 as a String: ");
        System.out.println(arrToString(array35));
        // 2D Array to String Method Tests

        // 2D Array Sum Method Tests
        System.out.println("\nSum of the values in Array 1: " + arr2DSum(array1)); // 42
        System.out.println("Sum of the values in Array 2: " + arr2DSum(array2)); // 26
        System.out.println("Sum of the values in Array 3: " + arr2DSum(array3)); // 64
        System.out.println("Sum of the values in Array 35: " + arr2DSum(array35)); // 0
        // 2D Array Sum Method Tests

        int[][] array4 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] array5 = new int[][]{{1, 4},{2, 5},{3, 6}};
        int[][] array6 = new int[][]{{6, 9},{4, 0}};

        // swapRC Method Tests
        System.out.println("\nOriginal Array 4: " + arrToString(array4) + " --> " + arrToString(swapRC(array4))); // --> {{1, 4},{2, 5},{3, 6}}
        System.out.println("Original Array 5: " + arrToString(array5) + " --> " + arrToString(swapRC(array5))); // --> {{1, 2, 3}, {4, 5, 6}}
        System.out.println("Original Array 5: " + arrToString(array6) + " --> " + arrToString(swapRC(array6))); // --> {{6, 9},{4, 0}}
        // swapRC Method Tests
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
