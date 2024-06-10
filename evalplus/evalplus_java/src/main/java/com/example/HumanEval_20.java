package com.example;

import java.util.Arrays;

public class HumanEval_20 {
    public static double[] findClosestElements(double[] numbers) {
        Arrays.sort(numbers);
        double minDiff = Double.POSITIVE_INFINITY;
        double[] minPair = new double[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            double diff = numbers[i + 1] - numbers[i];
            if (diff < minDiff) {
                minDiff = diff;
                minPair[0] = numbers[i];
                minPair[1] = numbers[i + 1];
            }
        }
        return minPair;
    }
}

// End of Code
