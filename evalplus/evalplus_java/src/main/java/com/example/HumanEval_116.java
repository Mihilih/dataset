package com.example;

import java.util.*;

public class HumanEval_116 {
    public static Integer[] sortArray(Integer[] arr) {
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                int x1 = Integer.bitCount(x);
                int y1 = Integer.bitCount(y);
                if (x1 != y1) return x1 - y1;
                return x - y;
            }
        };
        Arrays.sort(arr, cmp);
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 5, 2, 3, 4};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
}
// End of Code

//In the Java code, we use the built-in function `Integer.bitCount()` to count the number of ones in the binary representation of an integer. Then we use a custom comparator to sort the array based on the number of ones and the decimal value.
