package String_Questions;

import java.util.*;

public class String_OccurenceOfWords {
    public static void main(String[] args) {

        String str1 = "I am happy and why not ";
        String str2 = "why are you not     happy and    you should be";

        str1 = str1.concat(str2);          // arada space yoksa 2 kelimeyi birlestirir. dikkat
        String[] arr = str1.split("\\s+");
        List<String> list = Arrays.asList(arr);
        Set<String> set = new HashSet<>(list);

        for (String each : set) {
            System.out.println(each + " exists " + Collections.frequency(list, each) + " times.");
        }
    }
}
