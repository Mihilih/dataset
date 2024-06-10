package com.example;



import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_154Test {
  
    @Test
    public void test_0() {
        assertFalse(HumanEval_154.cycpattern_check("xyzw", "xyw"));
    }
    
    @Test
    public void test_1() {
        assertTrue(HumanEval_154.cycpattern_check("yello", "ell"));
    }
    
    @Test
    public void test_2() {
        assertFalse(HumanEval_154.cycpattern_check("whattup", "ptut"));
    }

    @Test
    public void test_3() {
        assertTrue(HumanEval_154.cycpattern_check("efef", "fee"));
    }

    @Test
    public void test_4() {
        assertFalse(HumanEval_154.cycpattern_check("abab", "aabb"));
    }

    @Test
    public void test_5() {
        assertTrue(HumanEval_154.cycpattern_check("winemtt", "tinem"));
    }

    @Test
    public void test_6() {
        assertFalse(HumanEval_154.cycpattern_check("hello", "olelh"));
    }

    @Test
    public void test_7() {
        assertTrue(HumanEval_154.cycpattern_check("coffee", "ffeco"));
    }

    @Test
    public void test_8() {
        assertTrue(HumanEval_154.cycpattern_check("mississipi", "mississipi"));
    }

    @Test
    public void test_9() {
        assertTrue(HumanEval_154.cycpattern_check("racanagramecar", ""));
    }

    @Test
    public void test_10() {
        assertTrue(HumanEval_154.cycpattern_check("abcdefg", "cde"));
    }

    @Test
    public void test_11() {
        assertTrue(HumanEval_154.cycpattern_check("programming", "ammiprogr"));
    }

    @Test
    public void test_12() {
        assertFalse(HumanEval_154.cycpattern_check("manipation", "ationmani"));
    }

    @Test
    public void test_13() {
        assertTrue(HumanEval_154.cycpattern_check("", ""));
    }

    @Test
    public void test_14() {
        assertFalse(HumanEval_154.cycpattern_check("mississispi", "mississispii"));
    }

    @Test
    public void test_15() {
        assertFalse(HumanEval_154.cycpattern_check("anagram", "margana"));
    }
}

//End of Test
