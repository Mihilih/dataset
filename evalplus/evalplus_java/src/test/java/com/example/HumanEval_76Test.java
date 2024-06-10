package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_76Test {
    @Test
    public void test_0() {
        assertTrue(HumanEval_76.is_simple_power(16, 2));
    }

    @Test
    public void test_1() {
        assertFalse(HumanEval_76.is_simple_power(143214, 16));
    }

    @Test
    public void test_2() {
        assertTrue(HumanEval_76.is_simple_power(4, 2));
    }

    @Test
    public void test_3() {
        assertTrue(HumanEval_76.is_simple_power(9, 3));
    }

    @Test
    public void test_4() {
        assertTrue(HumanEval_76.is_simple_power(16, 4));
    }

    @Test
    public void test_5() {
        assertFalse(HumanEval_76.is_simple_power(24, 2));
    }

    @Test
    public void test_6() {
        assertFalse(HumanEval_76.is_simple_power(128, 4));
    }

    @Test
    public void test_7() {
        assertFalse(HumanEval_76.is_simple_power(12, 6));
    }

    @Test
    public void test_8() {
        assertTrue(HumanEval_76.is_simple_power(1, 1));
    }

    @Test
    public void test_9() {
        assertTrue(HumanEval_76.is_simple_power(1, 12));
    }

    @Test
    public void test_10() {
        assertTrue(HumanEval_76.is_simple_power(25, 5));
    }

    @Test
    public void test_11() {
        assertFalse(HumanEval_76.is_simple_power(10, 2));
    }

    @Test
    public void test_12() {
        assertTrue(HumanEval_76.is_simple_power(5, 5));
    }

    @Test
    public void test_13() {
        assertFalse(HumanEval_76.is_simple_power(82, 1));
    }

    @Test
    public void test_14() {
        assertTrue(HumanEval_76.is_simple_power(1, 1));
    }

    @Test
    public void test_15() {
        assertFalse(HumanEval_76.is_simple_power(-1, 0));
    }

    @Test
    public void test_16() {
        assertFalse(HumanEval_76.is_simple_power(2, 1));
    }

    @Test
    public void test_17() {
        assertTrue(HumanEval_76.is_simple_power(-2, -2));
    }

    @Test
    public void test_18() {
        assertTrue(HumanEval_76.is_simple_power(0, 0));
    }

    @Test
    public void test_19() {
        assertTrue(HumanEval_76.is_simple_power(125, 5));
    }

    @Test
    public void test_20() {
//        assertFalse(HumanEval_76.is_simple_power(4722366482869645213696, 1099511627776));
    }

    @Test
    public void test_21() {
        assertTrue(HumanEval_76.is_simple_power(1, 4));
    }

    @Test
    public void test_22() {
        assertFalse(HumanEval_76.is_simple_power(15, 3));
    }

    @Test
    public void test_23() {
        assertTrue(HumanEval_76.is_simple_power(16777216, 4));
    }

    @Test
    public void test_24() {
        assertTrue(HumanEval_76.is_simple_power(16, -2));
    }
} // End of Test
