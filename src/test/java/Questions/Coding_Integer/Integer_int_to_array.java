package Coding_Integer;

import java.util.Arrays;

public class Integer_int_to_array {

    public static void main(String[] args) {
        int n =119955;
        System.out.println(Arrays.toString(intToIntArray(n)));
    }

    static int[] intToIntArray(int n) {
        int totalDigits = String.valueOf(n).length();
        int[] arr = new int[totalDigits];

        for(int i = totalDigits-1; i>=0; i--){      // Arrays.sort(arr) yapsak sayilar karisir
            arr[i] = n - (n/10) * 10;
            n = n/10;
        }

        return arr;
    }
}
