package String_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class String_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }
        return result;
    }


    public static String removeDup2(String str) {
        Set<String> set = new HashSet(Arrays.asList(str.split("")));
        String result = "";
        for(String each : set){
            result +=each;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
        System.out.println(removeDup2("AAABBBCCC"));
    }

}
