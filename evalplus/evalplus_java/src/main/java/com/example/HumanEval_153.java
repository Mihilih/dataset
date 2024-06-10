package com.example;
public class HumanEval_153 {
    public static String strongestExtension(String className, String[] extensions) {
        int maxStrength = Integer.MIN_VALUE;
        String strongestExtension = "";
        for (String extension : extensions) {
            int strength = calculateStrength(extension);
            if (strength > maxStrength) {
                maxStrength = strength;
                strongestExtension = extension;
            }
        }
        return className + "." + strongestExtension;
    }

    private static int calculateStrength(String extension) {
        int CAP = 0, SM = 0;
        for (char ch : extension.toCharArray()) {
            if (Character.isUpperCase(ch)) CAP++;
            if (Character.isLowerCase(ch)) SM++;
        }
        return CAP - SM;
    }
}
// End of Code
