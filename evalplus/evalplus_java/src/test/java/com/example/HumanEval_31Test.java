package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_31Test {

    @Test
    public void testIsPrime_0() {
        assertEquals(false, HumanEval_31.isPrime(6));
    }

    @Test
    public void testIsPrime_1() {
        assertEquals(true, HumanEval_31.isPrime(101));
    }

    @Test
    public void testIsPrime_2() {
        assertEquals(true, HumanEval_31.isPrime(11));
    }

    @Test
    public void testIsPrime_3() {
        assertEquals(false, HumanEval_31.isPrime(13441));
    }

    @Test
    public void testIsPrime_4() {
        assertEquals(true, HumanEval_31.isPrime(61));
    }

    @Test
    public void testIsPrime_5() {
        assertEquals(false, HumanEval_31.isPrime(4));
    }

    @Test
    public void testIsPrime_6() {
        assertEquals(false, HumanEval_31.isPrime(1));
    }

    @Test
    public void testIsPrime_7() {
        assertEquals(true, HumanEval_31.isPrime(5));
    }

    @Test
    public void testIsPrime_8() {
        assertEquals(true, HumanEval_31.isPrime(11));
    }

    @Test
    public void testIsPrime_9() {
        assertEquals(true, HumanEval_31.isPrime(17));
    }

    @Test
    public void testIsPrime_10() {
        assertEquals(false, HumanEval_31.isPrime(85));
    }

    @Test
    public void testIsPrime_11() {
        assertEquals(false, HumanEval_31.isPrime(77));
    }

    @Test
    public void testIsPrime_12() {
        assertEquals(false, HumanEval_31.isPrime(255379));
    }

    @Test
    public void testIsPrime_13() {
        assertEquals(true, HumanEval_31.isPrime(31));
    }

    @Test
    public void testIsPrime_14() {
        assertEquals(false, HumanEval_31.isPrime(1234567));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPrime_15() {
        HumanEval_31.isPrime(-5);
    }

    @Test
    public void testIsPrime_16() {
        assertEquals(false, HumanEval_31.isPrime(4));
    }

    @Test
    public void testIsPrime_17() {
        assertEquals(true, HumanEval_31.isPrime(2));
    }

    @Test
    public void testIsPrime_18() {
        assertEquals(false, HumanEval_31.isPrime(1));
    }

    @Test
    public void testIsPrime_19() {
//        assertEquals(false, HumanEval_31.isPrime(10000000029));
    }

    @Test
    public void testIsPrime_20() {
        assertEquals(true, HumanEval_31.isPrime(9999991));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPrime_21() {
        HumanEval_31.isPrime(-1);
    }

    @Test
    public void testIsPrime_22() {
        assertEquals(true, HumanEval_31.isPrime(3));
    }

    @Test
    public void testIsPrime_23() {
        assertEquals(false, HumanEval_31.isPrime(15));
    }

    @Test
    public void testIsPrime_24() {
        assertEquals(false, HumanEval_31.isPrime(25));
    }

    @Test
    public void testIsPrime_25() {
        assertEquals(false, HumanEval_31.isPrime(10));
    }

    @Test
    public void testIsPrime_26() {
        assertEquals(true, HumanEval_31.isPrime(5));
    }

    @Test
    public void testIsPrime_27() {
        assertEquals(false, HumanEval_31.isPrime(91));
    }
}
// End of Test
