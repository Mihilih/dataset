package com.example;
//Here is the Java version of the Python code:


public class HumanEval_132 {
    public static void main(String[] args) {
        System.out.println(isNested("[[]]"));
        System.out.println(isNested("[]]]]]]][[[[[]"));
        System.out.println(isNested("[][]"));
        System.out.println(isNested("[]"));
        System.out.println(isNested("[[][]]"));
        System.out.println(isNested("[[]][["));
    }

    public static boolean isNested(String string) {
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == ']') continue;
            int cnt = 0, maxNest = 0;
            for(int j = i; j < string.length(); j++) {
                if(string.charAt(j) == '[') {
                    cnt++;
                } else {
                    cnt--;
                }
                maxNest = Math.max(maxNest, cnt);
                if(cnt == 0) {
                    if(maxNest >= 2) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
}

// End of Code
