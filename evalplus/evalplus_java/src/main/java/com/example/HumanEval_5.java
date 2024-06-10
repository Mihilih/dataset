package com.example;

import java.util.ArrayList;
import java.util.List;

public class HumanEval_5 {
    public static List<Integer> intersperse(List<Integer> numbers, int delimeter) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            res.add(numbers.get(i));
            if (i != numbers.size() - 1) {
                res.add(delimeter);
            }
        }
        return res;
    }
}

// End of Code
