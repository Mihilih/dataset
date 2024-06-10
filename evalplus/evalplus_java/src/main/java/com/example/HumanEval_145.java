package com.example;
//Here is the Java equivalent for the Python function:


import java.util.Arrays;
import java.util.Comparator;

public class HumanEval_145 {
    public static Integer[] orderByPoints(Integer[] nums) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int weight1 = weight(o1);
                int weight2 = weight(o2);
                return Integer.compare(weight1, weight2);
            }
        };
        Arrays.sort(nums, comparator);
        return nums;
    }

    private static int weight(int x) {
        String xStr = Integer.toString(x);
        int sum = 0;
        for (char ch : xStr.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return x < 0 ? -sum : sum;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 11, -1, -11, -12};
        System.out.println(Arrays.toString(orderByPoints(nums)));
    }
}

// End of Code
