package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_49Test {

    @Test
    public void testModp0() {
        assertEquals(3, HumanEval_49.modp(3, 5));
    }

    @Test
    public void testModp1() {
        assertEquals(2, HumanEval_49.modp(1101, 101));
    }

    @Test
    public void testModp2() {
        assertEquals(1, HumanEval_49.modp(0, 101));
    }

    @Test
    public void testModp3() {
        assertEquals(8, HumanEval_49.modp(3, 11));
    }

    @Test
    public void testModp4() {
        assertEquals(1, HumanEval_49.modp(100, 101));
    }

    @Test
    public void testModp5() {
        assertEquals(4, HumanEval_49.modp(30, 5));
    }
    
    @Test
    public void testModp6() {
        assertEquals(3, HumanEval_49.modp(31, 5));
    }

    @Test
    public void testModp7() {
        assertEquals(15, HumanEval_49.modp(5, 17));
    }

    @Test
    public void testModp8() {
        assertEquals(2, HumanEval_49.modp(7, 3));
    }

    @Test
    public void testModp9() {
        assertEquals(437504, HumanEval_49.modp(1000002, 1000000));
    }

    @Test
    public void testModp10() {
        assertEquals(0, HumanEval_49.modp(0, 1));
    }

    @Test
    public void testModp11() {
        assertEquals(2, HumanEval_49.modp(37, 37));
    }

    @Test
    public void testModp12() {
        assertEquals(0, HumanEval_49.modp(1, 1));
    }

    @Test
    public void testModp13() {
        assertEquals(1, HumanEval_49.modp(0, 2));
    }

    @Test
    public void testModp14() {
        assertEquals(262144, HumanEval_49.modp(1000000, 999983));
    }

    @Test
    public void testModp15() {
        assertEquals(64, HumanEval_49.modp(6, 78));
    }

    @Test
    public void testModp16() {
        assertEquals(0, HumanEval_49.modp(19, 2));
    }

    @Test
    public void testModp17() {
        assertEquals(2, HumanEval_49.modp(999983, 999983));
    }

    @Test
    public void testModp18() {
        assertEquals(54811, HumanEval_49.modp(999999, 100019));
    }
}
// End of Test
