package com.example;
public class HumanEval_107 {

    public static void main(String[] args) {
        int n = 12;
        int[] result = evenOddPalindrome(n);
        System.out.println(result[0] + ", " + result[1]);
    }

    public static int[] evenOddPalindrome(int n) {
        int oddCount = 0, evenCount = 0;
        for (int i = 1; i <= n; i++) {
            if (isPalindromic(i)) {
                if (i % 2 == 1) {
                    oddCount++;
                } else {
                    evenCount++;
                }
            }
        }
        return new int[] {evenCount, oddCount};
    }

    public static boolean isPalindromic(int num) {
        String strNum = Integer.toString(num);
        StringBuilder reverseStrNum = new StringBuilder(strNum).reverse();
        return strNum.equals(reverseStrNum.toString());
    }
}
// End of Code
