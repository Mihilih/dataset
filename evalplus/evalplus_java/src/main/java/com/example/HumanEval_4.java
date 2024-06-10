package com.example;


import java.util.List;

public class HumanEval_4 {

    public static float meanAbsoluteDeviation(List<Float> numbers) {
        float sum = 0;
        for (float number : numbers) {
            sum += number;
        }
        float mean = sum / numbers.size();

        float mad = 0;
        for (float number : numbers) {
            mad += Math.abs(number - mean);
        }
        return mad / numbers.size();
    }
}

