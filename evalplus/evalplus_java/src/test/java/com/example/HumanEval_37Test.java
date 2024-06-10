package com.example;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_37Test {
    @Test
    public void testSortEven1() {
        int[] arr = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, HumanEval_37.sortEven(arr));
    }

    @Test
    public void testSortEven2() {
        int[] arr = {5, 6, 3, 4};
        int[] expected = {3, 6, 5, 4};
        assertArrayEquals(expected, HumanEval_37.sortEven(arr));
    }

    @Test
    public void testSortEven3() {
        int[] arr = {5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10};
        int[] expected = {-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123};
        assertArrayEquals(expected, HumanEval_37.sortEven(arr));
    }

    @Test
    public void testSortEven4() {
        int[] arr = {5, 8, -12, 4, 23, 2, 3, 11, 12, -10};
        int[] expected = {-12, 8, 3, 4, 5, 2, 12, 11, 23, -10};
        assertArrayEquals(expected, HumanEval_37.sortEven(arr));
    }

    @Test
    public void testSortEven5() {
        int[] arr = {2, 6, 4, 8, 10};
        int[] expected = {2, 6, 4, 8, 10};
        assertArrayEquals(expected, HumanEval_37.sortEven(arr));
    }

    @Test
    public void testSortEven6() {
        int[] arr = {11, 7, 6, 9, 14, -1};
        int[] expected = {6, 7, 11, 9, 14, -1};
        assertArrayEquals(expected, HumanEval_37.sortEven(arr));
    }

    @Test
    public void testSortEven7() {
        int[] arr = {0, 0, 0, -1, -1, -1, 2, 2, 2};
        int[] expected = {-1, 0, 0, -1, 0, -1, 2, 2, 2};
        assertArrayEquals(expected, HumanEval_37.sortEven(arr));
    }
}
// End of Test
