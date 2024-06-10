package com.example;
// Here is the equivalent Java code for the given Python function:


public class HumanEval_124 {
    public static boolean validDate(String date) {
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (date.length() != 10) return false;
        if (date.charAt(2) != '-' || date.charAt(5) != '-') return false;
        String m = date.substring(0, 2), d = date.substring(3, 5), y = date.substring(6);
        if (!m.chars().allMatch(Character::isDigit) || !d.chars().allMatch(Character::isDigit) || !y.chars().allMatch(Character::isDigit)) return false;
        int month = Integer.parseInt(m), day = Integer.parseInt(d);
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > days[month - 1]) return false;
        return true;
    }
}

// End of Code
