package com.example;
public class HumanEval_147 {
    public static long getMaxTriples(int n) {
        if (n <= 2) {
            return 0;
        }

        int oneCnt = 1 + (n - 2) / 3 * 2 + (n - 2) % 3;
        int zeroCnt = n - oneCnt;
        
        return oneCnt * (oneCnt - 1L) * (oneCnt - 2) / 6 + zeroCnt * (zeroCnt - 1L) * (zeroCnt - 2) / 6;
    }
}
// End of Code.
