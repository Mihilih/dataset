package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class HumanEval_30 {
    public static ArrayList<Integer> getPositive(ArrayList<Integer> l) {
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        for(int i: l) {
            if(i > 0) {
                positiveNumbers.add(i);
            }
        }
        return positiveNumbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-1, 2, -4, 5, 6));
        System.out.println(getPositive(numbers));
        numbers = new ArrayList<>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10));
        System.out.println(getPositive(numbers));
    }
}
// End of Code
