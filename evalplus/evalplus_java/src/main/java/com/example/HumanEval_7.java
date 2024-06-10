package com.example;

import java.util.ArrayList;
import java.util.List;

public class HumanEval_7 {
    public static List<String> filterBySubstring(List<String> strings, String substring) {
        List<String> filteredStrings = new ArrayList<>();
        for (String s : strings) {
            if (s.contains(substring)) {
                filteredStrings.add(s);
            }
        }
        return filteredStrings;
    }
}
// End of Code


