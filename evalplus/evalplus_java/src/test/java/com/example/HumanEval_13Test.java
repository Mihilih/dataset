package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_13Test {

    @Test
    public void test_0() {
        assertEquals(1, HumanEval_13.greatestCommonDivisor(3, 7));
    }

    @Test
    public void test_1() {
        assertEquals(5, HumanEval_13.greatestCommonDivisor(10, 15));
    }

    @Test
    public void test_2() {
        assertEquals(7, HumanEval_13.greatestCommonDivisor(49, 14));
    }

    @Test
    public void test_3() {
        assertEquals(12, HumanEval_13.greatestCommonDivisor(144, 60));
    }

    @Test
    public void test_4() {
        assertEquals(50, HumanEval_13.greatestCommonDivisor(100, 50));
    }

    @Test
    public void test_5() {
        assertEquals(9, HumanEval_13.greatestCommonDivisor(123456789, 987654321));
    }

    @Test
    public void test_6() {
        assertEquals(1, HumanEval_13.greatestCommonDivisor(100, 27));
    }

    @Test
    public void test_7() {
        assertEquals(540, HumanEval_13.greatestCommonDivisor(540, 540));
    }

    @Test
    public void test_8() {
        assertEquals(1, HumanEval_13.greatestCommonDivisor(2147483647, 1));
    }

    @Test
    public void test_9() {
        assertEquals(1, HumanEval_13.greatestCommonDivisor(191, 1000000000));
    }
}
// End of Test
