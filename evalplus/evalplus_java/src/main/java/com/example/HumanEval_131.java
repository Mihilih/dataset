package com.example;

public class HumanEval_131 {

    public static int digits(int n) {
        boolean hasOdd = false;
        int prod = 1;
        String num = Integer.toString(n);
        
        for (char ch : num.toCharArray()) {
            int digit = Character.getNumericValue(ch);
            if (digit % 2 == 1) {
                hasOdd = true;
                prod *= digit;
            }
        }
        return hasOdd ? prod : 0;
    }

    public static void main(String[] args) {
        System.out.println(digits(1));   // Outputs 1
        System.out.println(digits(4));   // Outputs 0
        System.out.println(digits(235)); // Outputs 15
    }
}
// End of Code

//This Java code does the same thing as the Python function. It takes an integer, converts it to a string, and iterates over each character (digit). If the digit is odd, it multiplies the current product by that digit. If there are no odd digits, it returns 0.
