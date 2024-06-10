package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_86Test {

    @Test
    public void testAntiShuffle1() {
        assertEquals("Hi", HumanEval_86.antiShuffle("Hi"));
    }

    @Test
    public void testAntiShuffle2() {
        assertEquals("ehllo", HumanEval_86.antiShuffle("hello"));
    }

    @Test
    public void testAntiShuffle3() {
        assertEquals("bemnru", HumanEval_86.antiShuffle("number"));
    }

    @Test
    public void testAntiShuffle4() {
        assertEquals("abcd", HumanEval_86.antiShuffle("abcd"));
    }

    @Test
    public void testAntiShuffle5() {
        assertEquals("Hello !!!Wdlor", HumanEval_86.antiShuffle("Hello World!!!"));
    }

    @Test
    public void testAntiShuffle6() {
        assertEquals("", HumanEval_86.antiShuffle(""));
    }

    @Test
    public void testAntiShuffle7() {
        assertEquals(".Hi My aemn is Meirst .Rboot How aer ?ouy", HumanEval_86.antiShuffle("Hi. My name is Mister Robot. How are you?"));
    }

    @Test
    public void testAntiShuffle8() {
        assertEquals("12345", HumanEval_86.antiShuffle("12345"));
    }

    @Test
    public void testAntiShuffle9() {
        assertEquals("\n\n123 \n\n456789", HumanEval_86.antiShuffle("\n\n123 456\n789\n"));
    }

    @Test
    public void testAntiShuffle10() {
        assertEquals(" \t\nG HTeh I      ", HumanEval_86.antiShuffle(" \t\nG TheH I      "));
    }

    @Test
    public void testAntiShuffle11() {
        assertEquals("", HumanEval_86.antiShuffle(""));
    }
}
// End of Test
