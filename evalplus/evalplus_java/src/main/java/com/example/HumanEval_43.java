package com.example;
public class HumanEval_43 {
    public static boolean pairsSumToZero(int[] l) {
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l.length; j++) {
                if (i != j && l[i] + l[j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
// End of Code
