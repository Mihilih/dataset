package com.example;
public class HumanEval_106 {
    public static int[] f(int n) {
        if (n == 0) return new int[]{};
        if (n == 1) return new int[]{1};
        if (n == 2) return new int[]{1, 2};

        int[] ans = new int[n];
        ans[0] = 1;
        ans[1] = 2;
        for (int i = 3; i <= n; i++) {
            if (i % 2 == 1) {
                ans[i - 1] = ans[i - 3] + (i - 1) + i;
            } else {
                ans[i - 1] = ans[i - 3] * (i - 1) * i;
            }
        }
        return ans;
    }
}
// End of Code
