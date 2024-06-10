package com.example;
public class HumanEval_37 {

    public static int[] sortEven(int[] l) {
        // Initialize an array to store the values at even indices
        int[] even = new int[l.length / 2 + l.length % 2];
        int j = 0;
        
        // Populate the even array
        for (int i = 0; i < l.length; i += 2) {
            even[j++] = l[i];
        }

        // Sort the even array
        java.util.Arrays.sort(even);

        // Create a new array for the result
        int[] result = new int[l.length];
        j = 0;

        // Populate the result array
        for (int i = 0; i < l.length; i++) {
            if (i % 2 == 0) {
                result[i] = even[j++];
            } else {
                result[i] = l[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Test the function
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {5, 6, 3, 4};

        arr1 = sortEven(arr1);
        arr2 = sortEven(arr2);

        System.out.println(java.util.Arrays.toString(arr1));
        System.out.println(java.util.Arrays.toString(arr2));
    }
}
// End of Code
