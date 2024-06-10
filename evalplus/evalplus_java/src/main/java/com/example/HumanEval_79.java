package com.example;
public class HumanEval_79 {

    public static String decimalToBinary(int decimal) {
        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);
        
        // Add 'db' at the beginning and end of the string
        binary = "db" + binary + "db";
        
        return binary;
    }

    public static void main(String args[]) {
        System.out.println(decimalToBinary(15));   // prints "db1111db"
        System.out.println(decimalToBinary(32));   // prints "db100000db"
    }
}

// End of Code
