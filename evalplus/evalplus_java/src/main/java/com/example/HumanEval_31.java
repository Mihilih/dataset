package com.example;
public class HumanEval_31 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        int nSqrt = 1;
        while (nSqrt * nSqrt < n) nSqrt++;
        for (int i = 2; i < Math.min(nSqrt + 1, n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(6)); // should return false
        System.out.println(isPrime(101)); // should return true
        System.out.println(isPrime(11)); // should return true
        System.out.println(isPrime(13441)); // should return false
        System.out.println(isPrime(61)); // should return true
        System.out.println(isPrime(4)); // should return false
        System.out.println(isPrime(1)); // should return false
    }
}
// End of Code
