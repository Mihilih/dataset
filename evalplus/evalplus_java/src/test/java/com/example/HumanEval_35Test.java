package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_35Test {

    @Test
    public void testMaxElement1() {
        double[] list = {1, 2, 3};
        assertEquals(3.0, HumanEval_35.maxElement(list), 0.0);
    }

    @Test
    public void testMaxElement2() {
        double[] list = {5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10};
        assertEquals(124.0, HumanEval_35.maxElement(list), 0.0);
    }

    @Test
    public void testMaxElement3() {
        double[] list = {0, 0, 0, 0};
        assertEquals(0.0, HumanEval_35.maxElement(list), 0.0);
    }

    @Test
    public void testMaxElement4() {
        double[] list = {-5, -6, -5, -5, -5, -5, -5, -145, -5, -4, -5, -6};
        assertEquals(-4.0, HumanEval_35.maxElement(list), 0.0);
    }

    @Test
    public void testMaxElement5() {
        double[] list = {-1001};
        assertEquals(-1001.0, HumanEval_35.maxElement(list), 0.0);
    }

    @Test
    public void testMaxElement6() {
        double[] list = {1.2, -4.5, -3.4, 5.6, 7.8, -9.0, 10.1, -50.04662603741016, -12.3, 15.4, 20.5, -25.6, 30.7, -35.8, 40.9, -46.0, -8.601314347821834, 57.2, -63.3, 69.4, -75.5, 81.6, -87.7, 93.8, 99.9, 30.7};
        assertEquals(99.9, HumanEval_35.maxElement(list), 0.0);
    }

    @Test
    public void testMaxElement7() {
        double[] list = {-1, -2, -3, -4, -5};
        assertEquals(-1.0, HumanEval_35.maxElement(list), 0.0);
    }

    @Test
    public void testMaxElement8() {
        double[] list = {-1, -2, -3, -4, 0, -2};
        assertEquals(0.0, HumanEval_35.maxElement(list), 0.0);
    }

    @Test
    public void testMaxElement9() {
        double[] list = {0, 1};
        assertEquals(1.0, HumanEval_35.maxElement(list), 0.0);
    }
} // End of Test
