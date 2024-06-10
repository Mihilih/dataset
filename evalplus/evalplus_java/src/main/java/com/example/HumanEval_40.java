package com.example;
public class HumanEval_40 {
    public static boolean triples_sum_to_zero(int[] l) {
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l.length; j++) {
                for (int k = 0; k < l.length; k++) {
                    if (i != j && i != k && j != k && l[i] + l[j] + l[k] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list1 = {1, 3, 5, 0};
        int[] list2 = {1, 3, -2, 1};
        int[] list3 = {1, 2, 3, 7};
        int[] list4 = {2, 4, -5, 3, 9, 7};
        int[] list5 = {1};

        System.out.println(triples_sum_to_zero(list1)); // False
        System.out.println(triples_sum_to_zero(list2)); // True
        System.out.println(triples_sum_to_zero(list3)); // False
        System.out.println(triples_sum_to_zero(list4)); // True
        System.out.println(triples_sum_to_zero(list5)); // False
    }
} // End of Code
