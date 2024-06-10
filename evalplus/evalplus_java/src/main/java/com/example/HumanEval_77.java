package com.example;
public class HumanEval_77 {
    
    public static boolean isCube(int a) {
        a = Math.abs(a);
        return Math.pow(Math.round(Math.pow(a, 1.0/3.0)), 3) == a;
    }
    
    public static void main(String[] args) {
        System.out.println(isCube(1));   // True
        System.out.println(isCube(2));   // False
        System.out.println(isCube(-1));  // True
        System.out.println(isCube(64));  // True
        System.out.println(isCube(0));   // True
        System.out.println(isCube(180)); // False
    }
}

// End of Code
