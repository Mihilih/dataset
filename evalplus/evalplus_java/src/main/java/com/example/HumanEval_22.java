package com.example;

import java.util.ArrayList;
import java.util.List;

public class HumanEval_22 {
    public static List<Integer> filterIntegers(List<Object> values) {
        List<Integer> integers = new ArrayList<>();
        for (Object value : values) {
            if (value instanceof Integer) {
                integers.add((Integer) value);
            }
        }
        return integers;
    }
}

// End of Code
