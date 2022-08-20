package String_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class regexSample {
    public static void main(String[] args) {

        String str = "  We1 a2re     getti4ng re?ady       !  ";
        cleanString(str);

        // output: We are getting ready

    }

    public static void cleanString(String sentence) {
        // Remove multiple spaces
        sentence = sentence.trim().replaceAll("\\s+", " ");
        List<String> list = new ArrayList<>(Arrays.asList(sentence.split(" ")));

        for (String each : list){
            // Remove digits & special charachters
            each = each.replaceAll("[^a-zA-Z]", "");
            System.out.print(each + " ");
        }

    }

}


