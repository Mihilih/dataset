package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_52Test {
    @Test
    public void testBelowThreshold0() {
        int[] l = {1, 2, 4, 10};
        assertTrue(HumanEval_52.belowThreshold(l, 100));
    }

    @Test
    public void testBelowThreshold1() {
        int[] l = {1, 20, 4, 10};
        assertFalse(HumanEval_52.belowThreshold(l, 5));
    }

    @Test
    public void testBelowThreshold2() {
        int[] l = {1, 20, 4, 10};
        assertTrue(HumanEval_52.belowThreshold(l, 21));
    }

    @Test
    public void testBelowThreshold3() {
        int[] l = {1, 20, 4, 10};
        assertTrue(HumanEval_52.belowThreshold(l, 22));
    }

    @Test
    public void testBelowThreshold4() {
        int[] l = {1, 8, 4, 10};
        assertTrue(HumanEval_52.belowThreshold(l, 11));
    }

    @Test
    public void testBelowThreshold5() {
        int[] l = {1, 8, 4, 10};
        assertFalse(HumanEval_52.belowThreshold(l, 10));
    }

    @Test
    public void testBelowThreshold6() {
        int[] l = {0, 0, 0, 0};
        assertTrue(HumanEval_52.belowThreshold(l, 1));
    }

    @Test
    public void testBelowThreshold7() {
        int[] l = {1, 2, 3, 4};
        assertFalse(HumanEval_52.belowThreshold(l, 4));
    }

    @Test
    public void testBelowThreshold8() {
        int[] l = {5};
        assertFalse(HumanEval_52.belowThreshold(l, 5));
    }

    @Test
    public void testBelowThreshold9() {
        int[] l = {};
        assertTrue(HumanEval_52.belowThreshold(l, 0));
    }

    @Test
    public void testBelowThreshold10() {
        int[] l = {10000000, 9000000, 8000000, 7000000, 6000000, -200, 10000000};
        assertTrue(HumanEval_52.belowThreshold(l, 10000001));
    }

    @Test
    public void testBelowThreshold11() {
        int[] l = {-4, -3, -2, -1};
        assertFalse(HumanEval_52.belowThreshold(l, -1));
    }

    @Test
    public void testBelowThreshold12() {
        int[] l = {7, -2, -3, -3, -4};
        assertFalse(HumanEval_52.belowThreshold(l, 0));
    }

    @Test
    public void testBelowThreshold13() {
        int[] l = {-1, -2, -3, -4};
        assertTrue(HumanEval_52.belowThreshold(l, 0));
    }

    @Test
    public void testBelowThreshold14() {
        int[] l = {};
        assertTrue(HumanEval_52.belowThreshold(l, -1));
    }

    @Test
    public void testBelowThreshold15() {
        int[] l = {-4, -3, -2, -1};
        assertFalse(HumanEval_52.belowThreshold(l, -5));
    }
}

// End of Test
