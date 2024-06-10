package com.example;
public class HumanEval_155 {
    public static int[] evenOddCount(int num) {
        int even = 0, odd = 0;
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            if (ch == '0' || ch == '2' || ch == '4' || ch == '6' || ch == '8') even++;
            if (ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9') odd++;
        }
        return new int[]{even, odd};
    }
}
// End of Code
