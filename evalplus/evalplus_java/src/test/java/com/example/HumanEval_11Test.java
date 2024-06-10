package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_11Test {

    @Test
    public void testStringXor0() {
        assertEquals("010010", HumanEval_11.stringXor("111000", "101010"));
    }

    @Test
    public void testStringXor1() {
        assertEquals("0", HumanEval_11.stringXor("1", "1"));
    }

    @Test
    public void testStringXor2() {
        assertEquals("0101", HumanEval_11.stringXor("0101", "0000"));
    }

    @Test
    public void testStringXor3() {
        assertEquals("000", HumanEval_11.stringXor("000", "000"));
    }

    @Test
    public void testStringXor4() {
        assertEquals("0000", HumanEval_11.stringXor("1111", "1111"));
    }

    @Test
    public void testStringXor5() {
        assertEquals("0011100010001010", HumanEval_11.stringXor("0101100000100000", "0110000010101010"));
    }

    @Test
    public void testStringXor6() {
        assertEquals("", HumanEval_11.stringXor("", ""));
    }

    @Test
    public void testStringXor7() {
        assertEquals("111", HumanEval_11.stringXor("111", "000"));
    }
    
}
// End of Test
