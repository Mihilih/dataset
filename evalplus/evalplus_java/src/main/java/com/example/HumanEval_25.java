package com.example;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_25 {
    public static List<Integer> factorize(int n) {
        List<Integer> fact = new ArrayList<>();
        int i = 2;
        while (i <= Math.sqrt(n) + 1) {
            if (n % i == 0) {
                fact.add(i);
                n /= i;
            } else {
                i += 1;
            }
        }
        if (n > 1) {
            fact.add(n);
        }
        return fact;
    }
}
// End of Code
