package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_109Test {

    @Test
    public void test0() {
        assertTrue(HumanEval_109.moveOneBall(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void test1() {
        assertTrue(HumanEval_109.moveOneBall(new int[]{3, 5, 10, 1, 2}));
    }

    @Test
    public void test2() {
        assertFalse(HumanEval_109.moveOneBall(new int[]{4, 3, 1, 2}));
    }

    @Test
    public void test3() {
        assertFalse(HumanEval_109.moveOneBall(new int[]{3, 5, 4, 1, 2}));
    }

    @Test
    public void test4() {
        assertTrue(HumanEval_109.moveOneBall(new int[]{}));
    }

    @Test
    public void test5() {
        assertTrue(HumanEval_109.moveOneBall(new int[]{5, 6, 7, 8, 1, 2, 3, 4}));
    }

    @Test
    public void test6() {
        assertFalse(HumanEval_109.moveOneBall(new int[]{8, 7, 6, 5, 4, 3, 2, 1}));
    }

    @Test
    public void test7() {
        assertTrue(HumanEval_109.moveOneBall(new int[]{1}));
    }

    @Test
    public void test8() {
        assertTrue(HumanEval_109.moveOneBall(new int[]{2, 1}));
    }

    @Test
    public void test9() {
        assertTrue(HumanEval_109.moveOneBall(new int[]{5, 6, 8, 2, 4}));
    }

    @Test
    public void test10() {
        assertFalse(HumanEval_109.moveOneBall(new int[]{5, 6, 8, 7, 2, 4}));
    }

    @Test
    public void test11() {
        assertFalse(HumanEval_109.moveOneBall(new int[]{2, 3, 1, 4, 5}));
    }

    @Test
    public void test12() {
        assertFalse(HumanEval_109.moveOneBall(new int[]{9, 2, 1}));
    }

    @Test
    public void test13() {
        assertFalse(HumanEval_109.moveOneBall(new int[]{1, 3, 5, 7, 9, 11, 2, 4, 6, 8, 10, 12}));
    }

    @Test
    public void test14() {
        assertTrue(HumanEval_109.moveOneBall(new int[]{9, 2, 6}));
    }
}

