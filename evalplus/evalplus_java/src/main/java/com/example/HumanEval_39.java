package com.example;
public class HumanEval_39 {
    private static boolean millerRabin(long n, int k) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;

        long d = n - 1;
        int r = 0;
        while (d % 2 == 0) {
            r++;
            d /= 2;
        }

        for (int i = 0; i < k; i++) {
            long a = 2 + (long) (Math.random() * ((n - 3) + 1));
            long x = power(a, d, n);
            if (x == 1 || x == n - 1) continue;

            boolean cont = false;
            for (int j = 0; j < r - 1; j++) {
                x = power(x, 2, n);
                if (x == n - 1) {
                    cont = true;
                    break;
                }
            }

            if (!cont) {
                return false;
            }
        }

        return true;
    }

    private static long power(long base, long exponent, long modulus) {
        long result = 1;
        base = base % modulus;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            exponent = exponent >> 1;
            base = (base * base) % modulus;
        }
        return result;
    }

    public static long primeFib(int n) {
        int countPrime = 0;
        long a = 0, b = 1;
        while (countPrime < n) {
            long temp = a;
            a = b;
            b = temp + b;

            if (millerRabin(b, 10)) {
                countPrime++;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(primeFib(5)); // should print 89
    }
}
// End of Code
