package Coding_Integer;

import java.util.ArrayList;
import java.util.List;

public class Number_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    public static int fibonacci2(int num) {
        int result = 0;
        int j = 0;
        int z = 1;

        for (int i = 1; i < num; i++) {
            result = j + z;
            j = z;
            z = result;
        }
        return result;
    }

    public static int factorialNumber(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }


    public static List<Integer> fibonacci(int n){
        List<Integer> list = new ArrayList();
        list.add(0);
        list.add(1);

        for (int i = 2; i < n; i++) {
            list.add(list.get(i-1)+list.get(i-2));
        }
        return list;
    }



}
