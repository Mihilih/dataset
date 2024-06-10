package com.example;
public class HumanEval_68 {
    public static int[] pluck(int[] arr) {
        int[] result = new int[2];
        boolean foundEven = false;
        int minEven = Integer.MAX_VALUE;
        int minIndex = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                foundEven = true;
                if (arr[i] < minEven) {
                    minEven = arr[i];
                    minIndex = i;
                }
            }
        }
        
        if (!foundEven) {
            return new int[0];
        } else {
            result[0] = minEven;
            result[1] = minIndex;
            return result;
        }
    }
}
// End of Code
