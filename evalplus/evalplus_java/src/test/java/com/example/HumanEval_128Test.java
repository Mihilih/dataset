package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_128Test {
    @Test
    public void testProdSigns_0() {
        int[] arr = {1, 2, 2, -4};
        assertEquals((Integer)(-9), HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_1() {
        int[] arr = {0, 1};
        assertEquals((Integer)0, HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_2() {
        int[] arr = {1, 1, 1, 2, 3, -1, 1};
        assertEquals((Integer)(-10), HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_3() {
        int[] arr = {};
        assertEquals(null, HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_4() {
        int[] arr = {2, 4, 1, 2, -1, -1, 9};
        assertEquals((Integer)20, HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_5() {
        int[] arr = {-1, 1, -1, 1};
        assertEquals((Integer)4, HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_6() {
        int[] arr = {-1, 1, 1, 1};
        assertEquals((Integer)(-4), HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_7() {
        int[] arr = {-1, 1, 1, 0};
        assertEquals((Integer)0, HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_8() {
        int[] arr = {-1, -2, -2, -4};
        assertEquals((Integer)9, HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_9() {
        int[] arr = {0, 0, 0, 0};
        assertEquals((Integer)0, HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_10() {
        int[] arr = {};
        assertEquals(null, HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_11() {
        int[] arr = {-1, 1, 2, -1};
        assertEquals((Integer)5, HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_12() {
        int[] arr = {100, 10, 1, -1, -10, -100, 10};
        assertEquals((Integer)(-232), HumanEval_128.prodSigns(arr));
    }

    @Test
    public void testProdSigns_13() {
        int[] arr = {-1, 0, 1, 2};
        assertEquals((Integer)0, HumanEval_128.prodSigns(arr));
    }
} // End of Test
