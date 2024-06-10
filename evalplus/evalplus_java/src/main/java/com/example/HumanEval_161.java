package com.example;
//Here is the Java equivalent for your Python code:


public class HumanEval_161 {
    public static void main(String[] args) {
        System.out.println(solve("1234")); // "4321"
        System.out.println(solve("ab")); // "AB"
        System.out.println(solve("#a@C")); // "#A@c"
    }

    public static String solve(String s) {
        StringBuilder ans = new StringBuilder();
        boolean hasLetter = false;
        for(char ch : s.toCharArray()) {
            if(Character.isLetter(ch)) {
                hasLetter = true;
                ans.append(Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
            } else {
                ans.append(ch);
            }
        }
        return hasLetter ? ans.toString() : ans.reverse().toString();
    }
}

// End of Code
