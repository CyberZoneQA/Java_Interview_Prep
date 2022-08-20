package List_Questions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveString {

    /*
    Given a list of people' names: "Mike", "John", Eric", "Mike".....
    Write a java operation to remove all the names named Ahmed
     */


    // solution 1
    public List<String> remove1(List<String> names) {
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Mike"))
                it.remove();
        }
        return names;
    }


    // solution 2
    public List<String> remove2(List<String> names) {
        names.removeAll(Arrays.asList("Mike"));
        return names;
    }


    // solution 3
    public List<String> remove3(List<String> names) {
        names.removeIf(name -> name.equals("Mike"));
        return names;
    }




}
