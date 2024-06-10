package com.example;
public class HumanEval_42 {
    public static int[] incr_list(int[] l) {
        for (int i = 0; i < l.length; i++) {
            l[i] = l[i] + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] result1 = incr_list(array1);
        for (int num : result1) {
            System.out.print(num + " ");
        }

        System.out.println();
        
        int[] array2 = {5, 3, 5, 2, 3, 3, 9, 0, 123};
        int[] result2 = incr_list(array2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}
// End of Code
