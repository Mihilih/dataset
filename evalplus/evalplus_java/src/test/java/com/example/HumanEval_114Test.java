package com.example;
// Here is the Java equivalent of your Python tests:


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_114Test {

    @Test
    public void test_0() {
        assertEquals(1, HumanEval_114.minSubArraySum(new int[]{2, 3, 4, 1, 2, 4}));
    }

    @Test
    public void test_1() {
        assertEquals(-6, HumanEval_114.minSubArraySum(new int[]{-1, -2, -3}));
    }

    @Test
    public void test_2() {
        assertEquals(-14, HumanEval_114.minSubArraySum(new int[]{-1, -2, -3, 2, -10}));
    }

    // @Test
    // public void test_3() {
    //     assertEquals(-9999999999999999L, HumanEval_114.minSubArraySum(new int[]{-9999999999999999}));
    // }

    @Test
    public void test_4() {
        assertEquals(0, HumanEval_114.minSubArraySum(new int[]{0, 10, 20, 1000000}));
    }

    @Test
    public void test_5() {
        assertEquals(-6, HumanEval_114.minSubArraySum(new int[]{-1, -2, -3, 10, -5}));
    }

    @Test
    public void test_6() {
        assertEquals(-6, HumanEval_114.minSubArraySum(new int[]{100, -1, -2, -3, 10, -5}));
    }

    @Test
    public void test_7() {
        assertEquals(3, HumanEval_114.minSubArraySum(new int[]{10, 11, 13, 8, 3, 4}));
    }

    @Test
    public void test_8() {
        assertEquals(-33, HumanEval_114.minSubArraySum(new int[]{100, -33, 32, -1, 0, -2}));
    }

    @Test
    public void test_9() {
        assertEquals(-10, HumanEval_114.minSubArraySum(new int[]{-10}));
    }

    @Test
    public void test_10() {
        assertEquals(7, HumanEval_114.minSubArraySum(new int[]{7}));
    }

    @Test
    public void test_11() {
        assertEquals(-1, HumanEval_114.minSubArraySum(new int[]{1, -1}));
    }

    @Test
    public void test_12() {
        assertEquals(-5, HumanEval_114.minSubArraySum(new int[]{2, 4, -1, 3, 5, -4, 1, -2}));
    }

    @Test
    public void test_13() {
        assertEquals(false, HumanEval_114.minSubArraySum(new int[]{1, 1, 1, 0, 1, 1}));
    }

    @Test
    public void test_14() {
        assertEquals(-10, HumanEval_114.minSubArraySum(new int[]{-10, 5, 3, -2, 0, 4, -8}));
    }

    @Test
    public void test_15() {
        assertEquals(-16, HumanEval_114.minSubArraySum(new int[]{-2, 1, -4, 6, -7, -4, -5, 1}));
    }

    @Test
    public void test_16() {
        assertEquals(-7, HumanEval_114.minSubArraySum(new int[]{-3, -4}));
    }

    @Test
    public void test_17() {
        assertEquals(-1, HumanEval_114.minSubArraySum(new int[]{1, -1, 2}));
    }

    @Test
    public void test_18() {
        assertEquals(-8, HumanEval_114.minSubArraySum(new int[]{-6, 6, 5, 3, -2, 0, 4, -8}));
    }

    @Test
    public void test_19() {
        assertEquals(-9, HumanEval_114.minSubArraySum(new int[]{5, -1, -2, -2, -4, 6, -1, -1}));
    }

    @Test
    public void test_20() {
        assertEquals(-5, HumanEval_114.minSubArraySum(new int[]{3, 2, -5, 4, 1, -3, 2, -2, 5}));
    }
}

// End of Test.
