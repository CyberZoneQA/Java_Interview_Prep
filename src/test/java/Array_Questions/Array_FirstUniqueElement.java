package Array_Questions;

public class Array_FirstUniqueElement {

    /*
    write a method that can find the first duplicated element from the array
     */

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = -1;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }
            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }
        }
        return firstDuplicated;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,4,5,6};
        int[] arr1 = {2,3,4};
        System.out.println(firstDuplicatedElement(arr1));
    }
}
