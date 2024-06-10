package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_57Test {
    @Test
    public void testMonotonic1(){
        assertTrue(HumanEval_57.monotonic(new int[] {1, 2, 4, 20}));
    }

    @Test
    public void testMonotonic2(){
        assertFalse(HumanEval_57.monotonic(new int[] {1, 20, 4, 10}));
    }

    @Test
    public void testMonotonic3(){
        assertTrue(HumanEval_57.monotonic(new int[] {4, 1, 0, -10}));
    }

    @Test
    public void testMonotonic4(){
        assertTrue(HumanEval_57.monotonic(new int[] {4, 1, 1, 0}));
    }

    @Test
    public void testMonotonic5(){
        assertFalse(HumanEval_57.monotonic(new int[] {1, 2, 3, 2, 5, 60}));
    }

    @Test
    public void testMonotonic6(){
        assertTrue(HumanEval_57.monotonic(new int[] {1, 2, 3, 4, 5, 60}));
    }

    @Test
    public void testMonotonic7(){
        assertTrue(HumanEval_57.monotonic(new int[] {9, 9, 9, 9}));
    }

    @Test
    public void testMonotonic8(){
        assertTrue(HumanEval_57.monotonic(new int[] {10, 9, 8, 7, 6}));
    }

    @Test
    public void testMonotonic9(){
        assertFalse(HumanEval_57.monotonic(new int[] {2, 1, 2}));
    }

    @Test
    public void testMonotonic10(){
        assertTrue(HumanEval_57.monotonic(new int[] {5, 4, 3, 3, 3, 2, 1, 1}));
    }

    @Test
    public void testMonotonic11(){
        assertTrue(HumanEval_57.monotonic(new int[] {1, 1, 2, 3, 3, 3, 4, 5}));
    }

    @Test
    public void testMonotonic12(){
        assertTrue(HumanEval_57.monotonic(new int[] {5, 5, 1, 1, -7, -7}));
    }

    @Test
    public void testMonotonic13(){
        assertFalse(HumanEval_57.monotonic(new int[] {2, 2, 1, -2, -2, 1}));
    }

    @Test
    public void testMonotonic14(){
        assertFalse(HumanEval_57.monotonic(new int[] {1, 1, 0, 1, 1, 1}));
    }

    @Test
    public void testMonotonic15(){
        assertTrue(HumanEval_57.monotonic(new int[] {}));
    }

    @Test
    public void testMonotonic16(){
        assertTrue(HumanEval_57.monotonic(new int[] {1, 1, 1, 1, 1}));
    }
}
// End of Test
