package Integer_Questions;

public class Integer_isItPrime {
    public static void main(String[] args) {

        // PRIME NUMBERS (STARTING FROM 2) (divisible by itself and 1)
        // The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29

        System.out.println(prime(28));
        System.out.println(prime(17));
        System.out.println(prime(2));
        System.out.println(prime(1));

    }

    public static boolean prime(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return (count < 1 && n > 1 ? true : false);
    }
}
