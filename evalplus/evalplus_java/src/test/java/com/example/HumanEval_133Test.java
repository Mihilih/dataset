package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_133Test {

    @Test
    public void testSumSquares0() {
        assertEquals(14, HumanEval_133.sumSquares(new double[]{1, 2, 3}));
    }

    @Test
    public void testSumSquares1() {
        assertEquals(14, HumanEval_133.sumSquares(new double[]{1.0, 2, 3}));
    }

    @Test
    public void testSumSquares2() {
        assertEquals(84, HumanEval_133.sumSquares(new double[]{1, 3, 5, 7}));
    }

    @Test
    public void testSumSquares3() {
        assertEquals(29, HumanEval_133.sumSquares(new double[]{1.4, 4.2, 0}));
    }

    @Test
    public void testSumSquares4() {
        assertEquals(6, HumanEval_133.sumSquares(new double[]{-2.4, 1, 1}));
    }

    @Test
    public void testSumSquares5() {
        assertEquals(10230, HumanEval_133.sumSquares(new double[]{100, 1, 15, 2}));
    }

    @Test
    public void testSumSquares6() {
        assertEquals(200000000, HumanEval_133.sumSquares(new double[]{10000, 10000}));
    }

    @Test
    public void testSumSquares7() {
        assertEquals(75, HumanEval_133.sumSquares(new double[]{-1.4, 4.6, 6.3}));
    }

    @Test
    public void testSumSquares8() {
        assertEquals(1086, HumanEval_133.sumSquares(new double[]{-1.4, 17.9, 18.9, 19.9}));
    }

    @Test
    public void testSumSquares9() {
        assertEquals(0, HumanEval_133.sumSquares(new double[]{0}));
    }

    @Test
    public void testSumSquares10() {
        assertEquals(1, HumanEval_133.sumSquares(new double[]{-1}));
    }

    @Test
    public void testSumSquares11() {
        assertEquals(2, HumanEval_133.sumSquares(new double[]{-1, 1, 0}));
    }

    @Test
    public void testSumSquares12() {
        assertEquals(135, HumanEval_133.sumSquares(new double[]{-3, 4, 5, 6, 7}));
    }

    @Test
    public void testSumSquares13() {
        assertEquals(84, HumanEval_133.sumSquares(new double[]{0, 3.3, 7.7, -2.2}));
    }

    @Test
    public void testSumSquares14() {
        assertEquals(109, HumanEval_133.sumSquares(new double[]{1, 2, 3.4, -4.6, 5.1, 6}));
    }
}
// End of Test
