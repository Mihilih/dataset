package com.example;
public class HumanEval_142 {
    public static int sumSquares(int[] lst) {
        int ans = 0;
        for (int i = 0; i < lst.length; i++) {
            if (i % 3 == 0) {
                ans += Math.pow(lst[i], 2);
            } else if (i % 4 == 0) {
                ans += Math.pow(lst[i], 3);
            } else {
                ans += lst[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] lst1 = {1,2,3};
        int[] lst2 = {};
        int[] lst3 = {-1,-5,2,-1,-5};

        System.out.println(sumSquares(lst1));  // it should print 6
        System.out.println(sumSquares(lst2));  // it should print 0
        System.out.println(sumSquares(lst3));  // it should print -126
    }
}
// End of Code
