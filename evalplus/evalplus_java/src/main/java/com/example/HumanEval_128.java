package com.example;
public class HumanEval_128 {

    public static Integer prodSigns(int[] arr) {
        if (arr.length == 0) return null;
        int sum = 0, sign = 1;
        for (int x : arr) {
            if (x == 0) return 0;
            sum += Math.abs(x);
            sign *= Math.signum(x);
        }
        return sum * sign;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, -4};
        System.out.println(prodSigns(arr1)); // -9

        int[] arr2 = {0, 1};
        System.out.println(prodSigns(arr2)); // 0

        int[] arr3 = {};
        System.out.println(prodSigns(arr3)); // null
    }
} // End of Code
