package com.example;
public class HumanEval_69 {
    public static int search(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        int ans = -1;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() >= entry.getKey()) {
                ans = Math.max(ans, entry.getKey());
            }
        }
        return ans;
    }
}
// End of Code
