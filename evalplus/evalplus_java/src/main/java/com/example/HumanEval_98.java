package com.example;
public class HumanEval_98 {

    public static int count_upper(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if ("AEIOU".contains(Character.toString(s.charAt(i)))) {
                cnt += 1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(count_upper("aBCdEf")); // returns 1
        System.out.println(count_upper("abcdefg")); // returns 0
        System.out.println(count_upper("dBBE")); // returns 0
    }
}
// End of Code
