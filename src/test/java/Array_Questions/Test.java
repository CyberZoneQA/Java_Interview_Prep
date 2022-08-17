package Array_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        String str = "DIKKAT DIKKAT";
        System.out.println(camelFormat(str));       // Dikkat Dikkat

    }

    private static String camelFormat(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        return list.stream().map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase()).collect(Collectors.joining(" "));
    }


}
