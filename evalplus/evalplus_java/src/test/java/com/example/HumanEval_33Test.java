package com.example;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_33Test {
    @Test
    public void testSortThird_0() {
        assertArrayEquals(new int[]{1, 2, 3}, HumanEval_33.sortThird(new int[]{1, 2, 3}));
    }

    @Test
    public void testSortThird_1() {
        assertArrayEquals(new int[]{1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10}, 
            HumanEval_33.sortThird(new int[]{5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10}));
    }

    @Test
    public void testSortThird_2() {
        assertArrayEquals(new int[]{-10, 8, -12, 3, 23, 2, 4, 11, 12, 5}, 
            HumanEval_33.sortThird(new int[]{5, 8, -12, 4, 23, 2, 3, 11, 12, -10}));
    }

    @Test
    public void testSortThird_3() {
        assertArrayEquals(new int[]{2, 6, 3, 4, 8, 9, 5}, 
            HumanEval_33.sortThird(new int[]{5, 6, 3, 4, 8, 9, 2}));
    }

    @Test
    public void testSortThird_4() {
        assertArrayEquals(new int[]{2, 8, 3, 4, 6, 9, 5}, 
            HumanEval_33.sortThird(new int[]{5, 8, 3, 4, 6, 9, 2}));
    }

    @Test
    public void testSortThird_5() {
        assertArrayEquals(new int[]{2, 6, 9, 4, 8, 3, 5}, 
            HumanEval_33.sortThird(new int[]{5, 6, 9, 4, 8, 3, 2}));
    }

    @Test
    public void testSortThird_6() {
        assertArrayEquals(new int[]{2, 6, 3, 4, 8, 9, 5, 1}, 
            HumanEval_33.sortThird(new int[]{5, 6, 3, 4, 8, 9, 2, 1}));
    }

    @Test
    public void testSortThird_7() {
        assertArrayEquals(new int[]{6, 12, 15, 9, 3, 8, 10, 23, 7}, 
            HumanEval_33.sortThird(new int[]{9, 12, 15, 6, 3, 8, 10, 23, 7}));
    }

    @Test
    public void testSortThird_8() {
        assertArrayEquals(new int[]{}, HumanEval_33.sortThird(new int[]{}));
    }

    @Test
    public void testSortThird_9() {
        assertArrayEquals(new int[]{2, 10, 20, 7, 18, 13, 15}, 
            HumanEval_33.sortThird(new int[]{2, 10, 20, 15, 18, 13, 7}));
    }
}
// End of Test
