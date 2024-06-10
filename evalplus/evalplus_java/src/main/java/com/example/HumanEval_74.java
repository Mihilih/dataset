package com.example;
public class HumanEval_74 {
    public static String[] total_match(String[] lst1, String[] lst2) {
        int c1 = 0, c2 = 0;
        for(String s : lst1) c1 += s.length();
        for(String s : lst2) c2 += s.length();
        return c1 <= c2 ? lst1 : lst2;
    }

    public static void main(String[] args) {
        //Test cases
        String[] a = {"hi", "admin"};
        String[] b = {"hI", "Hi"};
        String[] c = total_match(a, b);
        for(String s : c) System.out.println(s);
    }
}
//End of Code
