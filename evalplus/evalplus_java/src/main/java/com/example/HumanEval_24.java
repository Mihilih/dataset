package com.example;
public class HumanEval_24 {

    public static int largestDivisor(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return n / i;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(largestDivisor(15));
    }
} 
// End of Code
