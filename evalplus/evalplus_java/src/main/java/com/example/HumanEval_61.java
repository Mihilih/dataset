package com.example;
public class HumanEval_61 {

    public static boolean correctBracketing(String brackets) {
        int cnt = 0;
        for(int i = 0; i < brackets.length(); i++) {
            if(brackets.charAt(i) == '(') cnt += 1;
            if(brackets.charAt(i) == ')') cnt -= 1;
            if(cnt < 0) return false;
        }
        return cnt == 0;
    }

    public static void main(String[] args) {
        System.out.println(correctBracketing("(")); // should print false
        System.out.println(correctBracketing("()")); // should print true
        System.out.println(correctBracketing("(()())")); // should print true
        System.out.println(correctBracketing(")(()")); // should print false
    }
}
// End of Code
