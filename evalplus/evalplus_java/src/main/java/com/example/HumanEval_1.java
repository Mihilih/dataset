package com.example;

import java.util.ArrayList;
import java.util.List;

public class HumanEval_1 {
    public static List<String> separateParenGroups(String parenString) {
        int cnt = 0;
        String group = "";
        List<String> results = new ArrayList<>();

        for (char ch : parenString.toCharArray()) {
            if (ch == '(') cnt += 1;
            if (ch == ')') cnt -= 1;
            if (ch != ' ') group += ch;
            if (cnt == 0) {
                if (!group.equals("")) {
                    results.add(group);
                    group = "";
                }
            }
        }
        return results;
    }
}
// End of Code


