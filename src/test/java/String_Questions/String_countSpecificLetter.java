package String_Questions;

public class String_countSpecificLetter {
    public static void main(String[] args) {
        String str = "javaaA";
//        System.out.println(count(str, 'a'));       // SENSITIVE
        System.out.println(countAgain(str, 'a'));     // find 'a' and 'A'
    }

    private static int count(String str, char a) {
        int result = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==a){
                result++;
            }
        }

        return result;
    }

    private static int countAgain(String str, char a) {
        int result = 0;
        str = str.toLowerCase();
        char c = (a+"").toLowerCase().charAt(0);
     // char c = String.valueOf(a).toLowerCase().charAt(0);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                result++;
            }
        }
        return result;
    }
}
