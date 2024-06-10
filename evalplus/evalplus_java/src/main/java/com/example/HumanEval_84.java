package com.example;
public class HumanEval_84 {
    public static void main(String[] args) {
        System.out.println(solve(1000));
        System.out.println(solve(150));
        System.out.println(solve(147));
    }

    public static String solve(int N) {
        int sum = 0;
        while (N != 0) {
            sum += N % 10;
            N /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}
// End of Code
