package String_Questions;

public class String_Reverse {

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    public static String strReverse(String str) {
        String reverse = "";
        // first I am creating an empty string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


    public static void main(String[] args) {
        System.out.println( reverse("USA") );
        System.out.println( strReverse("TEAM") );
    }


}
