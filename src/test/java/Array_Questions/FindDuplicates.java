package Array_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C", "D", "D"};

        System.out.println(findDups(arr));      // [B, D]

    }

    public static List<String> findDups(String[] arr){
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list, list.get(i) );
            if (count > 1 && !result.contains(list.get(i))) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}
