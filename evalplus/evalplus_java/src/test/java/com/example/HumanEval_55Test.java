package com.example;
import static org.junit.Assert.assertEquals;

import com.example.HumanEval_55;
import org.junit.Test;

public class HumanEval_55Test {

    @Test
    public void testFib10() {
        assertEquals(55, HumanEval_55.fib(10));
    }

    @Test
    public void testFib1() {
        assertEquals(1, HumanEval_55.fib(1));
    }

    @Test
    public void testFib8() {
        assertEquals(21, HumanEval_55.fib(8));
    }

    @Test
    public void testFib11() {
        assertEquals(89, HumanEval_55.fib(11));
    }

    @Test
    public void testFib12() {
        assertEquals(144, HumanEval_55.fib(12));
    }

    @Test
    public void testFib16() {
        assertEquals(987, HumanEval_55.fib(16));
    }

    @Test
    public void testFib0() {
        assertEquals(0, HumanEval_55.fib(0));
    }

    @Test
    public void testFib2() {
        assertEquals(1, HumanEval_55.fib(2));
    }

    @Test
    public void testFib3() {
        assertEquals(2, HumanEval_55.fib(3));
    }

    @Test
    public void testFib63() {
        assertEquals(6557470319842L, HumanEval_55.fib(63));
    }
} // End of Test
