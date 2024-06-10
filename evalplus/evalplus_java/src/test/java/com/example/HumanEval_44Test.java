package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_44;

public class HumanEval_44Test {

    @Test
    public void testChangeBase0() {
        assertEquals("22", HumanEval_44.changeBase(8, 3));
    }

    @Test
    public void testChangeBase1() {
        assertEquals("100", HumanEval_44.changeBase(9, 3));
    }

    @Test
    public void testChangeBase2() {
        assertEquals("11101010", HumanEval_44.changeBase(234, 2));
    }

    @Test
    public void testChangeBase3() {
        assertEquals("10000", HumanEval_44.changeBase(16, 2));
    }

    @Test
    public void testChangeBase4() {
        assertEquals("1000", HumanEval_44.changeBase(8, 2));
    }

    @Test
    public void testChangeBase5() {
        assertEquals("111", HumanEval_44.changeBase(7, 2));
    }

    @Test
    public void testChangeBase6() {
        assertEquals("2", HumanEval_44.changeBase(2, 3));
    }

    @Test
    public void testChangeBase7() {
        assertEquals("3", HumanEval_44.changeBase(3, 4));
    }

    @Test
    public void testChangeBase8() {
        assertEquals("4", HumanEval_44.changeBase(4, 5));
    }

    @Test
    public void testChangeBase9() {
        assertEquals("5", HumanEval_44.changeBase(5, 6));
    }

    @Test
    public void testChangeBase10() {
        assertEquals("6", HumanEval_44.changeBase(6, 7));
    }

    @Test
    public void testChangeBase11() {
        assertEquals("7", HumanEval_44.changeBase(7, 8));
    }

    @Test
    public void testChangeBase12() {
        assertEquals("20", HumanEval_44.changeBase(10, 5));
    }

    @Test
    public void testChangeBase13() {
        assertEquals("0", HumanEval_44.changeBase(0, 3));
    }

    @Test
    public void testChangeBase14() {
        assertEquals("100", HumanEval_44.changeBase(25, 5));
    }

    @Test
    public void testChangeBase15() {
        assertEquals("20", HumanEval_44.changeBase(8, 4));
    }

    @Test
    public void testChangeBase16() {
        assertEquals("10111000001111100111011101", HumanEval_44.changeBase(48298461, 2));
    }

    @Test
    public void testChangeBase17() {
        assertEquals("2", HumanEval_44.changeBase(2, 3));
    }

}
// End of Test
