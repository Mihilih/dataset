package com.example;

public class HumanEval_72 {
    public static void main(String[] args) {
        System.out.println(willItFly(new int[]{1, 2}, 5)); // false
        System.out.println(willItFly(new int[]{3, 2, 3}, 1)); // false
        System.out.println(willItFly(new int[]{3, 2, 3}, 9)); // true
        System.out.println(willItFly(new int[]{3}, 5)); // true
    }

    public static boolean willItFly(int[] q, int w) {
        int sum = 0;
        for (int i = 0; i < q.length; i++) {
            sum += q[i];
        }

        if (sum > w) {
            return false;
        }

        for (int i = 0; i < q.length / 2; i++) {
            if (q[i] != q[q.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
// End of Code


//The `willItFly` method in Java implements the same logic as the `will_it_fly` function in Python. It first computes the sum of the elements in the array `q`, then checks if the sum is no more than `w`. If the sum exceeds `w`, it returns `false` immediately. If the sum does not exceed `w`, it then checks if the array `q` is a palindrome by comparing each element `q[i]` with its mirror element `q[q.length - 1 - i]`. If any pair of elements is not equal, it returns `false`. If all pairs of elements are equal, meaning `q` is a palindrome, it returns `true`.
