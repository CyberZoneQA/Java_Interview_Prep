package String_Questions;

public class String_Palindrome {
    public static void main(String[] args) {

        System.out.println(palindrome("racecar"));
        System.out.println(palindrome("dogan"));

        System.out.println(palindrome2("racecar"));
        System.out.println(palindrome2("dogan"));

    }

    public static boolean palindrome(String str){
        boolean boo = true;

        int first = 0;
        int last = str.length()-1;
        while(first<last){
            if(str.charAt(first)!=str.charAt(last)){
                boo=false;
            }
            first++;
            last--;
        }
        return boo;
    }


    public static boolean palindrome2(String str){
        String reversed ="";
        for(int i=str.length()-1; i>=0; i--){
            reversed =reversed + str.charAt(i);
        }
        if(str.contentEquals(reversed)){
            return true;
        }else{
            return false;
        }

    }
}
