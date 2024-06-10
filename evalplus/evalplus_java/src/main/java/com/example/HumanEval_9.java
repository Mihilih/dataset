package com.example;

import java.util.ArrayList;
import java.util.List;

public class HumanEval_9 {
    public static List<Integer> rollingMax(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        int currentMax = numbers.get(0);
        result.add(currentMax);
        for(int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) > currentMax) {
                currentMax = numbers.get(i);
            }
            result.add(currentMax);
        }
        return result;
    }
}

// End of Code
