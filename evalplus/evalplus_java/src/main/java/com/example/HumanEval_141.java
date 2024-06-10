package com.example;
public class HumanEval_141 {
    public static String file_name_check(String file_name) {
        int digitCount = 0;
        for (char ch : file_name.toCharArray()) {
            if (Character.isDigit(ch)) digitCount++;
        }
        if (digitCount > 3) return "No";
        String[] f_list = file_name.split("\\.");
        if (f_list.length != 2) return "No";
        if (f_list[0].length() == 0) return "No";
        if (!Character.isLetter(f_list[0].charAt(0))) return "No";
        if (!f_list[1].equals("txt") && !f_list[1].equals("exe") && !f_list[1].equals("dll")) return "No";
        return "Yes";
    }
}
// End of Code
