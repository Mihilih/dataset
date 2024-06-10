package com.example;
public class HumanEval_62 {
    public static int[] derivative(int[] xs) {
        int[] result = new int[xs.length - 1];
        for (int i = 1; i < xs.length; i++) {
            result[i - 1] = xs[i] * i;
        }
        return result;
    }
}

// End of Code
