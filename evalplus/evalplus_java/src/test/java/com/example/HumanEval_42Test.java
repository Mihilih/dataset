package com.example;
import org.junit.Assert;
import org.junit.Test;

public class HumanEval_42Test {
    @Test
    public void testIncr_list_0() {
        int[] input = {};
        int[] expected = {};
        Assert.assertArrayEquals(expected, HumanEval_42.incr_list(input));
    }

    @Test
    public void testIncr_list_1() {
        int[] input = {3, 2, 1};
        int[] expected = {4, 3, 2};
        Assert.assertArrayEquals(expected, HumanEval_42.incr_list(input));
    }

    @Test
    public void testIncr_list_2() {
        int[] input = {5, 2, 5, 2, 3, 3, 9, 0, 123};
        int[] expected = {6, 3, 6, 3, 4, 4, 10, 1, 124};
        Assert.assertArrayEquals(expected, HumanEval_42.incr_list(input));
    }

    @Test
    public void testIncr_list_3() {
        int[] input = {100, 200, 300, 400, 500};
        int[] expected = {101, 201, 301, 401, 501};
        Assert.assertArrayEquals(expected, HumanEval_42.incr_list(input));
    }

    @Test
    public void testIncr_list_4() {
        int[] input = {-10, 0, 10, 0};
        int[] expected = {-9, 1, 11, 1};
        Assert.assertArrayEquals(expected, HumanEval_42.incr_list(input));
    }

    @Test
    public void testIncr_list_5() {
        int[] input = {1, 4, 6, 8, 10, 14, 9, 16, 20, 20};
        int[] expected = {2, 5, 7, 9, 11, 15, 10, 17, 21, 21};
        Assert.assertArrayEquals(expected, HumanEval_42.incr_list(input));
    }
}
// End of Test
