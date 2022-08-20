package String_Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class String_Frequency_of_letters {
    public static void main(String[] args) {

        String str = "BHYKJSGDABCABCEFGAD";
        String[] arr = str.split("");                             // STEP 1
        Set<String> uniques = new HashSet<>(Arrays.asList(arr));        // STEP 2

        System.out.println(uniques);        // [A, B, C, D, E, F, G, H, J, K, S, Y]

        for(String each: uniques){
            System.out.println(each + " : " + Collections.frequency(Arrays.asList(arr),each));
        }

        // Collection kullanmadan yap derlerse

        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.substring(i, i + 1))) {
                unique += str.substring(i, i + 1);
            }
        }
        System.out.println(Arrays.toString(unique.split("")));


    }
}
