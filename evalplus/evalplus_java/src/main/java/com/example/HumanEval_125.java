package com.example;
public class HumanEval_125 {
    public static Object splitWords(String txt) {
        String[] whitespace = {" ", "\n", "\r", "\t"};
        for (String ws : whitespace) {
            if (txt.contains(ws)) {
                return txt.split("\\s+");
            }
        }
        if (txt.contains(",")) {
            return txt.split(",");
        }
        int cnt = 0;
        for (char ch : txt.toCharArray()) {
            if (Character.isLowerCase(ch) && (ch - 'a') % 2 == 1) {
                cnt++;
            }
        }
        return cnt;
    }
}
//End of Code
