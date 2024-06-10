package com.example;
public class HumanEval_138 {

    public static boolean is_equal_to_sum_even(int n) {
        // Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
        return n >= 8 && n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(is_equal_to_sum_even(4)); // Should print False
        System.out.println(is_equal_to_sum_even(6)); // Should print False
        System.out.println(is_equal_to_sum_even(8)); // Should print True
    }
} // End of Code
