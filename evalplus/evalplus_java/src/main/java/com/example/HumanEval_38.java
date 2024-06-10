package com.example;

import java.util.ArrayList;
import java.util.List;

public class HumanEval_38 {

    public static String encodeCyclic(String s) {
        List<String> groups = new ArrayList<>();
        for(int i = 0; i < (s.length() + 2) / 3; i++) {
            groups.add(s.substring(3 * i, Math.min((3 * i + 3), s.length())));
        }
        for(int i = 0; i < groups.size(); i++) {
            String group = groups.get(i);
            if(group.length() == 3) {
                groups.set(i, group.substring(1) + group.charAt(0));
            }
        }
        return String.join("", groups);
    }

    public static String decodeCyclic(String s) {
        List<String> groups = new ArrayList<>();
        for(int i = 0; i < (s.length() + 2) / 3; i++) {
            groups.add(s.substring(3 * i, Math.min((3 * i + 3), s.length())));
        }
        for(int i = 0; i < groups.size(); i++) {
            String group = groups.get(i);
            if(group.length() == 3) {
                groups.set(i, group.charAt(2) + group.substring(0, 2));
            }
        }
        return String.join("", groups);
    }

}
// End of Code


