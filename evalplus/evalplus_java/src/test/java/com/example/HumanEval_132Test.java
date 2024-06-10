package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_132Test {

    @Test
    public void test_0() {
        assertEquals(true, HumanEval_132.isNested("[[]]"));
    }

    @Test
    public void test_1() {
        assertEquals(false, HumanEval_132.isNested("[]]]]]]][[[[[]"));
    }

    @Test
    public void test_2() {
        assertEquals(false, HumanEval_132.isNested("[][]"));
    }

    @Test
    public void test_3() {
        assertEquals(false, HumanEval_132.isNested("[]"));
    }

    @Test
    public void test_4() {
        assertEquals(true, HumanEval_132.isNested("[[[[]]]]"));
    }

    @Test
    public void test_5() {
        assertEquals(false, HumanEval_132.isNested("[]]]]]]]]]]"));
    }

    @Test
    public void test_6() {
        assertEquals(true, HumanEval_132.isNested("[][][[]]"));
    }

    @Test
    public void test_7() {
        assertEquals(false, HumanEval_132.isNested("[[]"));
    }

    @Test
    public void test_8() {
        assertEquals(false, HumanEval_132.isNested("[]]"));
    }

    @Test
    public void test_9() {
        assertEquals(true, HumanEval_132.isNested("[[]][["));
    }

    @Test
    public void test_10() {
        assertEquals(true, HumanEval_132.isNested("[[][]]"));
    }

    @Test
    public void test_11() {
        assertEquals(false, HumanEval_132.isNested(""));
    }

    @Test
    public void test_12() {
        assertEquals(false, HumanEval_132.isNested("[[[[[[[["));
    }

    @Test
    public void test_13() {
        assertEquals(false, HumanEval_132.isNested("]]]]]]]]"));
    }

    @Test
    public void test_14() {
        assertEquals(false, HumanEval_132.isNested("[]][[]"));
    }

    @Test
    public void test_15() {
        assertEquals(true, HumanEval_132.isNested("[[]][]"));
    }

    @Test
    public void test_16() {
        assertEquals(false, HumanEval_132.isNested("][[["));
    }

    @Test
    public void test_17() {
        assertEquals(true, HumanEval_132.isNested("[][][][[][]][]"));
    }

    @Test
    public void test_18() {
        assertEquals(false, HumanEval_132.isNested("]]"));
    }

    @Test
    public void test_19() {
        assertEquals(true, HumanEval_132.isNested("][]]][[]][]"));
    }

    @Test
    public void test_20() {
        assertEquals(false, HumanEval_132.isNested("][][][][]][[][]"));
    }

    @Test
    public void test_21() {
        assertEquals(true, HumanEval_132.isNested("[[[[][]][[[[[][]]"));
    }

    @Test
    public void test_22() {
        assertEquals(false, HumanEval_132.isNested("][]][]"));
    }
}
