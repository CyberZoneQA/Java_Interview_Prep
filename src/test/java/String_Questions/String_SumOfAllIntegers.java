package String_Questions;

public class String_SumOfAllIntegers {

    /*
    return the sum of all integers found in the parameter String
    You can assume that integers are separated from other parts with one or more spaces (' ' symbol)
    For example, s="12 some text 3 7", result: 22 (12+3+7=22)
     */


    public static int getSumOfNumbers(String s) {
        int sum = 0;
        String[] numbers = s.replaceAll("[\\D]+"," ").split(" ");
        for(String each : numbers){
                sum+=Integer.parseInt(each);
        }

        return sum;
    }


    public static void main(String[] args) {

        String str = "34aaa8aaa9aa4aa";
        System.out.println(str.replaceAll("[\\D]+"," "));   // 34 8 9 4


    }

}
