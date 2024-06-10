package com.example;
public class HumanEval_110 {
    public static String exchange(int[] lst1, int[] lst2) {
        int cnt_odd = (int) java.util.Arrays.stream(lst1).filter(x -> x % 2 == 1).count();
        int cnt_even = (int) java.util.Arrays.stream(lst2).filter(x -> x % 2 == 0).count();
        return cnt_odd <= cnt_even ? "YES" : "NO";
    }
}
// End of Code
