package Coding_Array;

import java.util.Arrays;

public class Array_SortInDescOrAscOrder {

    /*
        Write a return method that can sort an int array in descending order without using the sort method
        Ascending means smallest to largest, 0 to 9, and/or A to Z and
        Descending means largest to smallest, 9 to 0
     */

    public int[] sortingArrayDesc(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i] > result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    public int[] sortingArrayAsc(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}
