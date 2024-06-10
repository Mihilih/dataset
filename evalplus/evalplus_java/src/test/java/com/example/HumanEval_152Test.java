package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_152Test {

    @Test
    public void test_0() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 3, 3}, HumanEval_152.compare(new int[]{1, 2, 3, 4, 5, 1}, new int[]{1, 2, 3, 4, 2, -2}));
    }

    @Test
    public void test_1() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, HumanEval_152.compare(new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}));
    }

    @Test
    public void test_2() {
        assertArrayEquals(new int[]{2, 4, 6}, HumanEval_152.compare(new int[]{1, 2, 3}, new int[]{-1, -2, -3}));
    }

    @Test
    public void test_3() {
        assertArrayEquals(new int[]{2, 0, 0, 1}, HumanEval_152.compare(new int[]{1, 2, 3, 5}, new int[]{-1, 2, 3, 4}));
    }

    @Test
    public void test_4() {
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, HumanEval_152.compare(new int[]{1, 1, 1, 1, 1}, new int[]{0, 0, 0, 0, 0}));
    }

    @Test
    public void test_5() {
        assertArrayEquals(new int[]{2, 2, 2, 2, 2}, HumanEval_152.compare(new int[]{10, 20, 30, 40, 50}, new int[]{12, 22, 32, 42, 52}));
    }

    @Test
    public void test_6() {
        assertArrayEquals(new int[]{2, 3, 1, 4, 11, 0}, HumanEval_152.compare(new int[]{13, 23, 9, 17, 25, 23}, new int[]{11, 20, 10, 13, 14, 23}));
    }

    @Test
    public void test_7() {
        assertArrayEquals(new int[]{}, HumanEval_152.compare(new int[]{}, new int[]{}));
    }

    @Test
    public void test_8() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, HumanEval_152.compare(new int[]{-1, -5, 0, 5, 5}, new int[]{-1, -5, 0, 5, 5}));
    }

    @Test
    public void test_9() {
        assertArrayEquals(new int[]{1, 1, 1, 1, 4}, HumanEval_152.compare(new int[]{-1, -3, -2, 0, 4}, new int[]{-2, -4, -1, 1, 0}));
    }

    @Test
    public void test_10() {
        assertArrayEquals(new int[]{10000000, 10000000}, HumanEval_152.compare(new int[]{0, 10000000}, new int[]{10000000, 0}));
    }
}
// End of Test.
