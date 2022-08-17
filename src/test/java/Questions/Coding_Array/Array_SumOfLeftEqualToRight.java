package Coding_Array;

public class Array_SumOfLeftEqualToRight {
    /*
    Given an array of integers, write a function to return the item in the array,
    where the sum of all items on its left is equal to the sum of the ones on the right.
    For example:    Given [4, 9, 1, 3, 6, 4]
                    your function should give item 1, because 4+9 = 3+6+4              */

    public int equilibrium(int[] array) {
        int result = 0;

        for (int i = 1; i < array.length; i++) {
            int sumOfLeft = 0;
            int sumOfRight = 0;

            for (int j = 0; j < i; j++) {
                sumOfLeft += array[j];
            }

            for (int k = i + 1; k < array.length; k++) {
                sumOfRight += array[k];
            }

            if (sumOfLeft == sumOfRight) {
                result = array[i];
            }
        }
        return result;
    }
}
