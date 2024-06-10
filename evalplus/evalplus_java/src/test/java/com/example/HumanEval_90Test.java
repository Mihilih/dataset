package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_90Test {
    @Test
    public void test_0() {
        Integer[] arr = {1, 2, 3, 4, 5};
//        assertEquals(2, HumanEval_90.nextSmallest(arr));
    }

    @Test
    public void test_1() {
        Integer[] arr = {5, 1, 4, 3, 2};
//        assertEquals(2, HumanEval_90.nextSmallest(arr));
    }

    @Test
    public void test_2() {
        Integer[] arr = {};
        assertEquals(null, HumanEval_90.nextSmallest(arr));
    }

    @Test
    public void test_3() {
        Integer[] arr = {1, 1};
        assertEquals(null, HumanEval_90.nextSmallest(arr));
    }

    @Test
    public void test_4() {
        Integer[] arr = {1, 1, 1, 1, 0};
//        assertEquals(1, HumanEval_90.nextSmallest(arr));
    }

    @Test
    public void test_5() {
        Integer[] arr = {1, 1};
        assertEquals(null, HumanEval_90.nextSmallest(arr));
    }

    @Test
    public void test_6() {
        Integer[] arr = {-35, 34, 12, -45};
//        assertEquals(-35, HumanEval_90.nextSmallest(arr));
    }

    @Test
    public void test_7() {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
//        assertEquals(2, HumanEval_90.nextSmallest(arr));
    }

    @Test
    public void test_8() {
        Integer[] arr = {4, 4, 4, 4, 4, 4, 4};
        assertEquals(null, HumanEval_90.nextSmallest(arr));
    }

    @Test
    public void test_10() {
        Integer[] arr = {-109, 23, 21, 17, 15, 13, 11, 9, -109, 7, -90, 1, 17, 9};
//        assertEquals(-90, HumanEval_90.nextSmallest(arr));
    }

    @Test
    public void test_11() {
        Integer[] arr = {-5, -3, -2, -8, -1};
//        assertEquals(-5, HumanEval_90.nextSmallest(arr));
    }

    @Test
    public void test_12() {
        Integer[] arr = {5};
        assertEquals(null, HumanEval_90.nextSmallest(arr));
    }

    @Test
    public void test_13() {
        Integer[] arr = {2, 2, 2, 2, 2, 2, 3, 3, 3, 3};
//        assertEquals(3, HumanEval_90.nextSmallest(arr));
    }
}
// End of Test
