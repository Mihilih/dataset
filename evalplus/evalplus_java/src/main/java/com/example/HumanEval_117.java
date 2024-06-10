package com.example;

public class HumanEval_117 {

    public static List<String> selectWords(String s, int n) {
        List<String> ans = new ArrayList<>();
        for (String word : s.split(" ")) {
            if (!word.isEmpty()) {
                long c_cnt = word.chars().filter(ch -> "aeiouAEIOU".indexOf(ch) == -1).count();
                if (c_cnt == n) ans.add(word);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(selectWords("Mary had a little lamb", 4));
        System.out.println(selectWords("Mary had a little lamb", 3));
        System.out.println(selectWords("simple white space", 2));
        System.out.println(selectWords("Hello world", 4));
        System.out.println(selectWords("Uncle sam", 3));
    }
}
// End of Code
