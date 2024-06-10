package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class HumanEval_70 {
    public List<Integer> strange_sort_list(List<Integer> lst) {
        Collections.sort(lst);
        List<Integer> ans = new ArrayList<>();
        int i = 0, j = lst.size() - 1;
        while (i < j) {
            ans.add(lst.get(i));
            ans.add(lst.get(j));
            i++;
            j--;
        }
        if (i == j) ans.add(lst.get(i));
        return ans;
    }
}
//End of Code

//This java code does the same as the Python code above. It sorts the list, then proceeds to add the smallest and largest remaining values alternately. If the list has an odd number of elements, the middle value will be added last.
