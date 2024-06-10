package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_85Test {
    
    @Test
    public void testAdd_0() {
        int[] lst = {4, 88};
        assertEquals(88, HumanEval_85.add(lst));
    }

    @Test
    public void testAdd_1() {
        int[] lst = {4, 5, 6, 7, 2, 122};
        assertEquals(122, HumanEval_85.add(lst));
    }

    @Test
    public void testAdd_2() {
        int[] lst = {4, 0, 6, 7};
        assertEquals(0, HumanEval_85.add(lst));
    }

    @Test
    public void testAdd_3() {
        int[] lst = {4, 4, 6, 8};
        assertEquals(12, HumanEval_85.add(lst));
    }

    @Test
    public void testAdd_4() {
        int[] lst = {2, 3, 6, 8};
        assertEquals(8, HumanEval_85.add(lst));
    }

    @Test
    public void testAdd_5() {
        int[] lst = {3, 5, 7, 9};
        assertEquals(0, HumanEval_85.add(lst));
    }

    @Test
    public void testAdd_6() {
        int[] lst = {2, 4, 6, 8};
        assertEquals(12, HumanEval_85.add(lst));
    }

    @Test
    public void testAdd_7() {
        int[] lst = {5, 3, 21, 64, 3, 2, 64, 1, 1};
        assertEquals(66, HumanEval_85.add(lst));
    }
}
// End of Test
