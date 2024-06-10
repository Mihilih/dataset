package com.example;
public class HumanEval_52 {
    public static boolean belowThreshold(int[] l, int t) {
        for (int i = 0; i < l.length; i++) {
            if (l[i] >= t) {
                return false;
            }
        }
        return true;
    }
}

// End of Code
