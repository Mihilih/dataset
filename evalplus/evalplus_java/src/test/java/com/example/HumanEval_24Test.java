package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_24;

public class HumanEval_24Test {

    @Test
    public void test_0() {
        assertEquals(1, HumanEval_24.largestDivisor(3));
    }

    @Test
    public void test_1() {
        assertEquals(1, HumanEval_24.largestDivisor(7));
    }

    @Test
    public void test_2() {
        assertEquals(5, HumanEval_24.largestDivisor(10));
    }

    @Test
    public void test_3() {
        assertEquals(50, HumanEval_24.largestDivisor(100));
    }

    @Test
    public void test_4() {
        assertEquals(7, HumanEval_24.largestDivisor(49));
    }

    @Test
    public void test_5() {
        assertEquals(9, HumanEval_24.largestDivisor(27));
    }

    @Test
    public void test_6() {
        assertEquals(1, HumanEval_24.largestDivisor(101));
    }

    @Test
    public void test_7() {
        assertEquals(250, HumanEval_24.largestDivisor(500));
    }

    @Test
    public void test_8() {
        assertEquals(94967, HumanEval_24.largestDivisor(1234571));
    }

    @Test
    public void test_9() {
        assertEquals(9721, HumanEval_24.largestDivisor(1234567));
    }

    @Test
    public void test_10() {
        assertEquals(617285, HumanEval_24.largestDivisor(1234570));
    }

    @Test
    public void test_11() {
        assertEquals(246913, HumanEval_24.largestDivisor(1234565));
    }

    @Test
    public void test_12() {
        assertEquals(7, HumanEval_24.largestDivisor(35));
    }

    @Test
    public void test_13() {
        assertEquals(617283, HumanEval_24.largestDivisor(1234566));
    }

    @Test
    public void test_14() {
        assertEquals(411523, HumanEval_24.largestDivisor(1234569));
    }

    @Test
    public void test_15() {
        assertEquals(617286, HumanEval_24.largestDivisor(1234572));
    }

    @Test
    public void test_16() {
        assertEquals(1, HumanEval_24.largestDivisor(2));
    }
}
// End of Test
