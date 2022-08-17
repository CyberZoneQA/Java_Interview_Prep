package Coding_Integer;

import java.util.Scanner;

public class Double_ParaUstu {
    public static void main(String[] args) {
        /*
         * ComputeChange
         *
         * Enter an amount, for example: 11.56 Your amount 11.56 consists of
         * 11 dollars
         * 2 quarters
         * 0 dimes
         * 1 nickels 1 pennies
         *
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount: ");
        double num = input.nextDouble();             // 11.56

        int total = (int) (num * 100);                //1156
        int cents = total % 100;                      // 56
        int dollars = (total - cents) / 100;

        int quarters = cents / 25;
        cents = cents - (quarters * 25);
        int dimes = cents / 10;
        cents = cents - (dimes * 10);
        int nickels = cents / 5;
        cents = cents - (nickels * 5);
        int pennies = cents;

        System.out.println(dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies.");

    }
}
