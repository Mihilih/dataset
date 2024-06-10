package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_72Test {
    @Test
    public void test_0() {
        assertTrue(HumanEval_72.willItFly(new int[]{3, 2, 3}, 9));
    }

    @Test
    public void test_1() {
        assertFalse(HumanEval_72.willItFly(new int[]{1, 2}, 5));
    }

    @Test
    public void test_2() {
        assertTrue(HumanEval_72.willItFly(new int[]{3}, 5));
    }

    @Test
    public void test_3() {
        assertFalse(HumanEval_72.willItFly(new int[]{3, 2, 3}, 1));
    }

    @Test
    public void test_4() {
        assertFalse(HumanEval_72.willItFly(new int[]{1, 2, 3}, 6));
    }

    @Test
    public void test_5() {
        assertTrue(HumanEval_72.willItFly(new int[]{5}, 5));
    }

    @Test
    public void test_6() {
        assertTrue(HumanEval_72.willItFly(new int[]{1, 2, 1}, 4));
    }

    @Test
    public void test_7() {
        assertFalse(HumanEval_72.willItFly(new int[]{1, 2, 3}, 10));
    }

    @Test
    public void test_8() {
        assertFalse(HumanEval_72.willItFly(new int[]{2, 2, 1, 0, 2, 2}, 30));
    }

    @Test
    public void test_9() {
        assertTrue(HumanEval_72.willItFly(new int[]{1, 2, 3, 2, 1}, 10));
    }

    @Test
    public void test_10() {
        assertTrue(HumanEval_72.willItFly(new int[]{}, 0));
    }

    @Test
    public void test_11() {
        assertFalse(HumanEval_72.willItFly(new int[]{1}, 0));
    }

    @Test
    public void test_12() {
        assertFalse(HumanEval_72.willItFly(new int[]{4, 2, 1, 2, 4}, 12));
    }

    @Test
    public void test_13() {
        assertFalse(HumanEval_72.willItFly(new int[]{14, 1}, 83));
    }

    @Test
    public void test_14() {
        assertTrue(HumanEval_72.willItFly(new int[]{4, 2, 1, 2, 4}, 13));
    }

    @Test
    public void test_15() {
        assertFalse(HumanEval_72.willItFly(new int[]{1, -1, 0}, 0));
    }

    @Test
    public void test_16() {
        assertTrue(HumanEval_72.willItFly(new int[]{0}, 0));
    }

    @Test
    public void test_17() {
        assertFalse(HumanEval_72.willItFly(new int[]{1}, -1));
    }
}
// End of Test

