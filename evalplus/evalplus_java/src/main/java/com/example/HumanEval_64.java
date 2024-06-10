package com.example;
//Here is the Java version of the Python code:


public class HumanEval_64 {

    public static int vowelsCount(String s) {
        if (s.equals("")) return 0;
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                cnt++;
            }
        }
        if (s.charAt(s.length() - 1) == 'y' || s.charAt(s.length() - 1) == 'Y') {
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(vowelsCount("abcde"));  // Outputs 2
        System.out.println(vowelsCount("ACEDY"));  // Outputs 3
    }
}

// End of Code
