package Coding_Array;

import java.util.ArrayList;
import java.util.List;

public class Array_LongestWord {
    public static void main(String[] args) {
        String str = "The cowboy jumped over the moon.";
        System.out.println(longestWord(str));               // cowboy
        System.out.println(longestWords(str));              // [cowboy, jumped]

    }

    /* this will return one word only  */
    public static String longestWord(String sentence) {

        // remove digits & special charachters & multiple spaces
        sentence = sentence.replaceAll("[^a-zA-Z]", " ");
        sentence = sentence.replaceAll("\\s+", " ");

        // get an array
        String[] arr = sentence.split(" ");

        // find the longest length
        int maxLength = 0;
        for(String each:arr){
            if(each.length()>maxLength){
                maxLength = each.length();
            }
        }

        // print the word(s) which has the max length
        for(String each:arr){
            if(each.length()==maxLength){
                return each;
            }
        }
        return "";
    }

    /* this will return longest words in List  */
    public static List longestWords(String sentence) {
        List<String> list = new ArrayList<>();
        // remove digits & special charachters & multiple spaces
        sentence = sentence.replaceAll("[^a-zA-Z]", " ");
        sentence = sentence.replaceAll("\\s+", " ");

        // get an array
        String[] arr = sentence.split(" ");

        // find the longest length
        int maxLength = 0;
        for(String each:arr){
            if(each.length()>maxLength){
                maxLength = each.length();
            }
        }

        // print the word(s) which has the max length
        for(String each:arr){
            if(each.length()==maxLength){
                list.add(each);
            }
        }
        return list;
    }


}
