package com.example;
public class HumanEval_2 {
    
    public static double truncateNumber(double number) {
        // Calculate and return the decimal part of the number
        return number - (int) number;
    }

    public static void main(String[] args) {
        System.out.println(truncateNumber(3.5));
    }
}
// End of Code
