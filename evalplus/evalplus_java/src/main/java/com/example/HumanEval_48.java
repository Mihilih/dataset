package com.example;
public class HumanEval_48 {

    public static boolean isPalindrome(String text) {
        int length = text.length();

        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("aaaaa"));
        System.out.println(isPalindrome("zbcd"));
    }
} 
// End of Code
