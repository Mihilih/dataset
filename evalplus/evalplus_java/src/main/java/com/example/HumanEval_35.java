package com.example;
public class HumanEval_35 {
    public static double maxElement(double[] list) {
        double max = list[0];
        for(int i=1; i<list.length; i++){
            if(list[i] > max){
                max = list[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[] list1 = {1, 2, 3};
        System.out.println(maxElement(list1)); // prints 3.0

        double[] list2 = {5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10};
        System.out.println(maxElement(list2)); // prints 123.0
    }
} // End of Code
