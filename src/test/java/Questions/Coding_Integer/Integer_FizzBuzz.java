package Coding_Integer;

public class Integer_FizzBuzz {
    public static void main(String[] args) {

        int num =26;

        for(int i=1; i<=num; i++) {
            if (i%15 == 0)
                System.out.print("FizzBuzz ");
            else if (i%5 == 0)
                System.out.print("Fizz ");
            else if (i%3 == 0)
                System.out.print("Buzz ");
            else
                System.out.print(i +" ");
        }

        System.out.println();

    }
}
