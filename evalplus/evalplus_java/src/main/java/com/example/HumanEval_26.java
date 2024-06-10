package com.example;

import java.util.*;

public class HumanEval_26 {
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        Map<Integer, Integer> numCnt = new HashMap<>();
        for (int number : numbers) {
            numCnt.put(number, numCnt.getOrDefault(number, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (numCnt.get(number) == 1) {
                result.add(number);
            }
        }
        return result;
    }
}
// End of Code


