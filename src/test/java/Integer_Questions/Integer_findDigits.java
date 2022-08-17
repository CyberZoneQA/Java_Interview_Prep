package Integer_Questions;

public class Integer_findDigits {
    public static void main(String[] args) {
        int check = 12321;
        System.out.println(digits(check));
        System.out.println(digits2(check));


    }

    static int digits(int n) {
        int digitCount = String.valueOf(n).length();
        return digitCount;
    }

    static int digits2(int n) {
        int result = 0;
        do {
            n = n / 10;
            // System.out.println(n);
            result++;
        } while (n != 0);
        return result;
    }
}
