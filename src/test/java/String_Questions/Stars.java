package String_Questions;

public class Stars {
    public static void main(String[] args) {

        int rows = 6;
        int n = 1;  // yildiz sayisi
        for (int row = 0; row < rows; row++) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            n++;
            System.out.println();
        }
    }
}
/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *

 */