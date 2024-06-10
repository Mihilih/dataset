package com.example;

public class HumanEval_127 {
    public static String intersection(int[] interval1, int[] interval2) {
        if (interval1[0] > interval2[0]) {
            int[] temp = interval1;
            interval1 = interval2;
            interval2 = temp;
        }
        int l = interval2[0];
        int r = Math.min(interval1[1], interval2[1]);
        return isPrime(r - l) ? "YES" : "NO";
    }

    public static boolean isPrime(int a) {
        if (a < 2) return false;
        for (int x = 2; x * x <= a; x++) {
            if (a % x == 0) return false;
        }
        return true;
    }
}
// End of Code


