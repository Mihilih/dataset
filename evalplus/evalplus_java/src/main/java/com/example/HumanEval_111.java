package com.example;
// Here is your Python code translated to Java:


import java.util.*;

public class HumanEval_111 {
    public static Map<String, Integer> histogram(String test) {
        if (test.equals("")) {
            return new HashMap<>();
        }

        String[] words = test.split(" ");
        Map<String, Integer> count = new HashMap<>();
        Map<String, Integer> ans = new HashMap<>();
        
        for (String word : words) {
            if (!word.equals("")) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }
        }
        
        int mx = Collections.max(count.values());
        
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() == mx) {
                ans.put(entry.getKey(), entry.getValue());
            }
        }
        
        return ans;
    }
}

// End of Code
