package Integer_Questions;

public class Number_Prime {

    /*
        Write a method that can check if a number is prime or not
     */

    public boolean primeNumber(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }


}
