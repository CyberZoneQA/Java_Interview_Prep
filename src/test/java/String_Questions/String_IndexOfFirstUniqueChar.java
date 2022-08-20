package String_Questions;

import java.util.*;

public class String_IndexOfFirstUniqueChar {

    /*
    Given a string, find the first non-repeating character in it and return its index.
    If it doesn't exist, return -1.
     */

    public static int indexOfFirstNonRepeatingChar(String s) {
        List list = new LinkedList(Arrays.asList(s.split("")));
        Set<String> set = new LinkedHashSet<>(list);
        for(String each : set){
            if(Collections.frequency(list, each)==1){
                return s.indexOf(each);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str ="americam";
        System.out.println(indexOfFirstNonRepeatingChar(str));  //2
    }


}
