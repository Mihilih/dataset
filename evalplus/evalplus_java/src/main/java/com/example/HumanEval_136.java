package com.example;

import java.util.*;

public class HumanEval_136 {
    public static Integer[] largestSmallestIntegers(int[] lst) {
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for(int i : lst){
            if(i < 0){
                neg.add(i);
            }else if(i > 0){
                pos.add(i);
            }
        }

        Integer a = (neg.isEmpty()) ? null : Collections.max(neg);
        Integer b = (pos.isEmpty()) ? null : Collections.min(pos);
        return new Integer[]{a, b};
    }
}

// End of Code.
