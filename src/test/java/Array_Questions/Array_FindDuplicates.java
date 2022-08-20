package Array_Questions;

import java.util.*;

public class Array_FindDuplicates {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C", "D", "D"};

        System.out.println(findDuplicates(arr));      // [B, D]

    }


    public static Set<String> findDuplicates(String[] arr){
        Set<String> result = new HashSet<>();
        int count = 0;

        for(String each : arr){
            for (String each2 : arr){
                if(each==each2){
                    count++;
                }
            }
            if (count>1){
                result.add(each);
            }
            count = 0;
        }
        return result;
    }


        public static List<String> findDuplicates2(String[] arr){
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
