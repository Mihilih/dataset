package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_144Test {

    @Test
    public void testSimplify1() {
        assertTrue(HumanEval_144.simplify("1/5", "5/1"));
    }

    @Test
    public void testSimplify2() {
        assertFalse(HumanEval_144.simplify("1/6", "2/1"));
    }

    @Test
    public void testSimplify3() {
        assertTrue(HumanEval_144.simplify("5/1", "3/1"));
    }

    @Test
    public void testSimplify4() {
        assertFalse(HumanEval_144.simplify("7/10", "10/2"));
    }

    @Test
    public void testSimplify5() {
        assertTrue(HumanEval_144.simplify("2/10", "50/10"));
    }

    @Test
    public void testSimplify6() {
        assertTrue(HumanEval_144.simplify("7/2", "4/2"));
    }

    @Test
    public void testSimplify7() {
        assertTrue(HumanEval_144.simplify("11/6", "6/1"));
    }

    @Test
    public void testSimplify8() {
        assertFalse(HumanEval_144.simplify("2/3", "5/2"));
    }

    @Test
    public void testSimplify9() {
        assertFalse(HumanEval_144.simplify("5/2", "3/5"));
    }

    @Test
    public void testSimplify10() {
        assertTrue(HumanEval_144.simplify("2/4", "8/4"));
    }

    @Test
    public void testSimplify11() {
        assertTrue(HumanEval_144.simplify("2/4", "4/2"));
    }

    @Test
    public void testSimplify12() {
        assertTrue(HumanEval_144.simplify("1/5", "5/1"));
    }

    @Test
    public void testSimplify13() {
        assertFalse(HumanEval_144.simplify("1/5", "1/5"));
    }

    @Test
    public void testSimplify14() {
        assertTrue(HumanEval_144.simplify("3/4", "4/3"));
    }

    @Test
    public void testSimplify15() {
        assertTrue(HumanEval_144.simplify("8/3", "33/2"));
    }

    @Test
    public void testSimplify16() {
        assertFalse(HumanEval_144.simplify("9999/010", "176/9"));
    }

    @Test
    public void testSimplify17() {
        assertTrue(HumanEval_144.simplify("999999/1", "1/999999"));
    }

    @Test
    public void testSimplify18() {
        assertFalse(HumanEval_144.simplify("12/9", "12/9"));
    }

    @Test
    public void testSimplify19() {
        assertFalse(HumanEval_144.simplify("999999999/1", "1/1000000000"));
    }

    @Test
    public void testSimplify20() {
        assertTrue(HumanEval_144.simplify("8/3", "468/6"));
    }

    @Test
    public void testSimplify21() {
        assertFalse(HumanEval_144.simplify("5597/275775", "380/241"));
    }
}
// End of Test
