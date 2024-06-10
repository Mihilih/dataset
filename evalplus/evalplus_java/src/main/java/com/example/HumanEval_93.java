package com.example;
public class HumanEval_93 {
    public static void main(String[] args) {
        System.out.println(encode("test"));
        System.out.println(encode("This is a message"));
    }
    
    public static String encode(String message) {
        char[] messageChars = message.toCharArray();
        for (int i = 0; i < messageChars.length; i++) {
            char ch = messageChars[i];
            if (Character.isUpperCase(ch)) {
                messageChars[i] = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)){
                messageChars[i] = Character.toUpperCase(ch);
            }
            
            if (isVowel(messageChars[i])) {
                messageChars[i] = (char) (messageChars[i] + 2);
            }
        }
        return new String(messageChars);
    }
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
// End of Code
