package com.example;
//Here is the Java equivalent of the Python code you provided:


import java.util.Arrays;
import java.util.Collections;

public class HumanEval_94 {
    public static void main(String[] args) {
        Integer[] arr = {0,3,2,1,3,5,7,4,5,5,5,2,181,32,4,32,3,2,32,324,4,3};
        System.out.println(sumOfDigitsOfMaxPrime(arr));
    }

    public static int sumOfDigitsOfMaxPrime(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        for (int num : arr) {
            if (isPrime(num)) {
                return sumOfDigits(num);
            }
        }
        return -1;
    }

    public static boolean isPrime(int num) {
        if (num < 2) 
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
                return false;
        }
        return true;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

//End of Code.
