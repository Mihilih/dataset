package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_146Test {

    @Test
    public void testSpecialFilter0() {
        int[] nums = {5, -2, 1, -5};
        assertEquals(0, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter1() {
        int[] nums = {15, -73, 14, -15};
        assertEquals(1, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter2() {
        int[] nums = {33, -2, -3, 45, 21, 109};
        assertEquals(2, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter3() {
        int[] nums = {43, -12, 93, 125, 121, 109};
        assertEquals(4, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter4() {
        int[] nums = {71, -2, -33, 75, 21, 19};
        assertEquals(3, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter5() {
        int[] nums = {1};
        assertEquals(0, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter6() {
        int[] nums = {};
        assertEquals(0, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter7() {
        int[] nums = {24, -25, 9, 37, -71, -18};
        assertEquals(1, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter8() {
        int[] nums = {22, -33, -46, 89, -91, 128};
        assertEquals(0, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter9() {
        int[] nums = {12, 789, 13, 15, 16};
        assertEquals(3, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter10() {
        int[] nums = {11, 232, 324, -876, 799};
        assertEquals(2, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter11() {
        int[] nums = {33, -3, 45, 21, 109, 121, 357, 1892, 45, 45};
        assertEquals(4, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter12() {
        int[] nums = {57, -23, -15, 42, 99, 56, 104, 42, 42};
        assertEquals(2, HumanEval_146.specialFilter(nums));
    }

    @Test
    public void testSpecialFilter13() {
        int[] nums = {55, -62, 7, 99, 23, 18};
        assertEquals(2, HumanEval_146.specialFilter(nums));
    }
}

// End of Test
