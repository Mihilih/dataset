package com.example;
//Here is the corresponding Java code:


import java.util.Arrays;

public class HumanEval_109 {
    public static boolean moveOneBall(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        if(Arrays.equals(arr, sortedArr)) return true;
        for(int i = 1; i < arr.length; i++) {
            int[] rotatedArr = new int[arr.length];
            for(int j = 0; j < arr.length; j++) {
                rotatedArr[j] = arr[(j + i) % arr.length];
            }
            if(Arrays.equals(rotatedArr, sortedArr)) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(moveOneBall(new int[]{3, 4, 5, 1, 2})); // true
        System.out.println(moveOneBall(new int[]{3, 5, 4, 1, 2})); // false
    }
}

//End of Code.
