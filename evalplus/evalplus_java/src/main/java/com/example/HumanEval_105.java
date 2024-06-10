package com.example;

import java.util.*;

public class HumanEval_105 {
    public static List<String> byLength(int[] arr) {
        List<String> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= 1 && arr[i] <= 9) {
                switch (arr[i]) {
                  case 1:
                    result.add("One");
                    break;
                  case 2:
                    result.add("Two");
                    break;
                  case 3:
                    result.add("Three");
                    break;
                  case 4:
                    result.add("Four");
                    break;
                  case 5:
                    result.add("Five");
                    break;
                  case 6:
                    result.add("Six");
                    break;
                  case 7:
                    result.add("Seven");
                    break;
                  case 8:
                    result.add("Eight");
                    break;
                  case 9:
                    result.add("Nine");
                    break;
                }
            }
        }
        return result;
    }
}
 // End of Code


