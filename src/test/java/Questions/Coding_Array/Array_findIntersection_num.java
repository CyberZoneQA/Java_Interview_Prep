package Coding_Array;

import java.util.Arrays;

public class Array_findIntersection_num {
    public static void main(String[] args) {

//        Have the function FindIntersection(strArr) read the array of strings stored
//        in strArr which will contain 2 elements: the first element will represent a
//        list of comma-separated numbers sorted in ascending order, the second element
//        will represent a second list of comma-separated numbers (also sorted).
//            Your goal is to return a comma-separated string containing the numbers that
//        occur in elements of strArr in sorted order. If there is no intersection, return the string false.

        String[] arr = {"1,2,3, 4,5,6", "  6 ,5,7, 8  "};
        System.out.println(findIntersection(arr));
        // Output: 5, 6

    }

    static String findIntersection(String[] arr) {
        String result = "";
        String[] arr1 = arr[0].replaceAll("\\s+", "").split(",");      // removing all spaces first
        Arrays.sort(arr1);
        String[] arr2 = arr[1].replaceAll("\\s+", "").split(",");

        for (String each : arr1) {
            for (String each2 : arr2) {
                if (each.contentEquals(each2)) {
                    result += each + ", ";
                }
            }
        }

        return result.substring(0, result.length() - 2);
    }
}
