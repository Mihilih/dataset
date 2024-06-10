package com.example;

import java.util.Arrays;

public class HumanEval_86 {
    public static String antiShuffle(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            char tempArray[] = word.toCharArray();
            Arrays.sort(tempArray);
            sb.append(new String(tempArray)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(antiShuffle("Hi"));
        System.out.println(antiShuffle("hello"));
        System.out.println(antiShuffle("Hello World!!!"));
    }
}
// End of Code
