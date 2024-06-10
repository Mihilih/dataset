package com.example;
public class HumanEval_60 {
    public static int sum_to_n(int n) {
        return (n + 1) * n / 2;
    }

    public static void main(String[] args) {
        System.out.println(sum_to_n(30));  // 465
        System.out.println(sum_to_n(100)); // 5050
        System.out.println(sum_to_n(5));   // 15
        System.out.println(sum_to_n(10));  // 55
        System.out.println(sum_to_n(1));   // 1
    }
}
// End of Code
