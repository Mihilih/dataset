package com.example;
public class HumanEval_49 {
    public static int modp(int n, int p) {
        int res = 1;
        int x = 2;
        while (n != 0) {
            if (n % 2 == 1) {
                res = (res * x) % p;
            }
            x = (x * x) % p;
            n /= 2;
        }
        return res % p;
    }

    public static void main(String[] args) {
        System.out.println(modp(3, 5)); // should print 3
        System.out.println(modp(1101, 101)); // should print 2
        System.out.println(modp(0, 101)); // should print 1
        System.out.println(modp(3, 11)); // should print 8
        System.out.println(modp(100, 101)); // should print 1
    }
}
// End of Code
