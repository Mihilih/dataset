package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_145Test {
    @Test
    public void testOrderByPoints_0() {
        Integer[] nums = {1, 11, -1, -11, -12};
        Integer[] expected = {-1, -11, 1, -12, 11};
        assertArrayEquals(expected, HumanEval_145.orderByPoints(nums));
    }

    @Test
    public void testOrderByPoints_1() {
        Integer[] nums = {1234, 423, 463, 145, 2, 423, 423, 53, 6, 37, 3457, 3, 56, 0, 46};
        Integer[] expected = {0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457};
        assertArrayEquals(expected, HumanEval_145.orderByPoints(nums));
    }

    @Test
    public void testOrderByPoints_2() {
        Integer[] nums = {};
        Integer[] expected = {};
        assertArrayEquals(expected, HumanEval_145.orderByPoints(nums));
    }

    @Test
    public void testOrderByPoints_3() {
        Integer[] nums = {1, -11, -32, 43, 54, -98, 2, -3};
        Integer[] expected = {-3, -32, -98, -11, 1, 2, 43, 54};
        assertArrayEquals(expected, HumanEval_145.orderByPoints(nums));
    }

    //... Add more tests as needed
}

// End of Test
