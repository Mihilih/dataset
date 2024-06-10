package com.example;
public class HumanEval_163 {

    public static int[] generateIntegers(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        int[] result = new int[Math.min(b + 1, 10) - a];
        int index = 0;
        
        for (int i = a; i < Math.min(b + 1, 10); i++) {
            if (i % 2 == 0) {
                result[index] = i;
                index++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] result = generateIntegers(2, 8);
        for (int num : result) {
            System.out.println(num);
        }
    }
}
// End of Code
