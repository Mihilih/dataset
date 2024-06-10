package com.example;
// Here is the Java equivalent of your Python code:


import java.util.Arrays;

public class HumanEval_114 {

    public static int minSubArraySum(int[] nums) {
        int sum = 0, answer = Integer.MAX_VALUE;
        boolean allPositive = Arrays.stream(nums).allMatch(n -> n >= 0);

        if (allPositive) {
            return Arrays.stream(nums).min().getAsInt();
        }

        for (int num : nums) {
            sum += num;
            answer = Math.min(answer, sum);
            if (sum >= 0) {
                sum = 0;
            }
        }
        return answer;
    }
}

// End of Code.
