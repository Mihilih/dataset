package com.example;
public class HumanEval_133 {
    public static void main(String[] args) {
        double[] arr = {1.4, 4.2, 0};
        System.out.println(sumSquares(arr));
    }

    public static int sumSquares(double[] lst) {
        int sum = 0;
        for (double num : lst) {
            sum += Math.pow(Math.ceil(num), 2);
        }
        return sum;
    }
}
// End of Code
