package com.example;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class HumanEval_105Test {

    @Test
    public void testByLength_0() {
        List<String> result = HumanEval_105.byLength(new int[]{2, 1, 1, 4, 5, 8, 2, 3});
        assertEquals(Arrays.asList("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"), result);
    }

    @Test
    public void testByLength_1() {
        List<String> result = HumanEval_105.byLength(new int[]{});
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testByLength_2() {
        List<String> result = HumanEval_105.byLength(new int[]{1, -1, 55});
        assertEquals(Arrays.asList("One"), result);
    }

    @Test
    public void testByLength_3() {
        List<String> result = HumanEval_105.byLength(new int[]{1, -1, 3, 2});
        assertEquals(Arrays.asList("Three", "Two", "One"), result);
    }

    @Test
    public void testByLength_4() {
        List<String> result = HumanEval_105.byLength(new int[]{9, 4, 8});
        assertEquals(Arrays.asList("Nine", "Eight", "Four"), result);
    }

    @Test
    public void testByLength_5() {
        List<String> result = HumanEval_105.byLength(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"), result);
    }

    @Test
    public void testByLength_6() {
        List<String> result = HumanEval_105.byLength(new int[]{-1, 0, 5, 6, 10});
        assertEquals(Arrays.asList("Six", "Five"), result);
    }

    @Test
    public void testByLength_7() {
        List<String> result = HumanEval_105.byLength(new int[]{3, 3, 3, 3, 3, 3});
        assertEquals(Arrays.asList("Three", "Three", "Three", "Three", "Three", "Three"), result);
    }

    @Test
    public void testByLength_8() {
        List<String> result = HumanEval_105.byLength(new int[]{4, 8, 7, 6, 5, 4, 3, 1});
        assertEquals(Arrays.asList("Eight", "Seven", "Six", "Five", "Four", "Four", "Three", "One"), result);
    }

    @Test
    public void testByLength_9() {
        List<String> result = HumanEval_105.byLength(new int[]{0, 10, 11, 12, 13, 14, 15, 16, -1, -5, 20, 25, 30, 100, 200, 300});
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testByLength_10() {
        List<String> result = HumanEval_105.byLength(new int[]{3, 3, 3, 3, 4, 3, 3, 3, 3});
        assertEquals(Arrays.asList("Four", "Three", "Three", "Three", "Three", "Three", "Three", "Three", "Three"), result);
    }

    @Test
    public void testByLength_11() {
        List<String> result = HumanEval_105.byLength(new int[]{0, 10, 11, 12, 13, 7, 15, 16, -1, -5, 20, 25, 30, 100, 300, 16, 0});
        assertEquals(Arrays.asList("Seven"), result);
    }

    @Test
    public void testByLength_12() {
        List<String> result = HumanEval_105.byLength(new int[]{-1, -3, 1, -1, 0, -4, -5, -6, -7, -8, 1, -9, 0});
        assertEquals(Arrays.asList("One", "One"), result);
    }

    @Test
    public void testByLength_13() {
        List<String> result = HumanEval_105.byLength(new int[]{2, 71, 1, 64, 90, 24, 41});
        assertEquals(Arrays.asList("Two", "One"), result);
    }

    @Test
    public void testByLength_14() {
        List<String> result = HumanEval_105.byLength(new int[]{9, 5, 2, 1, 1, 5, 6, 0, 8});
        assertEquals(Arrays.asList("Nine", "Eight", "Six", "Five", "Five", "Two", "One", "One"), result);
    }

    @Test
    public void testByLength_15() {
        List<String> result = HumanEval_105.byLength(new int[]{7});
        assertEquals(Arrays.asList("Seven"), result);
    }
}
// End of Test


