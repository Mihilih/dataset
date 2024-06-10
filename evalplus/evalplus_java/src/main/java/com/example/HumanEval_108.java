package com.example;
public class HumanEval_108 {
    public static int count_nums(int[] arr) {
        int count = 0;
        for (int x : arr) {
            if (x < 0) {
                x = -x;
                int firstDigit = -Integer.parseInt(Integer.toString(x).substring(0, 1));
                int otherDigits = Integer.parseInt(Integer.toString(x).substring(1));
                if (firstDigit + otherDigits > 0) count++;
            } else {
                int sum = 0;
                while (x != 0) {
                    sum += x % 10;
                    x = x / 10;
                }
                if (sum > 0) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = {-1, 11, -11};
        int[] arr3 = {1, 1, 2};
        System.out.println(count_nums(arr1)); // should print 0
        System.out.println(count_nums(arr2)); // should print 1
        System.out.println(count_nums(arr3)); // should print 3
    }
} // End of Code
