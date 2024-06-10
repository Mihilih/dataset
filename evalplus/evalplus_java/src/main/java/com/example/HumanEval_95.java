package com.example;

import java.util.Map;
import java.util.Set;

public class HumanEval_95 {
    public static boolean checkDictCase(Map<String, String> dict) {
        Set<String> keys = dict.keySet();
        if (keys.isEmpty()) return false;
        boolean lower = true, upper = true;
        for (String k : keys) {
            if (k != null) {
                if (!k.equals(k.toLowerCase())) lower = false;
                if (!k.equals(k.toUpperCase())) upper = false;
            } else {
                lower = upper = false;
                break;
            }
        }
        return lower || upper;
    }
}
// End of Code
