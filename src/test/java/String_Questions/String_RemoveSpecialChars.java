package String_Questions;

public class String_RemoveSpecialChars {
    public static void main(String[] args) {

        String sentence = "Hi, 007 James Bond!!!";
        System.out.println(removeSpecialCharachters(sentence));         // Hi 007 James Bond
    }

    public static String removeSpecialCharachters(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        str = str.replaceAll("\\s+", " ");              // to clean the spaces
        return str.trim();
    }
}
