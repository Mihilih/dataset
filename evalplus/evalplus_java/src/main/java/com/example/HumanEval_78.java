package com.example;
public class HumanEval_78 {
    public static int hexKey(String num) {
        int count = 0;
        for(int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '2' || num.charAt(i) == '3' || num.charAt(i) == '5' || num.charAt(i) == '7' || num.charAt(i) == 'B' || num.charAt(i) == 'D') {
                count++;
            }
        }
        return count;
    }
}
// End of Code
