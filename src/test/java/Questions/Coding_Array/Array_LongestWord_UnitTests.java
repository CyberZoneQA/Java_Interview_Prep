package Coding_Array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static Coding_Array.Array_LongestWord.longestWord;
import static Coding_Array.Array_LongestWord.longestWords;


public class Array_LongestWord_UnitTests {

    @Test
    public void Test(){
        List<String> list = Arrays.asList(
                "The cow jumped over the moon."  ,
                "The cow...., jumped! over3 4the6 moon.",
                "The cowboy jumped over the moon."

        );

        Assertions.assertEquals("jumped", longestWord(list.get(0)));
        Assertions.assertEquals("jumped" , longestWord(list.get(1)));

        Assertions.assertEquals(Arrays.asList("cowboy", "jumped") , longestWords(list.get(2)));

    }
}
