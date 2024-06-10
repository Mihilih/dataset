package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_48Test {

    @Test
    public void testIsPalindrome_0() {
        assertTrue(HumanEval_48.isPalindrome(""));
    }

    @Test
    public void testIsPalindrome_1() {
        assertTrue(HumanEval_48.isPalindrome("aba"));
    }

    @Test
    public void testIsPalindrome_2() {
        assertTrue(HumanEval_48.isPalindrome("aaaaa"));
    }

    @Test
    public void testIsPalindrome_3() {
        assertFalse(HumanEval_48.isPalindrome("zbcd"));
    }

    @Test
    public void testIsPalindrome_4() {
        assertTrue(HumanEval_48.isPalindrome("xywyx"));
    }

    @Test
    public void testIsPalindrome_5() {
        assertFalse(HumanEval_48.isPalindrome("xywyz"));
    }

    @Test
    public void testIsPalindrome_6() {
        assertFalse(HumanEval_48.isPalindrome("xywzx"));
    }

    @Test
    public void testIsPalindrome_7() {
        assertTrue(HumanEval_48.isPalindrome("racecar"));
    }

    @Test
    public void testIsPalindrome_8() {
        assertFalse(HumanEval_48.isPalindrome("ab"));
    }

    @Test
    public void testIsPalindrome_9() {
        assertFalse(HumanEval_48.isPalindrome("12zZ21"));
    }

    @Test
    public void testIsPalindrome_10() {
        assertTrue(HumanEval_48.isPalindrome("step on no pets"));
    }

    @Test
    public void testIsPalindrome_11() {
        assertTrue(HumanEval_48.isPalindrome("SS"));
    }

    @Test
    public void testIsPalindrome_12() {
        assertFalse(HumanEval_48.isPalindrome("never odd or even"));
    }

    @Test
    public void testIsPalindrome_13() {
        assertTrue(HumanEval_48.isPalindrome(""));
    }

    @Test
    public void testIsPalindrome_14() {
        assertTrue(HumanEval_48.isPalindrome(" "));
    }

    @Test
    public void testIsPalindrome_15() {
        assertFalse(HumanEval_48.isPalindrome("Step on no pets"));
    }

    @Test
    public void testIsPalindrome_16() {
        assertTrue(HumanEval_48.isPalindrome("S"));
    }
}
// End of Test
