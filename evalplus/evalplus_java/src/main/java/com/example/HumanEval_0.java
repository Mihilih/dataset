package com.example;
import java.util.Arrays;

public class HumanEval_0 {
    public static boolean hasCloseElements(double[] numbers, double threshold) {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] - numbers[i] < threshold) {
                return true;
            }
        }
        return false;
    }
}
// End of Code
