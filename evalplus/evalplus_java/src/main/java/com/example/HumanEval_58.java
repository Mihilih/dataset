package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class HumanEval_58 {
    public static ArrayList<Integer> common(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        HashSet<Integer> set1 = new HashSet<>(l1);
        HashSet<Integer> set2 = new HashSet<>(l2);
        set1.retainAll(set2);
        ArrayList<Integer> commonElements = new ArrayList<>(set1);
        Collections.sort(commonElements);
        return commonElements;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 3, 34, 653, 2, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 7, 1, 5, 9, 653, 121));
        System.out.println(common(list1, list2));

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5, 3, 2, 8));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(3, 2));
        System.out.println(common(list3, list4));
    }
}
// End of Code
