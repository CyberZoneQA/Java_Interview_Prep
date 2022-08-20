package String_Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class String_countOfSpecificChar {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(countChars("Java", 'a'));
        System.out.println(countChars("Karaman", 'a'));
    }

    static int countChars(String str, char ch) {
        char[] arr = str.toLowerCase().toCharArray();
        ch = Character.toLowerCase(ch);

        Map<Character, Integer> map = new HashMap<>();
        for (char each : arr) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        return map.get(ch);
    }
}
