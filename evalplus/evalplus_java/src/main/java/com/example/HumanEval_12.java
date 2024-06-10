package com.example;

import java.util.List;

public class HumanEval_12 {
    public static String longest(List<String> strings) {
        if (strings.isEmpty()) {
            return null;
        }

        int maxlen = 0;
        String longestString = null;
        for (String s : strings) {
            if (s.length() > maxlen) {
                maxlen = s.length();
                longestString = s;
            }
        }

        return longestString;
    }
}

// End of Code
