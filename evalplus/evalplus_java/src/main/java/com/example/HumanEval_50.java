package com.example;
public class HumanEval_50 {

    public static String encodeShift(String s) {
        String result = "";
        for (char ch : s.toCharArray()) {
            char shiftedChar = (char) (((ch - 'a' + 5) % 26) + 'a');
            result += shiftedChar;
        }
        return result;
    }

    public static String decodeShift(String s) {
        String result = "";
        for (char ch : s.toCharArray()) {
            char shiftedChar = (char) (((ch - 'a' - 5 + 26) % 26) + 'a');
            result += shiftedChar;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "hello";
        String encoded = encodeShift(s);
        System.out.println(encoded);
        String decoded = decodeShift(encoded);
        System.out.println(decoded);
    }
}

// End of Code
