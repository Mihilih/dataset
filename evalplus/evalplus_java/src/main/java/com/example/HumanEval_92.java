package com.example;
public class HumanEval_92 {
    public static boolean anyInt(int x, int y, int z) {
        return (x == y + z) || (y == x + z) || (z == y + x);
    }

    public static void main(String[] args) {
        System.out.println(anyInt(5, 2, 7)); // True
        System.out.println(anyInt(3, 2, 2)); // False
        System.out.println(anyInt(3, -2, 1)); // True
    }
}
// End of Code
