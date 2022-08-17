package Coding_Integer;

public class Integer_ReverseNumber {
    public static void main(String[] args) {

        int n = 12345;
        System.out.println(reverseNumber(n));
    }

    public static int reverseNumber(int n) {
        String number = Integer.toString(n);
        StringBuilder sb = new StringBuilder(number);
        sb.reverse();
        int result = Integer.parseInt(sb.toString());
        return result;
    }

}
