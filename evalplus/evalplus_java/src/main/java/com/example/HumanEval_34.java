package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HumanEval_34 {
    public static Integer[] unique(Integer[] list) {
        Set<Integer> set = new HashSet<>(Arrays.asList(list));
        Integer[] uniqueArr = set.toArray(new Integer[0]);
        Arrays.sort(uniqueArr);
        return uniqueArr;
    }
    
    public static void main(String[] args) {
        Integer[] list = {5, 3, 5, 2, 3, 3, 9, 0, 123};
        Integer[] uniqueArr = unique(list);
        for (int i : uniqueArr) {
            System.out.print(i + " ");
        }
    }
}
// End of Code


