package com.example;
public class HumanEval_8 {

    public static int[] sumProduct(int[] numbers) {
        int sum = 0;
        int product = 1;

        for (int number : numbers) {
            sum += number;
            product *= number;
        }

        return new int[]{sum, product};
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int[] result = sumProduct(numbers);

        System.out.println("Sum: " + result[0] + ", Product: " + result[1]);
    }
}
// End of Code
