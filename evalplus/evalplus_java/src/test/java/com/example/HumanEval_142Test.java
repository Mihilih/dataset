package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_142Test {
    @Test
    public void testSumSquares1() {
        int[] lst1 = {1,2,3};
        assertEquals(6, HumanEval_142.sumSquares(lst1));
    }

    @Test
    public void testSumSquares2() {
        int[] lst2 = {};
        assertEquals(0, HumanEval_142.sumSquares(lst2));
    }

    @Test
    public void testSumSquares3() {
        int[] lst3 = {-1,-5,2,-1,-5};
        assertEquals(-126, HumanEval_142.sumSquares(lst3));
    }

    @Test
    public void testSumSquares4() {
        int[] lst4 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(9, HumanEval_142.sumSquares(lst4));
    }

    @Test
    public void testSumSquares5() {
        int[] lst5 = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
        assertEquals(-3, HumanEval_142.sumSquares(lst5));
    }

    @Test
    public void testSumSquares6() {
        int[] lst6 = {0};
        assertEquals(0, HumanEval_142.sumSquares(lst6));
    }

    @Test
    public void testSumSquares7() {
        int[] lst7 = {-56, -99, 1, 0, -2};
        assertEquals(3030, HumanEval_142.sumSquares(lst7));
    }

    @Test
    public void testSumSquares8() {
        int[] lst8 = {-1, 0, 0, 0, 0, 0, 0, 0, -1};
        assertEquals(0, HumanEval_142.sumSquares(lst8));
    }

    @Test
    public void testSumSquares9() {
        int[] lst9 = {-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37};
        assertEquals(-14196, HumanEval_142.sumSquares(lst9));
    }

    @Test
    public void testSumSquares10() {
        int[] lst10 = {-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10};
        assertEquals(-1448, HumanEval_142.sumSquares(lst10));
    }

    @Test
    public void testSumSquares11() {
        int[] lst11 = {2, 4, 6, 8, 10, 12};
        assertEquals(1090, HumanEval_142.sumSquares(lst11));
    }

    @Test
    public void testSumSquares12() {
        int[] lst12 = {2};
        assertEquals(4, HumanEval_142.sumSquares(lst12));
    }

    @Test
    public void testSumSquares13() {
        int[] lst13 = {-2, 5, -6, 7, -8};
        assertEquals(-460, HumanEval_142.sumSquares(lst13));
    }

    @Test
    public void testSumSquares14() {
        int[] lst14 = {1, -2, 3, -4, 5, -6, -9, 7, -8, 9, 7, -8, -6};
        assertEquals(-171, HumanEval_142.sumSquares(lst14));
    }
}
// End of Test
