package Coding_Array;

public class Array_Frequency_of_a_Digit {
    public static void main(String[] args) {

        int[] data = new int[]{5, 0, 0, 1, 0, 7, 4};
        System.out.println(frequencyOfDigit(data, 0));          // 3

    }

    // occurrence of n in int[]
    public static int frequencyOfDigit(int[] arr, int n) {
        int occurrence = 0;
        for (int each : arr) {
            if (each == n) {
                occurrence++;
            }
        }
        return occurrence;
    }

}
