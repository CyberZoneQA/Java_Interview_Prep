package Array_Questions;


public class Array2D_matrix {
    public static void main(String[] args) {

        char[][] game = {{'O', 'X', 'X'}, {'X', 'X', 'O'}, {'O', ' ', 'O'}};

        // (A practice for foreach loop)
        // Display the array as below:
        /* * * * *
         *  0 X X *
         *  X X 0 *
         *  0   0 *
         *  * * * */

        for (char[] eachRow : game) {
            for (char eachValue : eachRow) {
                System.out.print(eachValue);
            }
            System.out.println();
        }

    }
}
