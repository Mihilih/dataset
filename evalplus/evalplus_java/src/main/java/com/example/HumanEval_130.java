package com.example;
//Here's the java code for your python function:


import java.util.ArrayList;
import java.util.List;

public class HumanEval_130 {
    public List<Double> tri(int n) {
        List<Double> ans = new ArrayList<>();
        if (n == 0) {
            ans.add(1.0);
            return ans;
        }
        if (n == 1) {
            ans.add(1.0);
            ans.add(3.0);
            return ans;
        }
        ans.add(1.0);
        ans.add(3.0);
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                ans.add(1.0 + i / 2.0);
            } else {
                ans.add(ans.get(ans.size() - 1) + ans.get(ans.size() - 2) + 1.0 + (i + 1) / 2.0);
            }
        }
        return ans;
    }
}

//End of Code.
