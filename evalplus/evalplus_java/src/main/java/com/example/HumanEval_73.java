package com.example;
public class HumanEval_73 {
    public static int smallest_change(int[] arr) {
        int cnt = 0;
        int arrLen = arr.length;
        int halfLen = arrLen/2;
        for (int i = 0; i < halfLen; i++) {
            if (arr[i] != arr[arrLen - 1 - i]) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(smallest_change(new int[]{1, 2, 3, 5, 4, 7, 9, 6})); // 4
        System.out.println(smallest_change(new int[]{1, 2, 3, 4, 3, 2, 2})); // 1
        System.out.println(smallest_change(new int[]{1, 2, 3, 2, 1})); // 0
    }
}
// End of Code.
