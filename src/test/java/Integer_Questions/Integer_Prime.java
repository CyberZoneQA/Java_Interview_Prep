package Integer_Questions;

public class Integer_Prime {
    public static void main(String[] args) {

        // sayı prime ise sayınınz kendisini yaz
        // değilse en küçük bölen sayıyı

        System.out.println(isPrime(9));      // 3
        System.out.println(isPrime(10));     // 2
        System.out.println(isPrime(11));     // 11
        System.out.println(isPrime(1));      // 1
    }

    public static int isPrime(long n) {
        for (int i = 2; i <=n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
//        for (int i = 3; i * i <= n; i += 2) {
//            if (n % i == 0)
//                return i;
//        }
        return (int) n;
    }
}
