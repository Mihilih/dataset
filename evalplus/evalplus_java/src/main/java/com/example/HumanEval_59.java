package com.example;
public class HumanEval_59 {
    public static int largestPrimeFactor(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i + i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (isPrime[i] && n % i == 0) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(13195));  // Output: 29
        System.out.println(largestPrimeFactor(2048));   // Output: 2
    }
} // End of Code.
