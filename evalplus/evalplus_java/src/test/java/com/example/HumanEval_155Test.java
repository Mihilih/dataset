package com.example;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_155Test {

    @Test
    public void testEvenOddCount_0() {
        assertArrayEquals(new int[]{0, 1}, HumanEval_155.evenOddCount(7));
    }

    @Test
    public void testEvenOddCount_1() {
        assertArrayEquals(new int[]{1, 1}, HumanEval_155.evenOddCount(-78));
    }

    @Test
    public void testEvenOddCount_2() {
        assertArrayEquals(new int[]{2, 2}, HumanEval_155.evenOddCount(3452));
    }

    @Test
    public void testEvenOddCount_3() {
        assertArrayEquals(new int[]{3, 3}, HumanEval_155.evenOddCount(346211));
    }

    @Test
    public void testEvenOddCount_4() {
        assertArrayEquals(new int[]{3, 3}, HumanEval_155.evenOddCount(-345821));
    }

    @Test
    public void testEvenOddCount_5() {
        assertArrayEquals(new int[]{1, 0}, HumanEval_155.evenOddCount(-2));
    }

    @Test
    public void testEvenOddCount_6() {
        assertArrayEquals(new int[]{2, 3}, HumanEval_155.evenOddCount(-45347));
    }

    @Test
    public void testEvenOddCount_7() {
        assertArrayEquals(new int[]{1, 0}, HumanEval_155.evenOddCount(0));
    }

    @Test
    public void testEvenOddCount_8() {
        assertArrayEquals(new int[]{3, 1}, HumanEval_155.evenOddCount(2368));
    }

    @Test
    public void testEvenOddCount_9() {
        assertArrayEquals(new int[]{5, 2}, HumanEval_155.evenOddCount(-2468031));
    }

    @Test
    public void testEvenOddCount_10() {
        assertArrayEquals(new int[]{1, 0}, HumanEval_155.evenOddCount(0));
    }

    @Test
    public void testEvenOddCount_11() {
        assertArrayEquals(new int[]{0, 1}, HumanEval_155.evenOddCount(-7));
    }

    @Test
    public void testEvenOddCount_12() {
        assertArrayEquals(new int[]{0, 1}, HumanEval_155.evenOddCount(-1));
    }
}
// End of Test
