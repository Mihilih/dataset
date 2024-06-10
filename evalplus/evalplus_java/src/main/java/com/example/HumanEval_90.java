package com.example;

import java.util.Arrays;

public class HumanEval_90 {
    public static Integer nextSmallest(Integer[] arr) {
        if (arr.length <= 1) return null;
        Arrays.sort(arr);
        for (Integer x : arr) {
            if (!x.equals(arr[0])) {
                return x;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println(nextSmallest(arr));
    }
}
// End of Code
