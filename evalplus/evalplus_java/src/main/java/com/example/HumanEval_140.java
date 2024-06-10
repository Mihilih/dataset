package com.example;
public class HumanEval_140 {
    public static String fixSpaces(String text) {
        String ans = text;
        for (int i = text.length(); i > 2; i--) {
            ans = ans.replace(repeatChar(' ', i), "-");
        }
        return ans.replace(" ", "_");
    }

    public static String repeatChar(char c, int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(fixSpaces("Example"));
        System.out.println(fixSpaces("Example 1"));
        System.out.println(fixSpaces(" Example 2"));
        System.out.println(fixSpaces(" Example   3"));
    }
} // End of Code
