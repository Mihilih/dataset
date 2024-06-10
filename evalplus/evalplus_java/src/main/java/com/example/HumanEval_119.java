package com.example;
public class HumanEval_119 {
    public static void main(String[] args) {
        System.out.println(matchParens(new String[]{"()(", ")"})); // prints Yes
        System.out.println(matchParens(new String[]{")", ")"})); // prints No
    }

    static String matchParens(String[] lst) {
        if(validParens(lst[0] + lst[1]) || validParens(lst[1] + lst[0])) {
            return "Yes";
        } else {
            return "No";
        }
    }

    static boolean validParens(String s) {
        int cnt = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                cnt += 1;
            } else {
                cnt -= 1;
            }
            if(cnt < 0) {
                return false;
            }
        }
        return cnt == 0;
    }
}
