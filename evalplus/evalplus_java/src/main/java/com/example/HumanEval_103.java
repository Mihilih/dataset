package com.example;
public class HumanEval_103 {
    public static String roundedAvg(int n, int m) {
        if (n > m) {
            return "-1";
        }
        int avg = Math.round((n + m) / 2.0f);
        return Integer.toBinaryString(avg);
    }

    public static void main(String[] args) {
        System.out.println(roundedAvg(1, 5)); // "11"
        System.out.println(roundedAvg(7, 5)); // "-1"
        System.out.println(roundedAvg(10, 20)); // "1111"
        System.out.println(roundedAvg(20, 33)); // "11010"
    }
} // End of Code
