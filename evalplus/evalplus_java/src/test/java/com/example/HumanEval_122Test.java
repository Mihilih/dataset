package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_122Test {

    @Test
    public void testAddElements1() {
        int[] arr = {1, -2, -3, 41, 57, 76, 87, 88, 99};
        assertEquals(-4, HumanEval_122.addElements(arr, 3));
    }

    @Test
    public void testAddElements2() {
        int[] arr = {111, 121, 3, 4000, 5, 6};
        assertEquals(0, HumanEval_122.addElements(arr, 2));
    }

    @Test
    public void testAddElements3() {
        int[] arr = {11, 21, 3, 90, 5, 6, 7, 8, 9};
        assertEquals(125, HumanEval_122.addElements(arr, 4));
    }

    @Test
    public void testAddElements4() {
        int[] arr = {111, 21, 3, 4000, 5, 6, 7, 8, 9};
        assertEquals(24, HumanEval_122.addElements(arr, 4));
    }

    @Test
    public void testAddElements5() {
        int[] arr = {1};
        assertEquals(1, HumanEval_122.addElements(arr, 1));
    }

    @Test
    public void testAddElements6() {
        int[] arr = {98, 87, 76, 65, 54, 43, 32, 21, 10};
        assertEquals(380, HumanEval_122.addElements(arr, 5));
    }

    @Test
    public void testAddElements7() {
        int[] arr = {-100, -89, -77, -55, 900, -44, -22, -11};
        assertEquals(-287, HumanEval_122.addElements(arr, 7));
    }

    @Test
    public void testAddElements8() {
        int[] arr = {9, 10, 11, 100, 200, 300};
        assertEquals(30, HumanEval_122.addElements(arr, 5));
    }
}

// End of Test
