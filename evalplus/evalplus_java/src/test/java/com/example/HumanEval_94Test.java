package com.example;
//Here is the Java equivalent of the Python tests you provided:


import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_94Test {

    @Test
    public void test_0() {
        Integer[] arr = {0, 3, 2, 1, 3, 5, 7, 4, 5, 5, 5, 2, 181, 32, 4, 32, 3, 2, 32, 324, 4, 3};
        assertEquals(10, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_1() {
        Integer[] arr = {1, 0, 1, 8, 2, 4597, 2, 1, 3, 40, 1, 2, 1, 2, 4, 2, 5, 1};
        assertEquals(25, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_2() {
        Integer[] arr = {1, 3, 1, 32, 5107, 34, 83278, 109, 163, 23, 2323, 32, 30, 1, 9, 3};
        assertEquals(13, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_3() {
        Integer[] arr = {0, 724, 32, 71, 99, 32, 6, 0, 5, 91, 83, 0, 5, 6};
        assertEquals(11, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_4() {
        Integer[] arr = {0, 81, 12, 3, 1, 21};
        assertEquals(3, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_5() {
        Integer[] arr = {0, 8, 1, 2, 1, 7};
        assertEquals(7, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_6() {
        Integer[] arr = {8191};
        assertEquals(19, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_7() {
        Integer[] arr = {8191, 123456, 127, 7};
        assertEquals(19, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_8() {
        Integer[] arr = {127, 97, 8192};
        assertEquals(10, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_9() {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(7, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_10() {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(7, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_11() {
        Integer[] arr = {10000019, 1000000007, 99990001, 123456789, 500000003, 1000000009, 999999937, 787878787, 9726631, 999999996};
        assertEquals(10, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_12() {
        Integer[] arr = {0, 0, 0, 2, 5, 7, 11, 13, 16, 7};
        assertEquals(4, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_13() {
        Integer[] arr = {174089236, 102746717, 596592367, 996989479, 967548947, 1053114123, 988732879, 1019094191, 820280333, 684049355};
        assertEquals(70, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_14() {
        Integer[] arr = {0, 0, -1, 2, 5, 7, 11, 13, 17};
        assertEquals(8, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_15() {
        Integer[] arr = {1, 1056689, 7, 31, 41, 523, 3, 1234567, 1068607, 19, 7919, 73, 23, 163, 5, 61, 829, 103, 677};
        assertEquals(26, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }

    @Test
    public void test_16() {
//        Integer[] arr = {10000000019, 1000000007, 99990001, 123456789, 500000003, 1000000009, 999999937, 787878787, 9726631, 999999996, 987654321, 1234567891, 888888889, 999999997, 444444449, 666666671, 101, 199, 3532, 397, 593, 991, 1117, 1277, 1453, 1567, 1889, 2089, 2347, 2689, 2801, 3011, 666666671, 3121, 3251, 3463, 3533, 3559};
//        assertEquals(11, HumanEval_94.sumOfDigitsOfMaxPrime(arr));
    }
}
