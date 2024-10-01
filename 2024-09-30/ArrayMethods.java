// Maxim Argat (maxima5@nycstudents.net) and Ardian Agoes (ardiana@nycstudents.net)

public class ArrayMethods
{
    public static void main(String[] args)
    {
        int[] array1D = new int[]{2, 3, 4, 9};
        int[][] array1 = new int[][]{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}};
        int[][] array2 = new int[][]{{2, 7}, {3, 6, 1}, {7}};

        // 1D Array to String Method Tests
        System.out.println("\n1D Array as String: ");
        System.out.println(arrToString(array1D));
        // 1D Array to String Method Tests

        // 2D Array to String Method Tests
        System.out.println("\nArray 1 as a String: ");
        System.out.println(arrToString(array1));
        System.out.println("\nArray 2 as a String: ");
        System.out.println(arrToString(array2));
        // 2D Array to String Method Tests

        // 2D Array Sum Method Tests
        System.out.println("\nSum of the values in Array 1: " + arr2DSum(array1));
        System.out.println("Sum of the values in Array 2: " + arr2DSum(array2));
        // 2D Array Sum Method Tests
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
    /*
    public static int[][] swapRC(int[][] nums){
        int arr1Length = nums[0].length;
        int arr2Length = nums.length;
        int [][] returnArray = new int[arr1Length][arr2Length];
    }*/
}
