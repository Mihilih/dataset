package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_106Test {

    @Test
    public void test_0() {
        assertArrayEquals(new int[]{1, 2, 6, 24, 15}, HumanEval_106.f(5));
    }

    @Test
    public void test_1() {
        assertArrayEquals(new int[]{1, 2, 6, 24, 15, 720, 28}, HumanEval_106.f(7));
    }

    @Test
    public void test_2() {
        assertArrayEquals(new int[]{1}, HumanEval_106.f(1));
    }

    @Test
    public void test_3() {
        assertArrayEquals(new int[]{1, 2, 6}, HumanEval_106.f(3));
    }

    @Test
    public void test_4() {
        assertArrayEquals(new int[]{1, 2, 6, 24}, HumanEval_106.f(4));
    }

    @Test
    public void test_5() {
        assertArrayEquals(new int[]{}, HumanEval_106.f(0));
    }

    @Test
    public void test_6() {
        assertArrayEquals(new int[]{1, 2}, HumanEval_106.f(2));
    }

    @Test
    public void test_7() {
        assertArrayEquals(new int[]{1}, HumanEval_106.f(1));
    }

    @Test
    public void test_8() {
        assertArrayEquals(new int[]{1, 2, 6}, HumanEval_106.f(3));
    }

    @Test
    public void test_9() {
        assertArrayEquals(new int[]{1, 2, 6, 24, 15, 720}, HumanEval_106.f(6));
    }
}
// End of Test
