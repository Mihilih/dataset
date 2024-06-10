package com.example;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HumanEval_59Test {
    @Test
    public void test_0() {
        assertEquals(5, HumanEval_59.largestPrimeFactor(15));
    }

    @Test
    public void test_1() {
        assertEquals(3, HumanEval_59.largestPrimeFactor(27));
    }

    @Test
    public void test_2() {
        assertEquals(7, HumanEval_59.largestPrimeFactor(63));
    }

    @Test
    public void test_3() {
        assertEquals(11, HumanEval_59.largestPrimeFactor(330));
    }

    @Test
    public void test_4() {
        assertEquals(29, HumanEval_59.largestPrimeFactor(13195));
    }

    @Test
    public void test_5() {
        assertEquals(5, HumanEval_59.largestPrimeFactor(100));
    }

    @Test
    public void test_6() {
        assertEquals(2, HumanEval_59.largestPrimeFactor(4));
    }

    @Test
    public void test_7() {
        assertEquals(2, HumanEval_59.largestPrimeFactor(256));
    }

    @Test
    public void test_8() {
        assertEquals(5, HumanEval_59.largestPrimeFactor(1000000));
    }

    @Test
    public void test_9() {
        assertEquals(17, HumanEval_59.largestPrimeFactor(9996));
    }

    @Test
    public void test_10() {
        assertEquals(284311, HumanEval_59.largestPrimeFactor(568622));
    }

    @Test
    public void test_11() {
        assertEquals(3, HumanEval_59.largestPrimeFactor(18));
    }
} // End of Test.
