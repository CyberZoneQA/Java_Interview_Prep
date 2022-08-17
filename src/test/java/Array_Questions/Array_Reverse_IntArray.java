package Array_Questions;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;

public class Array_Reverse_IntArray {

    /*
    write a function that can reverse an array
     */


    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];
        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }
        return result;
    }

    public static void reverseIntArray(int[] arr) {
        int[] reversed = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j++] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));
    }

    public static void reverseArray(Object[] arr) {         // not for primitives
        CollectionUtils.reverseArray(arr);                  // apache.commons.collections4
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        /* Reverse an Integer & String array  */
        Integer[] array = {4, 3, 2, 44, 1, 100, 55};
        CollectionUtils.reverseArray(array);

    }


}
