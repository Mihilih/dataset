package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_54Test {
    
    @Test
    public void testSameChars_0() {
        assertTrue(HumanEval_54.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc"));
    }

    @Test
    public void testSameChars_1() {
        assertTrue(HumanEval_54.sameChars("abcd", "dddddddabc"));
    }

    @Test
    public void testSameChars_2() {
        assertTrue(HumanEval_54.sameChars("dddddddabc", "abcd"));
    }

    @Test
    public void testSameChars_3() {
        assertFalse(HumanEval_54.sameChars("eabcd", "dddddddabc"));
    }

    @Test
    public void testSameChars_4() {
        assertFalse(HumanEval_54.sameChars("abcd", "dddddddabcf"));
    }

    @Test
    public void testSameChars_5() {
        assertFalse(HumanEval_54.sameChars("eabcdzzzz", "dddzzzzzzzddddabc"));
    }

    @Test
    public void testSameChars_6() {
        assertFalse(HumanEval_54.sameChars("aabb", "aaccc"));
    }

    @Test
    public void testSameChars_7() {
        assertFalse(HumanEval_54.sameChars("ab", "cd"));
    }

    @Test
    public void testSameChars_8() {
        assertTrue(HumanEval_54.sameChars("123445", "5143241"));
    }

    @Test
    public void testSameChars_9() {
        assertFalse(HumanEval_54.sameChars("ZYXWVUTSRQPONMLKJIHGFEDCBA", "ZjumpsYXWVUTSRQPONMLKJIHGFEDCBA"));
    }

    @Test
    public void testSameChars_10() {
        assertFalse(HumanEval_54.sameChars("123445", ""));
    }

    @Test
    public void testSameChars_11() {
        assertFalse(HumanEval_54.sameChars("foStrongrce", "gazelle!own"));
    }

    @Test
    public void testSameChars_12() {
        assertTrue(HumanEval_54.sameChars("12345607890", "0987654321"));
    }

    @Test
    public void testSameChars_13() {
        assertFalse(HumanEval_54.sameChars("524321", "5432"));
    }

    @Test
    public void testSameChars_14() {
        assertFalse(HumanEval_54.sameChars("ZeZeZeZeZeZeZeZeZeZeZeZeZeZ,eZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZe", "ZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZeZe"));
    }

    @Test
    public void testSameChars_15() {
        assertFalse(HumanEval_54.sameChars("", "the"));
    }
}
// End of Test

