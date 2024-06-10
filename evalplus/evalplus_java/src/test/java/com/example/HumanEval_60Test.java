package com.example;
import org.junit.*;
import static org.junit.Assert.*;

public class HumanEval_60Test {
    @Test
    public void test_0() {
        assertEquals(1, HumanEval_60.sum_to_n(1));
    }

    @Test
    public void test_1() {
        assertEquals(21, HumanEval_60.sum_to_n(6));
    }

    @Test
    public void test_2() {
        assertEquals(66, HumanEval_60.sum_to_n(11));
    }

    @Test
    public void test_3() {
        assertEquals(465, HumanEval_60.sum_to_n(30));
    }

    @Test
    public void test_4() {
        assertEquals(5050, HumanEval_60.sum_to_n(100));
    }

    @Test
    public void test_5() {
        assertEquals(3, HumanEval_60.sum_to_n(2));
    }

    @Test
    public void test_6() {
        assertEquals(500000500000L, HumanEval_60.sum_to_n(1000000));
    }

    @Test
    public void test_7() {
        assertEquals(499997500003L, HumanEval_60.sum_to_n(999997));
    }

    @Test
    public void test_8() {
        assertEquals(500006500021L, HumanEval_60.sum_to_n(1000006));
    }

    @Test
    public void test_9() {
        assertEquals(499999500000L, HumanEval_60.sum_to_n(999999));
    }

    @Test
    public void test_10() {
        assertEquals(6, HumanEval_60.sum_to_n(3));
    }

    @Test
    public void test_11() {
        assertEquals(500004500010L, HumanEval_60.sum_to_n(1000004));
    }

    @Test
    public void test_12() {
        assertEquals(500001500001L, HumanEval_60.sum_to_n(1000001));
    }

    @Test
    public void test_13() {
        assertEquals(500003500006L, HumanEval_60.sum_to_n(1000003));
    }

    @Test
    public void test_14() {
        assertEquals(499996500006L, HumanEval_60.sum_to_n(999996));
    }

    @Test
    public void test_15() {
        assertEquals(500005500015L, HumanEval_60.sum_to_n(1000005));
    }

    @Test
    public void test_16() {
        assertEquals(500002500003L, HumanEval_60.sum_to_n(1000002));
    }

    @Test
    public void test_17() {
        assertEquals(499998500001L, HumanEval_60.sum_to_n(999998));
    }
}
// End of Test
