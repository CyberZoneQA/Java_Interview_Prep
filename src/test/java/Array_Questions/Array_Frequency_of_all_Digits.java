package Array_Questions;

import java.util.*;

public class Array_Frequency_of_all_Digits {
    public static void main(String[] args) {

        int[] data = new int[]{5, 0, 0, 1, 0, 7, 4};
        frequencyOfDigits(data);

    }

    public static void frequencyOfDigits(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        Set<Integer> uniqueNums = new HashSet<>(list);
        for (Integer each : uniqueNums) {
            System.out.println(each + ": " + Collections.frequency(list, each));
        }

        // *** INFO ***
        int occurrences = Collections.frequency(list, 0);
        System.out.println("occurrences of zero is " + occurrences);

    }
}
