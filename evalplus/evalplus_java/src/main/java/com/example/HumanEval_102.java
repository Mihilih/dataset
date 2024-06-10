package com.example;
public class HumanEval_102 {
    public static int choose_num(int x, int y) {
        if (x > y) return -1;
        if (x == y) return y % 2 == 0 ? y : -1;
        return y % 2 == 0 ? y : y - 1;
    }

    public static void main(String[] args) {
        System.out.println(choose_num(12, 15));  // 14
        System.out.println(choose_num(13, 12));  // -1
    }
}
//End of Code
