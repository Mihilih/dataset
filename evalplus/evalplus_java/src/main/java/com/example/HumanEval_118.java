package com.example;
public class HumanEval_118 {

    public static String getClosestVowel(String word) {
        for (int i = word.length() - 2; i > 0; i--) {
            if (isVowel(word.charAt(i)) && !isVowel(word.charAt(i-1)) && !isVowel(word.charAt(i+1))) {
                return String.valueOf(word.charAt(i));
            }
        }
        return "";
    }

    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        System.out.println(getClosestVowel("yogurt"));  // Output: "u"
        System.out.println(getClosestVowel("FULL"));    // Output: "U"
        System.out.println(getClosestVowel("quick"));   // Output: ""
        System.out.println(getClosestVowel("ab"));      // Output: ""
    }
}
// End of Code
