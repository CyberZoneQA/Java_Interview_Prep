package Coding_Array;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */

    public static void main(String[] args) {
        int z = maxValue(new int[]{1, 5, 9, 22, 3, 0});
        System.out.println(z);

    }

    static int maxValue(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int each : n)
            if (each > max)
                max = each;
        return max;

    }

}
