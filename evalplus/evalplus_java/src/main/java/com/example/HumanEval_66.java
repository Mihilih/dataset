package com.example;
public class HumanEval_66 {
    public static void main(String[] args) {
        System.out.println(digitSum(""));
        System.out.println(digitSum("abAB"));
        System.out.println(digitSum("abcCd"));
        System.out.println(digitSum("helloE"));
        System.out.println(digitSum("woArBld"));
        System.out.println(digitSum("aAaaaXa"));
    }

    public static int digitSum(String s) {
        int sum = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sum += (int) ch;
            }
        }
        return sum;
    }
}
// End of Code
