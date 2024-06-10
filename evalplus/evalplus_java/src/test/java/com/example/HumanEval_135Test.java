package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_135Test {

    @Test
    public void testCanArrange0() {
        int[] arr = {1, 2, 4, 3, 5};
        assertEquals(3, HumanEval_135.canArrange(arr));
    }

    @Test
    public void testCanArrange1() {
        int[] arr = {1, 2, 4, 5};
        assertEquals(-1, HumanEval_135.canArrange(arr));
    }

    @Test
    public void testCanArrange2() {
        int[] arr = {1, 4, 2, 5, 6, 7, 8, 9, 10};
        assertEquals(2, HumanEval_135.canArrange(arr));
    }

    @Test
    public void testCanArrange3() {
        int[] arr = {4, 8, 5, 7, 3};
        assertEquals(4, HumanEval_135.canArrange(arr));
    }

    @Test
    public void testCanArrange4() {
        int[] arr = {};
        assertEquals(-1, HumanEval_135.canArrange(arr));
    }

    @Test
    public void testCanArrange5() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, HumanEval_135.canArrange(arr));
    }

    @Test
    public void testCanArrange6() {
        int[] arr = {1, 3, 2, 4};
        assertEquals(2, HumanEval_135.canArrange(arr));
    }

    @Test
    public void testCanArrange7() {
        int[] arr = {6, 0, 1, 2, 3};
        assertEquals(1, HumanEval_135.canArrange(arr));
    }

    @Test
    public void testCanArrange8() {
        int[] arr = {1};
        assertEquals(-1, HumanEval_135.canArrange(arr));
    }

    @Test
    public void testCanArrange9() {
        int[] arr = {1, 3, 5, 4, 6, 7, 9, 8};
        assertEquals(7, HumanEval_135.canArrange(arr));
    }

    @Test
    public void testCanArrange10() {
        int[] arr = {3, 6, 9, 12, 0, -1, 21, 19, 16, 13, 10, 7, 4, 1, 2, 5, 8, 11, 14, 17, 20};
        assertEquals(13, HumanEval_135.canArrange(arr));
    }

    @Test
    public void testCanArrange11() {
        int[] arr = {-1, 0, 1, 2, 3};
        assertEquals(-1, HumanEval_135.canArrange(arr));
    }

    @Test
    public void testCanArrange12() {
        int[] arr = {};
        assertEquals(-1, HumanEval_135.canArrange(arr));
    }
}
// End of Test
