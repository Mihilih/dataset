package com.example;
public class HumanEval_151 {
    public static int doubleTheDifference(int[] lst) {
        int ans = 0;
        for (int num : lst) {
            if (num % 2 == 1 && num > 0) {
                ans += Math.pow(num, 2);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] lst1 = {1, 3, 2, 0};
        int[] lst2 = {-1, -2, 0};
        int[] lst3 = {9, -2};
        int[] lst4 = {0};
        
        System.out.println(doubleTheDifference(lst1)); // Outputs: 10
        System.out.println(doubleTheDifference(lst2)); // Outputs: 0
        System.out.println(doubleTheDifference(lst3)); // Outputs: 81
        System.out.println(doubleTheDifference(lst4)); // Outputs: 0
    }
} // End of Code
