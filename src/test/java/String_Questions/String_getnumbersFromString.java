package String_Questions;

public class String_getnumbersFromString {
    public static void main(String[] args) {

        String str = "9online132x";
        String numbers = "";
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c >= '0' && c <= '9')
                numbers += c;
        }
        System.out.println(numbers);        // 9132
        int n = Integer.parseInt(numbers);

        int sum =0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum +=Integer.parseInt(str.charAt(i)+"");
            }
        }
        System.out.println(sum);
        System.out.println(sum(str));

    }

    static int sum(String s){
        int sum=0;
        String [] str=s.split("");
        for(String each:str){
            sum +=Integer.parseInt(each);
        }
        return sum;
    }

    //      'A' && 'Z' || 'a' && 'z'
}
