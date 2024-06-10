package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_51Test {
    @Test
    public void testRemoveVowels1() {
        assertEquals("", HumanEval_51.removeVowels(""));
    }
    
    @Test
    public void testRemoveVowels2() {
        assertEquals("bcdf\nghjklm", HumanEval_51.removeVowels("abcdef\nghijklm"));
    }

    @Test
    public void testRemoveVowels3() {
        assertEquals("fdcb", HumanEval_51.removeVowels("fedcba"));
    }

    @Test
    public void testRemoveVowels4() {
        assertEquals("", HumanEval_51.removeVowels("eeeee"));
    }

    @Test
    public void testRemoveVowels5() {
        assertEquals("cB", HumanEval_51.removeVowels("acBAA"));
    }

    @Test
    public void testRemoveVowels6() {
        assertEquals("cB", HumanEval_51.removeVowels("EcBOO"));
    }

    @Test
    public void testRemoveVowels7() {
        assertEquals("ybcd", HumanEval_51.removeVowels("ybcd"));
    }

    @Test
    public void testRemoveVowels8() {
        assertEquals("hll", HumanEval_51.removeVowels("hello"));
    }

    @Test
    public void testRemoveVowels9() {
        assertEquals("CX", HumanEval_51.removeVowels("CX"));
    }

    @Test
    public void testRemoveVowels10() {
        assertEquals("Th qck brwn ybcd\n\n\n\nfghjklmnpqrstvwxyzHd.lHlfx jmps vr th lzyg.", HumanEval_51.removeVowels("The quick brown AEEIayoubcd\n\n\n\nefghijklmnopqrstuvwxyzOUaeHdo.elHlofox jumps over the lazyog."));
    }

    @Test
    public void testRemoveVowels11() {
        assertEquals("\n", HumanEval_51.removeVowels("\n"));
    }

    @Test
    public void testRemoveVowels12() {
        assertEquals("", HumanEval_51.removeVowels("a"));
    }
}
// End of Test
