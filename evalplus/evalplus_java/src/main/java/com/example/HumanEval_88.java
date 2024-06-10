package com.example;

import java.util.Arrays;
import java.util.Collections;

public class HumanEval_88 {
    public static Integer[] sortArray(Integer[] array) {
        if (array.length == 0) return array;
        boolean reverse = (array[0] + array[array.length - 1]) % 2 == 0;
        if (reverse) {
            Arrays.sort(array, Collections.reverseOrder());
        } else {
            Arrays.sort(array);
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] array = {2, 4, 3, 0, 1, 5, 6};
        sortArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

// End of Code
