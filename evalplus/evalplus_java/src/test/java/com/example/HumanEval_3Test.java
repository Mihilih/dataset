package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_3Test {

    @Test
    public void testBelowZero_0() {
        int[] operations = {};
        assertFalse(HumanEval_3.belowZero(operations));
    }

    @Test
    public void testBelowZero_1() {
        int[] operations = {1, 2, -3, 1, 2, -3};
        assertFalse(HumanEval_3.belowZero(operations));
    }

    @Test
    public void testBelowZero_2() {
        int[] operations = {1, 2, -4, 5, 6};
        assertTrue(HumanEval_3.belowZero(operations));
    }

    @Test
    public void testBelowZero_3() {
        int[] operations = {1, -1, 2, -2, 5, -5, 4, -4};
        assertFalse(HumanEval_3.belowZero(operations));
    }

    @Test
    public void testBelowZero_4() {
        int[] operations = {1, -1, 2, -2, 5, -5, 4, -5};
        assertTrue(HumanEval_3.belowZero(operations));
    }

    @Test
    public void testBelowZero_5() {
        int[] operations = {1, -2, 2, -2, 5, -5, 4, -4};
        assertTrue(HumanEval_3.belowZero(operations));
    }

} // End of Test
