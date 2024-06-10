package com.example;
//Here's how you could write the same functionality in Java:


public class HumanEval_154 {
    public static boolean cycpattern_check(String a, String b) {
        if (a.equals(b)) {
            return true;
        }
        if (b.equals("")) {
            return true;
        }
        for (int i = 0; i < b.length(); i++) {
            String rotated = b.substring(i) + b.substring(0, i);
            if (a.contains(rotated)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(cycpattern_check("abcd","abd")); // False
        System.out.println(cycpattern_check("hello","ell")); // True
        System.out.println(cycpattern_check("whassup","psus")); // False
        System.out.println(cycpattern_check("abab","baa")); // True
        System.out.println(cycpattern_check("efef","eeff")); // False
        System.out.println(cycpattern_check("himenss","simen")); // True
    }
}

//End of Code
