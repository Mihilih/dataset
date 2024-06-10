package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_140Test {

    @Test
    public void testFixSpaces0() {
        assertEquals("Example", HumanEval_140.fixSpaces("Example"));
    }

    @Test
    public void testFixSpaces1() {
        assertEquals("Mudasir_Hanif_", HumanEval_140.fixSpaces("Mudasir Hanif "));
    }

    @Test
    public void testFixSpaces2() {
        assertEquals("Yellow_Yellow__Dirty__Fellow", HumanEval_140.fixSpaces("Yellow Yellow  Dirty  Fellow"));
    }

    @Test
    public void testFixSpaces3() {
        assertEquals("Exa-mple", HumanEval_140.fixSpaces("Exa   mple"));
    }

    @Test
    public void testFixSpaces4() {
        assertEquals("-Exa_1_2_2_mple", HumanEval_140.fixSpaces("   Exa 1 2 2 mple"));
    }

    @Test
    public void testFixSpaces5() {
        assertEquals("Hello,-world!", HumanEval_140.fixSpaces("Hello,   world!"));
    }

    @Test
    public void testFixSpaces6() {
        assertEquals("-", HumanEval_140.fixSpaces("    "));
    }

    @Test
    public void testFixSpaces7() {
        assertEquals("Thish_isThis_is__a_Hello_r__World_tsTesting-1__2-3_a__This_is__a_ssttesst", HumanEval_140.fixSpaces("Thish isThis is  a Hello r  World tsTesting     1  2   3 a  This is  a ssttesst"));
    }

    @Test
    public void testFixSpaces8() {
        assertEquals("Testing-1__2-3", HumanEval_140.fixSpaces("Testing     1  2   3"));
    }

    @Test
    public void testFixSpaces9() {
        assertEquals("-", HumanEval_140.fixSpaces("          "));
    }
} // End of Test
