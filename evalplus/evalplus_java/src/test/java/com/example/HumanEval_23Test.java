package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_23Test {
    @Test
    public void testStrlen0() {
        assertEquals(0, HumanEval_23.strlen(""));
    }

    @Test
    public void testStrlen1() {
        assertEquals(1, HumanEval_23.strlen("x"));
    }

    @Test
    public void testStrlen2() {
        assertEquals(9, HumanEval_23.strlen("asdasnakj"));
    }

    @Test
    public void testStrlen3() {
        assertEquals(51, HumanEval_23.strlen("  \r  \n   àèì t   1t  The    òõùáéíóúýâêîôûãñõäëïöüÿ"));
    }

    @Test
    public void testStrlen4() {
        assertEquals(0, HumanEval_23.strlen(""));
    }

    @Test
    public void testStrlen5() {
        assertEquals(26, HumanEval_23.strlen("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testStrlen6() {
        assertEquals(13, HumanEval_23.strlen("Hello, World!"));
    }

    @Test
    public void testStrlen7() {
        assertEquals(1, HumanEval_23.strlen(" "));
    }
}
// End of Test
