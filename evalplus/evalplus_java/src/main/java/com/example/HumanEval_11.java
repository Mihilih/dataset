package com.example;
public class HumanEval_11 {

    public static String stringXor(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < a.length(); i++) {
            result.append(Character.getNumericValue(a.charAt(i)) ^ Character.getNumericValue(b.charAt(i)));
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(stringXor("010", "110")); // prints: 100
    }

}
// End of Code
