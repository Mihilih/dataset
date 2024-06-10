package com.example;
// Here is the equivalent Java code:


import java.util.ArrayList;
import java.util.List;

public class HumanEval_113 {

    public static List<String> oddCount(List<String> lst) {
        List<String> ans = new ArrayList<>();
        String template = "the number of odd elements in the string i of the input.";
        for (String s : lst) {
            int oddCount = (int) s.chars().filter(ch -> Character.getNumericValue(ch) % 2 == 1).count();
            ans.add(template.replace("i", String.valueOf(oddCount)));
        }
        return ans;
    }

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("1234567");
        System.out.println(oddCount(lst));
        lst.clear();
        lst.add("3");
        lst.add("11111111");
        System.out.println(oddCount(lst));
    }
}


// End of Code.
