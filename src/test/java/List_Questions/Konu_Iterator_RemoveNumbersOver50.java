package List_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Konu_Iterator_RemoveNumbersOver50 {
    public static void main(String[] args) {

        /*  INTERVIWQ Q: How you can remove an item when you iterating?    */
        // TASK: REMOVE NUMBERS OVER 50

        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(30, 20, 40, 50, 60, 70));
        Iterator<Integer> iter = lst.iterator();
        while (iter.hasNext()) {
            Integer item = iter.next();
            if (item > 50) {
                iter.remove();
            }
        }
        System.out.println(lst);      // [30, 20, 40, 50]


    }
}
