package com.example;
public class HumanEval_148 {
    public static String[] bf(String planet1, String planet2) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        int i1 = -1, i2 = -1;
        for (int i = 0; i < planets.length; i++) {
            if (planets[i].equals(planet1)) i1 = i;
            if (planets[i].equals(planet2)) i2 = i;
        }
        if (i1 == -1 || i2 == -1) return new String[0];
        if (i1 > i2) {
            int temp = i1;
            i1 = i2;
            i2 = temp;
        }
        String[] result = new String[i2 - i1 - 1];
        System.arraycopy(planets, i1 + 1, result, 0, i2 - i1 - 1);
        return result;
    }
}
//End of Code
