package com.example;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_29 {
    public static List<String> filterByPrefix(List<String> strings, String prefix) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.startsWith(prefix)) {
                result.add(str);
            }
        }
        return result;
    }
}

// End of Code
