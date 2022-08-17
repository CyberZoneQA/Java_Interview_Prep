package Array_Questions;
// you will only check if an array is sorted ==> true or false

public class Array_IsArraySorted {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 9 };
        System.out.println(isArraySorted(arr));
    }

    public static boolean isArraySorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return false;
        }
        return true;
    }
}
