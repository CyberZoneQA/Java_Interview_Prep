package Array_Questions;

public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */

    public int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int index = 0;

        for (int each : array) {
            if (each != 0)
                result[index++] = each;
        }

        return result;
    }
}
