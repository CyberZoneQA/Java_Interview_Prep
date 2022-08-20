package Integer_Questions;

public class Integer_countOfDigits {
    public static void main(String[] args) {
        int check = 12321;
        System.out.println(digits(check));
        System.out.println(digits2(check));

    }

    // convert int to String and get length
    static int digits(int n) {
        int digitCount = Integer.toString(n).length();      // or String.valueOf(n).length()
        return digitCount;
    }

    static int digits2(int n) {
        int result = 0;
        do {
            n = n / 10;
            result++;
            // System.out.println(n);
            // System.out.println(result);
        } while (n != 0);
        return result;
    }
}
