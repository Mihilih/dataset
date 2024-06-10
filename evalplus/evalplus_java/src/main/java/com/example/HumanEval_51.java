package com.example;
public class HumanEval_51 {
    public static String removeVowels(String text) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) == -1) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeVowels(""));
        System.out.println(removeVowels("abcdef\nghijklm"));
        System.out.println(removeVowels("abcdef"));
        System.out.println(removeVowels("aaaaa"));
        System.out.println(removeVowels("aaBAA"));
        System.out.println(removeVowels("zbcd"));
    }
}
// End of Code
