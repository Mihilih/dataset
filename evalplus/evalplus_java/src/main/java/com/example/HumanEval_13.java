package com.example;
public class HumanEval_13 {

    public static int greatestCommonDivisor(int a, int b) {
        return queryGcd(a, b);
    }

    private static int queryGcd(int a, int b) {
        return b == 0 ? a : queryGcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(3, 5));  // 1
        System.out.println(greatestCommonDivisor(25, 15));  // 5
    }
} 
// End of Code
