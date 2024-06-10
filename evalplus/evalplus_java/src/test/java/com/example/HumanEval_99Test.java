package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_99Test {

    @Test
    public void testClosestInteger_0() {
        assertEquals(10, HumanEval_99.closestInteger("10"));
    }

    @Test
    public void testClosestInteger_1() {
        assertEquals(15, HumanEval_99.closestInteger("14.5"));
    }

    @Test
    public void testClosestInteger_2() {
        assertEquals(-16, HumanEval_99.closestInteger("-15.5"));
    }

    @Test
    public void testClosestInteger_3() {
        assertEquals(15, HumanEval_99.closestInteger("15.3"));
    }

    @Test
    public void testClosestInteger_4() {
        assertEquals(0, HumanEval_99.closestInteger("0"));
    }

    @Test
    public void testClosestInteger_5() {
        assertEquals(6, HumanEval_99.closestInteger("5.5"));
    }

    @Test
    public void testClosestInteger_6() {
        assertEquals(-3, HumanEval_99.closestInteger("-2.8"));
    }

    @Test
    public void testClosestInteger_7() {
        assertEquals(-7, HumanEval_99.closestInteger("-6.5"));
    }

    @Test
    public void testClosestInteger_8() {
        assertEquals(1, HumanEval_99.closestInteger("0.5"));
    }

    @Test
    public void testClosestInteger_9() {
        assertEquals(-51, HumanEval_99.closestInteger("-51.27890000000001"));
    }

    @Test
    public void testClosestInteger_10() {
//        assertEquals(1000000000000000049861653971908893017010268485438462151574892930611988399099305815384459015356416L, HumanEval_99.closestInteger("1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
    }

    @Test
    public void testClosestInteger_11() {
        assertEquals(11, HumanEval_99.closestInteger("11."));
    }
}
// End of Test
