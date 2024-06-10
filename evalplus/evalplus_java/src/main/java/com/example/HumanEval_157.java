package com.example;
public class HumanEval_157 {
    public static boolean rightAngleTriangle(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) 
            || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) 
            || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
    }
    
    public static void main(String[] args) {
        System.out.println(rightAngleTriangle(3, 4, 5)); // true
        System.out.println(rightAngleTriangle(1, 2, 3)); // false
    }
}
// End of Code
