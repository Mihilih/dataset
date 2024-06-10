package com.example;

import java.util.ArrayList;

public class HumanEval_87 {
    public ArrayList<Integer[]> getRow(ArrayList<ArrayList<Integer>> lst, int x) {
        ArrayList<Integer[]> res = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            for (int j = lst.get(i).size() - 1; j >= 0; j--) {
                if (lst.get(i).get(j) == x) {
                    Integer[] coords = {i, j};
                    res.add(coords);
                }
            }
        }
        return res;
    }
}
// End of Code
