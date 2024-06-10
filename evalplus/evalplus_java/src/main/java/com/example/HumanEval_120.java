package com.example;
//Here is the Java version of the given Python code:


import java.util.*;

class HumanEval_120 {
    public List<Integer> maximum(int[] arr, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        return list.subList(0, k);
    }
}

//End of Code.
