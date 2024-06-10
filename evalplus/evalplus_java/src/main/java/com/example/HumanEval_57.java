package com.example;
public class HumanEval_57 {
    public static boolean monotonic(int[] l) {
        boolean inc = true, dec = true;
        for (int i = 0; i < l.length - 1; i++) {
            if (l[i] > l[i + 1]) inc = false;
            if (l[i] < l[i + 1]) dec = false;
        }
        return inc || dec;
    }
    public static void main(String args[]) {
        System.out.println(monotonic(new int[] {1, 2, 4, 20}));  // True
        System.out.println(monotonic(new int[] {1, 20, 4, 10})); // False
        System.out.println(monotonic(new int[] {4, 1, 0, -10})); // True
    }
}
// End of Code
