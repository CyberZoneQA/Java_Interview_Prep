package String_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class camelFormat {

    public static void main(String[] args) {

        String str = "DIKKAT DIKKAT!";
        System.out.println(camelFormat(str));             // Dikkat Dikkat

    }

    private static String camelFormat(String str) {
        String reply= "";
        String[] arr = str.toUpperCase().split(" ");
        for (String each : arr) {
            reply = reply + each.charAt(0) + each.substring(1).toLowerCase() + " ";
        }
        return reply.trim();
    }
}
