package com.example;
public class HumanEval_21 {
    public static double[] rescaleToUnit(double[] numbers) {
        double ma = numbers[0];
        double mi = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > ma) {
                ma = numbers[i];
            }
            if (numbers[i] < mi) {
                mi = numbers[i];
            }
        }

        double k = 1 / (ma - mi);
        double[] newNumbers = new double[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = (numbers[i] - mi) * k;
        }

        return newNumbers;
    }
}
// End of Code
