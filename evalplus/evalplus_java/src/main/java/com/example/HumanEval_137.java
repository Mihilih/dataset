package com.example;
public class HumanEval_137 {

    public static Object compare_one(Object a, Object b) {
        Double num_a = Double.parseDouble(a.toString().replace(",", "."));
        Double num_b = Double.parseDouble(b.toString().replace(",", "."));
        if (num_a.equals(num_b)) {
            return null;
        }
        return num_a > num_b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(compare_one(1, 2.5));
        System.out.println(compare_one(1, "2,3"));
        System.out.println(compare_one("5,1", "6"));
        System.out.println(compare_one("1", 1));
    }
}
// End of Code
