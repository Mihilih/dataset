package com.example;
public class HumanEval_65 {
    public static String circularShift(int x, int shift) {
        String s = Integer.toString(x);
        if (shift > s.length()) return new StringBuilder(s).reverse().toString();
        shift %= s.length();
        if (shift == 0) {
            return s;
        } else {
            return s.substring(s.length() - shift) + s.substring(0, s.length() - shift);
        }
    }
}
// End of Code
