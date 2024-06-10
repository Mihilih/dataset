package com.example;
public class HumanEval_18 {

    public static int howManyTimes(String string, String substring) {
        int occurrences = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i).startsWith(substring)) {
                occurrences++;
            }
        }
        return occurrences;
    }

    public static void main(String[] args) {
        System.out.println(howManyTimes("", "a"));
        System.out.println(howManyTimes("aaa", "a"));
        System.out.println(howManyTimes("aaaa", "aa"));
    }
}

// End of Code.
