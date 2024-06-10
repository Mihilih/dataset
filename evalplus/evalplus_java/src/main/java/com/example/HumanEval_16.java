package com.example;

import java.util.HashSet;
import java.util.Set;

public class HumanEval_16 {
    public static int countDistinctCharacters(String str) {
        Set<Character> distinctChars = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            distinctChars.add(Character.toLowerCase(str.charAt(i)));
        }
        return distinctChars.size();
    }

    public static void main(String[] args) {
        System.out.println(countDistinctCharacters("xyzXYZ")); // prints 3
        System.out.println(countDistinctCharacters("Jerry")); // prints 4
    }
}

// End of Code
