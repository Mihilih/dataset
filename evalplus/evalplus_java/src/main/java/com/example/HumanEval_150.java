package com.example;
public class HumanEval_150 {

    public static int x_or_y(int n, int x, int y) {
        return isPrime(n) ? x : y;
    }

    private static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(x_or_y(7, 34, 12)); // should print 34
        System.out.println(x_or_y(15, 8, 5)); // should print 5
    }
} 
// End of Code
