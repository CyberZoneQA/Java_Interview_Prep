package String_Questions;

import java.util.*;

public class String_Frequency_of_a_word {
    public static void main(String[] args) {
        String sentence = "Be or not to    be!";
        System.out.println(countWord(sentence,"be"));
        System.out.println(countWord2(sentence,"be"));
//        countWords(sentence);

    }

    public static int countWord(String input, String target){
        input = input.toLowerCase().replaceAll("[?!.>]", "");
        target = target.toLowerCase();
        List<String> list = new ArrayList<>(Arrays.asList(input.split(" ")));
        int occurrence = Collections.frequency(list, target);
        return occurrence;
    }

    public static int countWord2(String input, String target){
        input = input.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String[] arr = input.split("\\s+");
        List<String> list = new ArrayList<>();
        for(String each:arr){
            list.add(each);
        }

        return Collections.frequency(list, target);
    }


    public static void countWords(String text) {
        text = text.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        List<String> list = Arrays.asList(text.split("\\s+"));
        Set<String> uniqueWords = new HashSet<>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
    }




}
