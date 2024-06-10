package com.example;

import java.util.ArrayList;
import java.util.List;

public class HumanEval_6 {
    public List<Integer> parseNestedParens(String parenString) {
        List<Integer> result = new ArrayList<>();
        String[] groups = parenString.split(" ");

        for(String s : groups) {
            if(!s.isEmpty()) {
                result.add(countDepth(s));
            }
        }

        return result;
    }

    private int countDepth(String s) {
        int maxDepth = 0, count = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') count++;
            if(ch == ')') count--;
            maxDepth = Math.max(maxDepth, count);
        }
        return maxDepth;
    }
}
// End of Code


