package Array_Questions;

import java.util.Arrays;

// 1st row => 1st column
// 2nd row => 2nd column
// 3rd row => 3nd column
public class Array2D_Rotate90Degree {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.deepToString(rotateImage(arr)));
    }

    static int[][] rotateImage(int[][] a) {
        int[][] rotated = new int [a.length][a[0].length];
        int c = a.length-1;
        for(int i=0; i<a.length; i++){
            for(int j = 0; j<a.length ; j++){
                rotated[i][c] = a[j][i];
                c--;
                // System.out.println(Arrays.deepToString(rotated));
            }
            c = a.length-1;
        }
        return rotated;
    }
}
