package com.example;
public class HumanEval_55 {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fib(10)); // 55
        System.out.println(fib(1)); // 1
        System.out.println(fib(8)); // 21
    }
} // End of Code
