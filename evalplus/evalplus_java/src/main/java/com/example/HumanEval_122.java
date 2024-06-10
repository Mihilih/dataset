package com.example;
//Here is the Java version of the Python code:


import java.util.*;

public class HumanEval_122 {
    public static int addElements(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (String.valueOf(Math.abs(arr[i])).length() <= 2) {
                sum += arr[i];
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] arr = {111,21,3,4000,5,6,7,8,9};
        int k = 4;
        System.out.println(addElements(arr, k)); // Outputs: 24
    }
}

// End of Code
