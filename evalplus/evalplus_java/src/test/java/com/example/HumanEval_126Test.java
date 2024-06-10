package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_126Test {
    @Test
    public void test_0() {
        assertTrue(HumanEval_126.isSorted(new int[]{5}));
    }

    @Test
    public void test_1() {
        assertTrue(HumanEval_126.isSorted(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void test_2() {
        assertFalse(HumanEval_126.isSorted(new int[]{1, 3, 2, 4, 5}));
    }

    @Test
    public void test_3() {
        assertTrue(HumanEval_126.isSorted(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void test_4() {
        assertTrue(HumanEval_126.isSorted(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    @Test
    public void test_5() {
        assertFalse(HumanEval_126.isSorted(new int[]{1, 3, 2, 4, 5, 6, 7}));
    }

    @Test
    public void test_6() {
        assertTrue(HumanEval_126.isSorted(new int[]{}));
    }

    @Test
    public void test_7() {
        assertTrue(HumanEval_126.isSorted(new int[]{1}));
    }

    @Test
    public void test_8() {
        assertFalse(HumanEval_126.isSorted(new int[]{3, 2, 1}));
    }

    @Test
    public void test_9() {
        assertFalse(HumanEval_126.isSorted(new int[]{1, 2, 2, 2, 3, 4}));
    }

    @Test
    public void test_10() {
        assertFalse(HumanEval_126.isSorted(new int[]{1, 2, 3, 3, 3, 4}));
    }

    @Test
    public void test_11() {
        assertTrue(HumanEval_126.isSorted(new int[]{1, 2, 2, 3, 3, 4}));
    }

    @Test
    public void test_12() {
        assertTrue(HumanEval_126.isSorted(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test_13() {
        assertTrue(HumanEval_126.isSorted(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void test_14() {
        assertFalse(HumanEval_126.isSorted(new int[]{1, 2, 2, 2, 2, 3, 4}));
    }

    @Test
    public void test_15() {
        assertTrue(HumanEval_126.isSorted(new int[]{1, 1, 2, 2, 3, 3, 4}));
    }

    @Test
    public void test_16() {
        assertFalse(HumanEval_126.isSorted(new int[]{1, 1, 2, 2, 2, 3, 4}));
    }

    @Test
    public void test_17() {
        assertFalse(HumanEval_126.isSorted(new int[]{}));
    }

    @Test
    public void test_18() {
        assertFalse(HumanEval_126.isSorted(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void test_19() {
        assertTrue(HumanEval_126.isSorted(new int[]{1, 1, 2, 3, 4, 4}));
    }

    @Test
    public void test_20() {
        assertFalse(HumanEval_126.isSorted(new int[]{1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}));
    }
}
// End of Test
