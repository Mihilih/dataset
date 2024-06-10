package com.example;
public class HumanEval_3 {
    public static boolean belowZero(int[] operations) {
        int account = 0;
        for (int operation : operations) {
            account += operation;
            if (account < 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(belowZero(new int[] {1, 2, 3})); // False
        System.out.println(belowZero(new int[] {1, 2, -4, 5})); // True
    }
} // End of Code
