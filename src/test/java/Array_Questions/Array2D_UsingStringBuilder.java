package Array_Questions;

public class Array2D_UsingStringBuilder {
    public static void main(String[] args) {

        /* * * * *
         *  0 X X *
         *  X X 0 *
         *  0   0 *
         *  * * * */

        char[][] game = {{'O', 'X', 'X'}, {'X', 'X', 'O'}, {'O', ' ', 'O'}};

        StringBuilder matrix = new StringBuilder();

        for (char [] eachRow :game){
            for(char eachValue : eachRow){
                matrix.append(eachValue);
            }
            matrix.append('\n');
        }
        System.out.println(matrix);


    }
}
