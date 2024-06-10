package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_134Test {
    @Test
    public void testCheckIfLastCharIsALetter_0() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("apple"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_1() {
        assertTrue(HumanEval_134.checkIfLastCharIsALetter("apple pi e"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_2() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("eeeee"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_3() {
        assertTrue(HumanEval_134.checkIfLastCharIsALetter("A"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_4() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("Pumpkin pie "));
    }
    @Test
    public void testCheckIfLastCharIsALetter_5() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("Pumpkin pie 1"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_6() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter(""));
    }
    @Test
    public void testCheckIfLastCharIsALetter_7() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("eeeee e "));
    }
    @Test
    public void testCheckIfLastCharIsALetter_8() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("apple pie"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_9() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("apple pi e "));
    }
    @Test
    public void testCheckIfLastCharIsALetter_10() {
        assertTrue(HumanEval_134.checkIfLastCharIsALetter("Pumpkin pi e"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_11() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("!"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_12() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter(""));
    }
    @Test
    public void testCheckIfLastCharIsALetter_13() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("pi"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_14() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("aaaaa 1"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_15() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("ap"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_16() {
        assertTrue(HumanEval_134.checkIfLastCharIsALetter("t"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_17() {
        assertTrue(HumanEval_134.checkIfLastCharIsALetter("aaaaaa A"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_18() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("applApple $%appple pitie!^pieefavoritequickapple pifoox\ne"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_19() {
        assertTrue(HumanEval_134.checkIfLastCharIsALetter("pUMPcake?blueberrymufufinc!KPIEPulmpkin pi e"));
    }
    @Test
    public void testCheckIfLastCharIsALetter_20() {
        assertFalse(HumanEval_134.checkIfLastCharIsALetter("k "));
    }
}
// End of Test
