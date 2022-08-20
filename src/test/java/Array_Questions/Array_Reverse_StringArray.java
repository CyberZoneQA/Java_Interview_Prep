package Array_Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Reverse_StringArray {

    // 1
    public static String[] reverseStrArray(String[] arr) {
        String[] answer = new String[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            answer[index++] = arr[i];
        }
        return answer;
    }

    // 2
    public static String[] reverseStringArray(String[] arr) {
        List<String> rev = Arrays.asList(arr);
        Collections.reverse(rev);
        arr = (String[]) rev.toArray();
        return arr;
    }


    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "1", "d", "y", "z"};
        System.out.println(Arrays.toString(reverseStrArray(arr)));


    }
}
