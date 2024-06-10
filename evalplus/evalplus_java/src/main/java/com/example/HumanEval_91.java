package com.example;
public class HumanEval_91 {
    public static int is_bored(String S) {
        String[] sentences = S.replace("?", ".").replace("!", ".").split("\\.");
        int count = 0;
        for (String sentence : sentences) {
            if (sentence.trim().startsWith("I ")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(is_bored("Hello world")); // 0
        System.out.println(is_bored("The sky is blue. The sun is shining. I love this weather")); // 1
    }
}

// End of Code
