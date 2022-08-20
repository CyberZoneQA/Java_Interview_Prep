package String_Questions;

public class String_HarfDegistime {
    public static void main(String[] args) {

        String str = "ABCDEF";      // Expected OUTPUT: BCDEFG

        String target = "";
        for (int i = 0; i < str.length(); i++) {
            target += (char) (str.charAt(i) + 1);
        }
        System.out.println(target);

        // Note:
        System.out.println( str.charAt(3)   );       // D
        System.out.println( str.charAt(3)+1 );       // 69
        System.out.println( (char) 69       );       // E
    }
}
