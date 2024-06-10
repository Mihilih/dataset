package com.example;
public class HumanEval_33 {
    public static int[] sortThird(int[] l) {
        int[] third = new int[(l.length + 2) / 3];
        int j = 0;
        for (int i = 0; i < l.length; i += 3) {
            third[j++] = l[i];
        }
        java.util.Arrays.sort(third);
        int[] result = new int[l.length];
        for (int i = 0; i < l.length; ++i) {
            result[i] = i % 3 == 0 ? third[i / 3] : l[i];
        }
        return result;
    }
}
// End of Code
