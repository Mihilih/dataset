package com.example;

import java.util.*;

public class HumanEval_126 {
    public static boolean isSorted(int[] lst) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int x : lst) {
            count.put(x, count.getOrDefault(x, 0) + 1);
            if (count.get(x) > 2) return false;
        }
        int[] sortedLst = lst.clone();
        Arrays.sort(sortedLst);
        return Arrays.equals(lst, sortedLst);
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{5})); // ➞ True
        System.out.println(isSorted(new int[]{1, 2, 3, 4, 5})); // ➞ True
        System.out.println(isSorted(new int[]{1, 3, 2, 4, 5})); // ➞ False
        System.out.println(isSorted(new int[]{1, 2, 3, 4, 5, 6})); // ➞ True
        System.out.println(isSorted(new int[]{1, 2, 3, 4, 5, 6, 7})); // ➞ True
        System.out.println(isSorted(new int[]{1, 3, 2, 4, 5, 6, 7})); // ➞ False
        System.out.println(isSorted(new int[]{1, 2, 2, 3, 3, 4})); // ➞ True
        System.out.println(isSorted(new int[]{1, 2, 2, 2, 3, 4})); // ➞ False
    }
}
// End of Code

// The Java code above does the same thing as the Python code. It checks if the list is sorted in ascending order and if it contains more than two duplicates of the same number. If either condition is not met, it returns false. Otherwise, it returns true. It uses a HashMap to keep track of the count of each number in the list. It also clones the original list, sorts it, and compares it with the original list to check if it is sorted.
