package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_83Test {

    @Test
    public void testStartsOneEnds1() {
        assertEquals(1, HumanEval_83.starts_one_ends(1));
    }

    @Test
    public void testStartsOneEnds2() {
        assertEquals(18, HumanEval_83.starts_one_ends(2));
    }

    @Test
    public void testStartsOneEnds3() {
        assertEquals(180, HumanEval_83.starts_one_ends(3));
    }

    @Test
    public void testStartsOneEnds4() {
        assertEquals(1800, HumanEval_83.starts_one_ends(4));
    }

    @Test
    public void testStartsOneEnds5() {
        assertEquals(18000, HumanEval_83.starts_one_ends(5));
    }

    @Test
    public void testStartsOneEnds6() {
        assertEquals(180000, HumanEval_83.starts_one_ends(6));
    }

    @Test
    public void testStartsOneEnds10() {
        assertEquals(1800000000, HumanEval_83.starts_one_ends(10));
    }
}
// End of Test.
