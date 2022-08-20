package List_Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class List_MostCommonElementInAList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 4, 3, 4, 3, 2, 3, 3, 3, 3, 3);
        Integer maxOccurredElement = list.stream()
                .reduce(BinaryOperator.maxBy(Comparator.comparingInt(o -> Collections.frequency(list, o)))).orElse(null);
        System.out.println(maxOccurredElement);

    }
}
