package com.example;
public class HumanEval_97 {

    public static int multiply(int a, int b) {
        // Convert the integers to String to easily get the last digit
        String aString = Integer.toString(a);
        String bString = Integer.toString(b);

        // Get the last characters (digits) from the strings
        char aLastChar = aString.charAt(aString.length() - 1);
        char bLastChar = bString.charAt(bString.length() - 1);

        // Convert the characters back to integers
        int aLastDigit = Character.getNumericValue(aLastChar);
        int bLastDigit = Character.getNumericValue(bLastChar);

        // Return the product of the last digits
        return aLastDigit * bLastDigit;
    }

    public static void main(String[] args) {
        System.out.println(multiply(148, 412));  // Should print 16
        System.out.println(multiply(19, 28));  // Should print 72
        System.out.println(multiply(2020, 1851));  // Should print 0
        System.out.println(multiply(14,-15));  // Should print 20
    }
}
// End of Code
