package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_10Test {

    @Test
    public void testMakePalindrome0() {
        assertEquals("", HumanEval_10.makePalindrome(""));
    }

    @Test
    public void testMakePalindrome1() {
        assertEquals("x", HumanEval_10.makePalindrome("x"));
    }

    @Test
    public void testMakePalindrome2() {
        assertEquals("xyzyx", HumanEval_10.makePalindrome("xyz"));
    }

    @Test
    public void testMakePalindrome3() {
        assertEquals("xyx", HumanEval_10.makePalindrome("xyx"));
    }

    @Test
    public void testMakePalindrome4() {
        assertEquals("jerryrrej", HumanEval_10.makePalindrome("jerry"));
    }

    @Test
    public void testMakePalindrome5() {
        assertEquals("racecar", HumanEval_10.makePalindrome("race"));
    }

    @Test
    public void testMakePalindrome6() {
        assertEquals("level", HumanEval_10.makePalindrome("level"));
    }

    @Test
    public void testMakePalindrome7() {
        assertEquals("raracececarar", HumanEval_10.makePalindrome("raracece"));
    }

    @Test
    public void testMakePalindrome8() {
        assertEquals("raceredderecar", HumanEval_10.makePalindrome("raceredder"));
    }

    @Test
    public void testMakePalindrome9() {
        assertEquals("abacabacaba", HumanEval_10.makePalindrome("abacabacaba"));
    }

    @Test
    public void testMakePalindrome10() {
        assertEquals("rrefreracecarerferr", HumanEval_10.makePalindrome("rrefrerace"));
    }

    @Test
    public void testMakePalindrome11() {
        assertEquals("", HumanEval_10.makePalindrome(""));
    }
}

// End of Test
