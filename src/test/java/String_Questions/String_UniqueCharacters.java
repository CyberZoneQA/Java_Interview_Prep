package String_Questions;

import java.util.*;

public class String_UniqueCharacters {
    public static void main(String[] args) {
        // Write a return method that can find the unique characters from the String

        String str = "AAABBBCCCDEF";
        System.out.println(unique(str));        // DEF
    }

    static String unique(String str) {
        String[] arr = str.split("");
        List list = Arrays.asList(arr);               // [A, A, A, B, B, B, C, C, C, D, E, F]
        Set<String> set = new HashSet<>(list);        // [A, B, C, D, E, F]

        String result = "";
        for (String each : set) {
            if (Collections.frequency(list, each) == 1)
                result += each;
        }
        return result;
    }

}

