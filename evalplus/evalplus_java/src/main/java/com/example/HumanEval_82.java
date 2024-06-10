package com.example;
//Here is the equivalent Java code:


public class HumanEval_82 {

    public static boolean primeLength(String text) {
        return isPrime(text.length());
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//End of Code.
