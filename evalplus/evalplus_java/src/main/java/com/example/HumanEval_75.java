package com.example;
public class HumanEval_75 {
    public static boolean isMultiplyPrime(int a) {
        if (a <= 1) return false;
        boolean[] isPrime = new boolean[a + 1];
        for (int i = 2; i <= a; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= a; i++) {
            if (isPrime[i]) {
                for (int j = i + i; j <= a; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0, temp = a;
        for (int i = 2; i <= a; i++) {
            while (isPrime[i] && temp % i == 0) {
                temp /= i;
                count++;
            }
        }
        return count == 3;
    }
}
// End of Code
