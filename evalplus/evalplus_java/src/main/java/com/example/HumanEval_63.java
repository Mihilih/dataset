package com.example;
public class HumanEval_63 {

    public static int fibfib(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } 
        else if (n == 2) {
            return 1;
        }
        int a = 0, b = 0, c = 1;
        for (int i = 3; i <= n; i++) {
            int temp = a;
            a = b;
            b = c;
            c = temp + a + b;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(fibfib(1));  // Output: 0
        System.out.println(fibfib(5));  // Output: 4
        System.out.println(fibfib(8));  // Output: 24
    }
}
// End of Code
