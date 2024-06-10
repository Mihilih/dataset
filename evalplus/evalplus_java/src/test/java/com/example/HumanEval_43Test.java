package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_43Test {
    @Test
    public void test_0() {
        assertFalse(HumanEval_43.pairsSumToZero(new int[]{1, 3, 5, 0}));
    }

    @Test
    public void test_1() {
        assertFalse(HumanEval_43.pairsSumToZero(new int[]{1, 3, -2, 1}));
    }

    @Test
    public void test_2() {
        assertFalse(HumanEval_43.pairsSumToZero(new int[]{1, 2, 3, 7}));
    }

    @Test
    public void test_3() {
        assertTrue(HumanEval_43.pairsSumToZero(new int[]{2, 4, -5, 3, 5, 7}));
    }

    @Test
    public void test_4() {
        assertFalse(HumanEval_43.pairsSumToZero(new int[]{1}));
    }

    @Test
    public void test_5() {
        assertTrue(HumanEval_43.pairsSumToZero(new int[]{-3, 9, -1, 3, 2, 30}));
    }

    @Test
    public void test_6() {
        assertTrue(HumanEval_43.pairsSumToZero(new int[]{-3, 9, -1, 3, 2, 31}));
    }

    @Test
    public void test_7() {
        assertFalse(HumanEval_43.pairsSumToZero(new int[]{-3, 9, -1, 4, 2, 30}));
    }

    @Test
    public void test_8() {
        assertFalse(HumanEval_43.pairsSumToZero(new int[]{-3, 9, -1, 4, 2, 31}));
    }

    @Test
    public void test_9() {
        assertTrue(HumanEval_43.pairsSumToZero(new int[]{0, 1, -1}));
    }

    @Test
    public void test_10() {
        assertFalse(HumanEval_43.pairsSumToZero(new int[]{2, 3, 4, 5, -9}));
    }

    @Test
    public void test_11() {
        assertFalse(HumanEval_43.pairsSumToZero(new int[]{10, -5, 7, 3, -4, -1, 0, -6, -9, 3, 14}));
    }

    @Test
    public void test_12() {
        assertTrue(HumanEval_43.pairsSumToZero(new int[]{0, 0}));
    }

    @Test
    public void test_13() {
        assertTrue(HumanEval_43.pairsSumToZero(new int[]{2, 3, -2, -4, 0}));
    }

    @Test
    public void test_14() {
        assertFalse(HumanEval_43.pairsSumToZero(new int[]{10, -5, 7, 3, -4, -1, 0, -6, -9, 2, 14}));
    }

    @Test
    public void test_15() {
        assertTrue(HumanEval_43.pairsSumToZero(new int[]{-5, -4, -1, 0, -6, -9, 2, 14, 8000, 14, -6, -6, 0, -6}));
    }

    @Test
    public void test_17() {
        assertTrue(HumanEval_43.pairsSumToZero(new int[]{1, -1}));
    }

    @Test
    public void test_18() {
        assertTrue(HumanEval_43.pairsSumToZero(new int[]{0, 0, 0, 0, 0, 0, 0, 0}));
    }

    @Test
    public void test_19() {
        assertFalse(HumanEval_43.pairsSumToZero(new int[]{5, 5}));
    }

    @Test
    public void test_20() {
        assertFalse(HumanEval_43.pairsSumToZero(new int[]{0}));
    }
}
// End of Test
