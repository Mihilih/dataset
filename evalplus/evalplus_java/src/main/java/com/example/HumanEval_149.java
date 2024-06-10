package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HumanEval_149 {
    public static List<String> sortedListSum(List<String> lst) {
        List<String> filteredList = new ArrayList<>();
        for (String s : lst) {
            if (s.length() % 2 == 0) {
                filteredList.add(s);
            }
        }

        Collections.sort(filteredList, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                } else {
                    return s1.compareTo(s2);
                }
            }
        });

        return filteredList;
    }
}
// End of Code


