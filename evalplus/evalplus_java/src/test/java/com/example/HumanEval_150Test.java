package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import com.example.HumanEval_150;

public class HumanEval_150Test {

    @Test
    public void test_0() {
        assertEquals(34, HumanEval_150.x_or_y(7, 34, 12));
    }

    @Test
    public void test_1() {
        assertEquals(5, HumanEval_150.x_or_y(15, 8, 5));
    }

    @Test
    public void test_2() {
        assertEquals(33, HumanEval_150.x_or_y(3, 33, 5212));
    }

    @Test
    public void test_3() {
        assertEquals(3, HumanEval_150.x_or_y(1259, 3, 52));
    }

    @Test
    public void test_4() {
        assertEquals(-1, HumanEval_150.x_or_y(7919, -1, 12));
    }

    @Test
    public void test_5() {
        assertEquals(583, HumanEval_150.x_or_y(3609, 1245, 583));
    }

    @Test
    public void test_6() {
        assertEquals(129, HumanEval_150.x_or_y(91, 56, 129));
    }

    @Test
    public void test_7() {
        assertEquals(1234, HumanEval_150.x_or_y(6, 34, 1234));
    }

    @Test
    public void test_8() {
        assertEquals(0, HumanEval_150.x_or_y(1, 2, 0));
    }

    @Test
    public void test_9() {
        assertEquals(2, HumanEval_150.x_or_y(2, 2, 0));
    }

    @Test
    public void test_10() {
        assertEquals(1, HumanEval_150.x_or_y(11, 1, 0));
    }

    @Test
    public void test_11() {
        assertEquals(100, HumanEval_150.x_or_y(6, 123, 100));
    }

    @Test
    public void test_12() {
        assertEquals(9, HumanEval_150.x_or_y(2, 9, 50));
    }

    @Test
    public void test_13() {
        assertEquals(0, HumanEval_150.x_or_y(7919, 0, 14));
    }

    @Test
    public void test_14() {
        assertEquals(18, HumanEval_150.x_or_y(-101, 0, 18));
    }

    @Test
    public void test_15() {
        assertEquals(3, HumanEval_150.x_or_y(49, 0, 3));
    }

    @Test
    public void test_16() {
        assertEquals(20, HumanEval_150.x_or_y(62, 40, 20));
    }

    @Test
    public void test_17() {
        assertEquals(100, HumanEval_150.x_or_y(5, 100, 5));
    }

    @Test
    public void test_18() {
        assertEquals(3, HumanEval_150.x_or_y(1, 0, 3));
    }
} 
// End of Test
