package com.example;

import java.util.HashSet;
import java.util.Set;

public class HumanEval_54 {
    public static boolean sameChars(String s0, String s1) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        
        for (char c : s0.toCharArray()) {
            set1.add(c);
        }
        
        for (char c : s1.toCharArray()) {
            set2.add(c);
        }
        
        return set1.equals(set2);
    }

    public static void main(String[] args) {
        System.out.println(sameChars("eabcdzzzz", "dddzzzzzzzddeddabc")); // true
        System.out.println(sameChars("abcd", "dddddddabc")); // true
        System.out.println(sameChars("dddddddabc", "abcd")); // true
        System.out.println(sameChars("eabcd", "dddddddabc")); // false
        System.out.println(sameChars("abcd", "dddddddabce")); // false
        System.out.println(sameChars("eabcdzzzz", "dddzzzzzzzddddabc")); // false
    }
}
// End of Code
