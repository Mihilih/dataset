package com.example;
public class HumanEval_121 {
    public static int solution(int[] lst) {
        int sum = 0;
        for (int i = 0; i < lst.length; i++) {
            if (i % 2 == 0 && lst[i] % 2 == 1) {
                sum += lst[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] lst = {5, 8, 7, 1};
        System.out.println(solution(lst));
    }
}
//End of Code
