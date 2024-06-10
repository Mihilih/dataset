package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_75Test {

    @Test
    public void testIsMultiplyPrime_0() {
        assertFalse(HumanEval_75.isMultiplyPrime(5));
    }

    @Test
    public void testIsMultiplyPrime_1() {
        assertTrue(HumanEval_75.isMultiplyPrime(30));
    }

    @Test
    public void testIsMultiplyPrime_2() {
        assertTrue(HumanEval_75.isMultiplyPrime(8));
    }

    @Test
    public void testIsMultiplyPrime_3() {
        assertFalse(HumanEval_75.isMultiplyPrime(10));
    }

    @Test
    public void testIsMultiplyPrime_4() {
        assertFalse(HumanEval_75.isMultiplyPrime(33));
    }

    @Test
    public void testIsMultiplyPrime_5() {
        assertFalse(HumanEval_75.isMultiplyPrime(-98));
    }

    @Test
    public void testIsMultiplyPrime_6() {
        assertFalse(HumanEval_75.isMultiplyPrime(2));
    }

    @Test
    public void testIsMultiplyPrime_7() {
        assertTrue(HumanEval_75.isMultiplyPrime(98));
    }

    @Test
    public void testIsMultiplyPrime_8() {
        assertTrue(HumanEval_75.isMultiplyPrime(99));
    }

    @Test
    public void testIsMultiplyPrime_9() {
        assertFalse(HumanEval_75.isMultiplyPrime(-56));
    }
}
// End of Test
