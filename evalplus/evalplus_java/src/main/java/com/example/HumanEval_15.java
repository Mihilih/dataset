package com.example;
public class HumanEval_15 {

    public static String stringSequence(int n) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i <= n; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim(); // trim to remove the trailing space
    }

    public static void main(String[] args) {
        System.out.println(stringSequence(0));
        System.out.println(stringSequence(5));
    }
}
// End of Code
