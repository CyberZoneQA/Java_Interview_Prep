package Coding_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Reverse_StringArray {

    public static String[] reverseStingArray(String[] arr) {
        List<String> rev = Arrays.asList(arr);
        Collections.reverse(rev);
        arr = (String[]) rev.toArray();
        return arr;
    }


    public static void main(String[] args) {
        String[] arr = {"coding", "start", "Day", "Day", "start", "1", "Day", "Perfect", "Sunday"};

        //revers string array
        String[] newarr = new String[arr.length];
        int n = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newarr[n++] = arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }
}
