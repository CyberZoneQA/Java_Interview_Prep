package String_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_FindFirstRepeatedChar {
    /**
     * Given a string, we should find the first occurrence of some letter
     *
     * @param str String to be used
     * @return Returns the letter duplicated.
     */
    static String findFirstRepeatedChar(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        if (str == null || str.isEmpty()) {
            return "";
        }
        for (String each : list) {
            if (Collections.frequency(list, each) > 1) {
                return each;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String test = null;
        System.out.println(findFirstRepeatedChar("abccdeghjj"));
        System.out.println(findFirstRepeatedChar(""));
        System.out.println(findFirstRepeatedChar(test));
    }
}
