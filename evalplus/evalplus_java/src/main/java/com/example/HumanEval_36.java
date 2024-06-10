package com.example;
public class HumanEval_36 {
    public static int fizzBuzz(int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                String str = Integer.toString(i);
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '7') {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(50));  // should return 0
        System.out.println(fizzBuzz(78));  // should return 2
        System.out.println(fizzBuzz(79));  // should return 3
    }
}
// End of Code
