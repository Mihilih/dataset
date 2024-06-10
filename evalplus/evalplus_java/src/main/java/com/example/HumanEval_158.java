package com.example;
public class HumanEval_158 {
    public static String find_max(String[] words) {
        int mx_ch_cnt = 0;
        String ans = "";

        for (String word : words) {
            int ch_cnt = (int) word.chars().distinct().count();
            if (ch_cnt > mx_ch_cnt || (ch_cnt == mx_ch_cnt && word.compareTo(ans) < 0)) {
                mx_ch_cnt = ch_cnt;
                ans = word;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] words1 = {"name", "of", "string"};
        String[] words2 = {"name", "enam", "game"};
        String[] words3 = {"aaaaaaa", "bb", "cc"};

        System.out.println(find_max(words1)); // Expected: "string"
        System.out.println(find_max(words2)); // Expected: "enam"
        System.out.println(find_max(words3)); // Expected: "aaaaaaa"
    }
} // End of Code
