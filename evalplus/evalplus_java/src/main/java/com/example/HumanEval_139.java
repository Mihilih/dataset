package com.example;
public class HumanEval_139 {

    public static long specialFactorial(int n) {
        long fac = 1, ans = 1;
        for (int i = 2; i <= n; i++) {
            fac *= i;
            ans *= fac;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(specialFactorial(4));  // It will print: 288
    }
}
// End of Code
