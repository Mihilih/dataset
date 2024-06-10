package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class HumanEval_88Test {

    @Test
    public void test_0() {
        Integer[] array = {};
        Integer[] expected = {};
        assertArrayEquals(expected, HumanEval_88.sortArray(array));
    }

    @Test
    public void test_1() {
        Integer[] array = {5};
        Integer[] expected = {5};
        assertArrayEquals(expected, HumanEval_88.sortArray(array));
    }

    @Test
    public void test_2() {
        Integer[] array = {2, 4, 3, 0, 1, 5};
        Integer[] expected = {0, 1, 2, 3, 4, 5};
        assertArrayEquals(expected, HumanEval_88.sortArray(array));
    }

    @Test
    public void test_3() {
        Integer[] array = {2, 4, 3, 0, 1, 5, 6};
        Integer[] expected = {6, 5, 4, 3, 2, 1, 0};
        assertArrayEquals(expected, HumanEval_88.sortArray(array));
    }

    @Test
    public void test_4() {
        Integer[] array = {2, 1};
        Integer[] expected = {1, 2};
        assertArrayEquals(expected, HumanEval_88.sortArray(array));
    }

    @Test
    public void test_5() {
        Integer[] array = {15, 42, 87, 32, 11, 0};
        Integer[] expected = {0, 11, 15, 32, 42, 87};
        assertArrayEquals(expected, HumanEval_88.sortArray(array));
    }

    @Test
    public void test_6() {
        Integer[] array = {21, 14, 23, 11};
        Integer[] expected = {23, 21, 14, 11};
        assertArrayEquals(expected, HumanEval_88.sortArray(array));
    }

    @Test
    public void test_7() {
        Integer[] array = {0, 0, 0, 0};
        Integer[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, HumanEval_88.sortArray(array));
    }

    @Test
    public void test_8() {
        Integer[] array = {1, 2, 3};
        Integer[] expected = {3, 2, 1};
        assertArrayEquals(expected, HumanEval_88.sortArray(array));
    }

    @Test
    public void test_9() {
        Integer[] array = {3, 1, 9, 2, 8, 3, 7, 3, 6, 5};
        Integer[] expected = {9, 8, 7, 6, 5, 3, 3, 3, 2, 1};
        assertArrayEquals(expected, HumanEval_88.sortArray(array));
    }

    @Test
    public void test_10() {
        Integer[] array = {1, 9, 2, 8, 3, 7, 4, 6, 5, 2};
        Integer[] expected = {1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, HumanEval_88.sortArray(array));
    }

    @Test
    public void test_11() {
        Integer[] array = {2, 2, 3, 3, 1, 1, 70, 1, 3, 1};
        Integer[] expected = {1, 1, 1, 1, 2, 2, 3, 3, 3, 70};
        assertArrayEquals(expected, HumanEval_88.sortArray(array));
    }
}

// End of Test
