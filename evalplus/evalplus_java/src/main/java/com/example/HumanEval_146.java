package com.example;
public class HumanEval_146 {
    public static int specialFilter(int[] nums) {
        int ans = 0;
        String[] odd = {"1", "3", "5", "7", "9"};
        for (int num : nums) {
            String strNum = Integer.toString(num);
            if (num > 10 && java.util.Arrays.asList(odd).contains(Character.toString(strNum.charAt(0))) && java.util.Arrays.asList(odd).contains(Character.toString(strNum.charAt(strNum.length() - 1)))) {
                ans += 1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {15, -73, 14, -15};
        int[] nums2 = {33, -2, -3, 45, 21, 109};
        System.out.println(specialFilter(nums1)); // Output: 1
        System.out.println(specialFilter(nums2)); // Output: 2
    }
}

// End of Code
