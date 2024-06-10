package com.example;
public class HumanEval_76 {
    public static boolean is_simple_power(int x, int n) {
        if (x == 1) return true;
        if (n == 0) return x == 0;
        if (n == 1) return x == 1;
        if (n == -1) return Math.abs(x) == 1;
        int p = n;
        while (Math.abs(p) <= Math.abs(x)) {
            if (p == x) return true;
            p = p * n;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(is_simple_power(1, 4)); // Should print: true
        System.out.println(is_simple_power(2, 2)); // Should print: true
        System.out.println(is_simple_power(8, 2)); // Should print: true
        System.out.println(is_simple_power(3, 2)); // Should print: false
        System.out.println(is_simple_power(3, 1)); // Should print: false
        System.out.println(is_simple_power(5, 3)); // Should print: false
    }
} // End of Code
