package com.example;
public class HumanEval_56 {

    public static boolean correct_bracketing(String brackets) {
        int cnt = 0;
        for (char x : brackets.toCharArray()) {
            if (x == '<') cnt += 1;
            if (x == '>') cnt -= 1;
            if (cnt < 0) return false;
        }
        return cnt == 0;
    }

    public static void main(String[] args) {
        System.out.println(correct_bracketing("<")); // False
        System.out.println(correct_bracketing("<>")); // True
        System.out.println(correct_bracketing("<<><>>")); // True
        System.out.println(correct_bracketing("><<>")); // False
    }
}
// End of Code
