package com.example;

import java.util.ArrayList;

public class HumanEval_96 {

    public static ArrayList<Integer> countUpTo(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] isprime = new boolean[n+1];

        for (int i = 0; i < n; i++) {
            isprime[i] = true;
        }

        for (int i = 2; i < n; i++) {
            if(isprime[i]) {
                ans.add(i);
                for (int j = i+i; j < n; j += i) {
                    isprime[j] = false;
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
       System.out.println(countUpTo(5));  // [2, 3]
       System.out.println(countUpTo(11)); // [2, 3, 5, 7]
       System.out.println(countUpTo(0));  // []
       System.out.println(countUpTo(20)); // [2, 3, 5, 7, 11, 13, 17, 19]
       System.out.println(countUpTo(1));  // []
       System.out.println(countUpTo(18)); // [2, 3, 5, 7, 11, 13, 17]
    }
}
// End of Code
