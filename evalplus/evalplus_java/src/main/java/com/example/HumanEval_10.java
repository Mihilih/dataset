package com.example;

public class HumanEval_10 {
    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static String makePalindrome(String s) {
        if (isPalindrome(s)) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s.substring(i))) {
                return s + new StringBuilder(s.substring(0, i)).reverse().toString();
            }
        }
        return "";
    }
}

// End of Code
