package com.example;
//Here is the Java equivalent of your Python code:


public class HumanEval_156 {

    public static String intToMiniRoman(int number) {
        String[] m = { "", "m" };
        String[] c = { "", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", "cm" };
        String[] x = { "", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc" };
        String[] i = { "", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix" };
        String thousands = m[number / 1000];
        String hundreds = c[(number % 1000) / 100];
        String tens = x[(number % 100) / 10];
        String ones = i[number % 10];
        return thousands + hundreds + tens + ones;
    }
}

// End of Code
