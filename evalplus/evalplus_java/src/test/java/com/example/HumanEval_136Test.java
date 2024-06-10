package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_136Test {

    @Test
    public void test_0() {
        assertArrayEquals(new Integer[]{null, 1}, HumanEval_136.largestSmallestIntegers(new int[]{2, 4, 1, 3, 5, 7}));
    }

    @Test
    public void test_1() {
        assertArrayEquals(new Integer[]{null, 1}, HumanEval_136.largestSmallestIntegers(new int[]{2, 4, 1, 3, 5, 7, 0}));
    }

    @Test
    public void test_2() {
        assertArrayEquals(new Integer[]{-2, 1}, HumanEval_136.largestSmallestIntegers(new int[]{1, 3, 2, 4, 5, 6, -2}));
    }

    @Test
    public void test_3() {
        assertArrayEquals(new Integer[]{-7, 2}, HumanEval_136.largestSmallestIntegers(new int[]{4, 5, 3, 6, 2, 7, -7}));
    }

    @Test
    public void test_4() {
        assertArrayEquals(new Integer[]{-9, 2}, HumanEval_136.largestSmallestIntegers(new int[]{7, 3, 8, 4, 9, 2, 5, -9}));
    }

    @Test
    public void test_5() {
        assertArrayEquals(new Integer[]{null, null}, HumanEval_136.largestSmallestIntegers(new int[]{}));
    }

    @Test
    public void test_6() {
        assertArrayEquals(new Integer[]{null, null}, HumanEval_136.largestSmallestIntegers(new int[]{0}));
    }

    @Test
    public void test_7() {
        assertArrayEquals(new Integer[]{-1, null}, HumanEval_136.largestSmallestIntegers(new int[]{-1, -3, -5, -6}));
    }

    @Test
    public void test_8() {
        assertArrayEquals(new Integer[]{-1, null}, HumanEval_136.largestSmallestIntegers(new int[]{-1, -3, -5, -6, 0}));
    }

    @Test
    public void test_9() {
        assertArrayEquals(new Integer[]{-3, 1}, HumanEval_136.largestSmallestIntegers(new int[]{-6, -4, -4, -3, 1}));
    }

    @Test
    public void test_10() {
        assertArrayEquals(new Integer[]{-3, 1}, HumanEval_136.largestSmallestIntegers(new int[]{-6, -4, -4, -3, -100, 1}));
    }

    @Test
    public void test_11() {
        assertArrayEquals(new Integer[]{-2, 5}, HumanEval_136.largestSmallestIntegers(new int[]{9, -4, -6, 5, 0, -2}));
    }

    @Test
    public void test_12() {
        assertArrayEquals(new Integer[]{-1, 1}, HumanEval_136.largestSmallestIntegers(new int[]{0, 0, 0, 0, 1, -1}));
    }

    @Test
    public void test_13() {
        assertArrayEquals(new Integer[]{-1, null}, HumanEval_136.largestSmallestIntegers(new int[]{-2, -4, -6, 0, -4, -10, 0, -1, -10, -10, 0}));
    }

    @Test
    public void test_14() {
        assertArrayEquals(new Integer[]{null, null}, HumanEval_136.largestSmallestIntegers(new int[]{0, 0, 0}));
    }

    @Test
    public void test_15() {
        assertArrayEquals(new Integer[]{null, 1}, HumanEval_136.largestSmallestIntegers(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void test_16() {
        assertArrayEquals(new Integer[]{-10, null}, HumanEval_136.largestSmallestIntegers(new int[]{-10}));
    }
}

// End of Test.
