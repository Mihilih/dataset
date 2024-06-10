package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_108;

public class HumanEval_108Test {

    @Test
    public void test_0() {
        int[] arr = {};
        assertEquals(0, HumanEval_108.count_nums(arr));
    }

    @Test
    public void test_1() {
        int[] arr = {-1, -2, 0};
        assertEquals(0, HumanEval_108.count_nums(arr));
    }

    @Test
    public void test_2() {
        int[] arr = {1, 1, 2, -2, 3, 4, 5};
        assertEquals(6, HumanEval_108.count_nums(arr));
    }

    @Test
    public void test_3() {
        int[] arr = {1, 6, 9, -6, 0, 1, 5};
        assertEquals(5, HumanEval_108.count_nums(arr));
    }

    @Test
    public void test_4() {
        int[] arr = {1, 100, 98, -7, 1, -1};
        assertEquals(4, HumanEval_108.count_nums(arr));
    }

    @Test
    public void test_5() {
        int[] arr = {12, 23, 34, -45, -56, 0};
        assertEquals(5, HumanEval_108.count_nums(arr));
    }

    @Test
    public void test_6() {
        int[] arr = {0, 1};
        assertEquals(1, HumanEval_108.count_nums(arr));
    }

    @Test
    public void test_7() {
        int[] arr = {1};
        assertEquals(1, HumanEval_108.count_nums(arr));
    }

    @Test
    public void test_8() {
        int[] arr = {-1, 0, 1};
        assertEquals(1, HumanEval_108.count_nums(arr));
    }

    @Test
    public void test_9() {
        int[] arr = {-10, -20, -30, -40};
        assertEquals(0, HumanEval_108.count_nums(arr));
    }

    @Test
    public void test_10() {
        int[] arr = {123, 456, 789, -987, -654, -321};
        assertEquals(5, HumanEval_108.count_nums(arr));
    }

    @Test
    public void test_11() {
        int[] arr = {-10, -11, -12, 0, 14, -20};
        assertEquals(2, HumanEval_108.count_nums(arr));
    }
} // End of Test
