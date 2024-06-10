package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class HumanEval_116Test {

    @Test
    public void testSortArray0() {
        Integer[] arr = {1, 5, 2, 3, 4};
        Integer[] expected = {1, 2, 4, 3, 5};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray1() {
        Integer[] arr = {-2, -3, -4, -5, -6};
        Integer[] expected = {-4, -2, -6, -5, -3};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray2() {
        Integer[] arr = {1, 0, 2, 3, 4};
        Integer[] expected = {0, 1, 2, 4, 3};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray3() {
        Integer[] arr = {};
        Integer[] expected = {};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray4() {
        Integer[] arr = {2, 5, 77, 4, 5, 3, 5, 7, 2, 3, 4};
        Integer[] expected = {2, 2, 4, 4, 3, 3, 5, 5, 5, 7, 77};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray5() {
        Integer[] arr = {3, 6, 44, 12, 32, 5};
        Integer[] expected = {32, 3, 5, 6, 12, 44};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray6() {
        Integer[] arr = {2, 4, 8, 16, 32};
        Integer[] expected = {2, 4, 8, 16, 32};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray7() {
        Integer[] arr = {2, 4, 8, 16, 32};
        Integer[] expected = {2, 4, 8, 16, 32};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray8() {
        Integer[] arr = {3, 7, 6, 5, 4};
        Integer[] expected = {4, 3, 5, 6, 7};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray9() {
        Integer[] arr = {100000000, 0, 10101010, 111111111, 100000};
        Integer[] expected = {0, 100000, 10101010, 100000000, 111111111};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray10() {
        Integer[] arr = {10, 8, 12, 11, 9};
        Integer[] expected = {8, 9, 10, 12, 11};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray11() {
        Integer[] arr = {-1, 0, 1, 127, -2, 128};
        Integer[] expected = {0, -2, -1, 1, 128, 127};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray12() {
        Integer[] arr = {-3, 3, 0, 2, 1, -2, 2, 1, 5, -6, 6, 7, 8, -1, -8};
        Integer[] expected = {0, -8, -2, -1, 1, 1, 2, 2, 8, -6, -3, 3, 5, 6, 7};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }

    @Test
    public void testSortArray13() {
        Integer[] arr = {};
        Integer[] expected = {};
        assertArrayEquals(expected, HumanEval_116.sortArray(arr));
    }
}
// End of Test
