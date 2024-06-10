package com.example;

public class HumanEval_100 {

    public static int[] makeAPile(int n) {
        int[] ans = new int[n];
        int num = n;
        for (int i = 0; i < n; i++) {
            ans[i] = num;
            num += 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] result = makeAPile(n);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
// End of Code


