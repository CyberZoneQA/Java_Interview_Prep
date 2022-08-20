package List_Questions;

import java.util.*;

public class EliminateDUPLICATESfromList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A","B","C","D", "B", "C"));
     // List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3));

        Set<String> set = new HashSet<>(list);
        System.out.println(set);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    }
}
