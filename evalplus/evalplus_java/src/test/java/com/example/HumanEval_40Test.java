package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_40Test {

    @Test
    public void test_0() {
        int[] list = {1, 3, 5, 0};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_1() {
        int[] list = {1, 3, 5, -1};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_2() {
        int[] list = {1, 3, -2, 1};
        assertEquals(true, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_3() {
        int[] list = {1, 2, 3, 7};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_4() {
        int[] list = {1, 2, 5, 7};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_5() {
        int[] list = {2, 4, -5, 3, 9, 7};
        assertEquals(true, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_6() {
        int[] list = {1};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_7() {
        int[] list = {1, 3, 5, -100};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_8() {
        int[] list = {100, 3, 5, -100};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_9() {
        int[] list = {1, 2, 3, 4, 5, -9};
        assertEquals(true, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_10() {
        int[] list = {-2, -2};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_11() {
        int[] list = {2, 3, 50, 0, 3, 0, 4, 2, -1, 2};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_12() {
        int[] list = {0, 0, 0};
        assertEquals(true, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_13() {
        int[] list = {25, -20, 8, 7, -5, -50, 14, 9};
        assertEquals(true, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_14() {
        int[] list = {32, 25, 8, 7, -5, -6, 5, 9, 14, 3};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_15() {
        int[] list = {32, 25, 8, 7, -5, -6, 5, 9, 14, 3, 3};
        assertEquals(true, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_16() {
        int[] list = {0, 1, 0, 0};
        assertEquals(true, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_17() {
        int[] list = {};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_18() {
        int[] list = {2, 3, -6, 0, 0};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_19() {
        int[] list = {1, -1};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_20() {
        int[] list = {10, -20, 30, -40, 50, -60};
        assertEquals(true, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_21() {
        int[] list = {-1, 0, 1};
        assertEquals(true, HumanEval_40.triples_sum_to_zero(list));
    }

    @Test
    public void test_22() {
        int[] list = {1, -2, -4};
        assertEquals(false, HumanEval_40.triples_sum_to_zero(list));
    }
} // End of Test
