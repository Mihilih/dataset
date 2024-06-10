package com.example;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class HumanEval_5Test {

    @Test
    public void testIntersperse0() {
        assertEquals(new ArrayList<>(), HumanEval_5.intersperse(new ArrayList<Integer>(), 7));
    }

    @Test
    public void testIntersperse1() {
        List<Integer> input = Arrays.asList(5, 6, 3, 2);
        List<Integer> expected = Arrays.asList(5, 8, 6, 8, 3, 8, 2);
        assertEquals(expected, HumanEval_5.intersperse(input, 8));
    }

    @Test
    public void testIntersperse2() {
        List<Integer> input = Arrays.asList(2, 2, 2);
        List<Integer> expected = Arrays.asList(2, 2, 2, 2, 2);
        assertEquals(expected, HumanEval_5.intersperse(input, 2));
    }

    @Test
    public void testIntersperse3() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 0, 2, 0, 3);
        assertEquals(expected, HumanEval_5.intersperse(input, 0));
    }

    @Test
    public void testIntersperse4() {
        List<Integer> input = Arrays.asList(10);
        List<Integer> expected = Arrays.asList(10);
        assertEquals(expected, HumanEval_5.intersperse(input, 5));
    }

    @Test
    public void testIntersperse5() {
        List<Integer> input = Arrays.asList(3, 6, 2, 5, 1, 9);
        List<Integer> expected = Arrays.asList(3, 0, 6, 0, 2, 0, 5, 0, 1, 0, 9);
        assertEquals(expected, HumanEval_5.intersperse(input, 0));
    }

    @Test
    public void testIntersperse6() {
        assertEquals(new ArrayList<>(), HumanEval_5.intersperse(new ArrayList<Integer>(), 2));
    }

    @Test
    public void testIntersperse7() {
        List<Integer> input = Arrays.asList(4);
        List<Integer> expected = Arrays.asList(4);
        assertEquals(expected, HumanEval_5.intersperse(input, 4));
    }

    @Test
    public void testIntersperse8() {
        List<Integer> input = Arrays.asList(5, 5);
        List<Integer> expected = Arrays.asList(5, 5, 5);
        assertEquals(expected, HumanEval_5.intersperse(input, 5));
    }

    @Test
    public void testIntersperse9() {
        List<Integer> input = Arrays.asList(0, 0, 0);
        List<Integer> expected = Arrays.asList(0, 7, 0, 7, 0);
        assertEquals(expected, HumanEval_5.intersperse(input, 7));
    }

    @Test
    public void testIntersperse10() {
        List<Integer> input = Arrays.asList(1, 9, 5, 6);
        List<Integer> expected = Arrays.asList(1, 3, 9, 3, 5, 3, 6);
        assertEquals(expected, HumanEval_5.intersperse(input, 3));
    }
}

// End of Test
