package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HumanEval_104 {
    private static boolean judge(int x) {
        for (char ch : String.valueOf(x).toCharArray()) {
            if (Character.getNumericValue(ch) % 2 == 0)
                return false;
        }
        return true;
    }

    public static List<Integer> uniqueDigits(List<Integer> x) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer num : x) {
            if (judge(num))
                filteredList.add(num);
        }
        Collections.sort(filteredList);
        return filteredList;
    }
}
// End of Code

//In above Java code, `HumanEval_104` is the main class. Inside it, we first define a helper method `judge` which checks whether a number contains any even digit or not. If it contains even digit, it returns false otherwise true.
//
//Then we define the main method `uniqueDigits` which accepts a list of integers as input. It creates a new list `filteredList`. It iterates over the input list and for each number, it checks whether the number contains any even digit or not by calling the `judge` method. If it does not contain any even digit, it adds the number to the `filteredList`.
//
//Finally, it sorts the `filteredList` in increasing order and returns it.
