package com.example;
public class HumanEval_89 {
    public static String encrypt(String s) {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                encrypted.append((char) ((ch - base + 4) % 26 + base));
            } else {
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }

    public static void main(String[] args) {
        System.out.println(encrypt("hi"));  // prints "lm"
        System.out.println(encrypt("asdfghjkl"));  // prints "ewhjklnop"
        System.out.println(encrypt("gf"));  // prints "kj"
        System.out.println(encrypt("et"));  // prints "ix"
    }
}
// End of Code
