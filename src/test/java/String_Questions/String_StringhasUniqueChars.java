package String_Questions;

public class String_StringhasUniqueChars {

    public static boolean hasUniqueChars(String str) {
        return str.chars().distinct().count() == str.length();
    }

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("cyber"));
        System.out.println(hasUniqueChars("anne"));

    }
}
