package com.example;
//Here is the Java equivalent of the Python function you provided:


import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;

public class HumanEval_162 {
    public static void main(String[] args) {
        System.out.println(stringToMd5("Hello world"));
    }

    public static String stringToMd5(String text) {
        if (text.isEmpty()) {
            return null;
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashInBytes = md.digest(text.getBytes(StandardCharsets.UTF_8));

            // Convert the bytes to hexadecimal
            BigInteger number = new BigInteger(1, hashInBytes);
            StringBuilder hexString = new StringBuilder(number.toString(16));

            // Pad with leading zeros
            while (hexString.length() < 32) {
                hexString.insert(0, '0');
            }

            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

//End of Code
