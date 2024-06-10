package com.example;
public class HumanEval_101 {

    public static String[] words_string(String s) {
        s = s.replace(",", " ");
        String[] words = s.split("\\s+");
        return words;
    }

    public static void main(String[] args) {
        String[] result = words_string("Hi, my name is John");
        for(String word : result) {
            System.out.println(word);
        }
    }
}
// End of Code
