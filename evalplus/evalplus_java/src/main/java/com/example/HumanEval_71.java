package com.example;
public class HumanEval_71 {

    public static double triangleArea(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) return -1;
        double p = (a + b + c) / 2;
        return Math.round((Math.sqrt(p * (p - a) * (p - b) * (p - c))) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println(triangleArea(3, 4, 5));
        System.out.println(triangleArea(1, 2, 10));
    }
}
// End of Code
