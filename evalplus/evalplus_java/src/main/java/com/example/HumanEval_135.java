package com.example;
public class HumanEval_135 {

    public static int canArrange(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (!(arr[i] >= arr[i - 1])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 3, 5};
        int[] arr2 = {1, 2, 3};

        System.out.println(canArrange(arr1));  // output: 3
        System.out.println(canArrange(arr2));  // output: -1
    }
}
// End of Code
