package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_21Test {

    private static final double DELTA = 1e-9;

    @Test
    public void testRescaleToUnit_0() {
        assertArrayEquals(new double[]{0.0, 1.0}, HumanEval_21.rescaleToUnit(new double[]{2.0, 49.9}), DELTA);
    }

    @Test
    public void testRescaleToUnit_1() {
        assertArrayEquals(new double[]{1.0, 0.0}, HumanEval_21.rescaleToUnit(new double[]{100.0, 49.9}), DELTA);
    }

    @Test
    public void testRescaleToUnit_2() {
        assertArrayEquals(new double[]{0.0, 0.25, 0.5, 0.75, 1.0}, HumanEval_21.rescaleToUnit(new double[]{1.0, 2.0, 3.0, 4.0, 5.0}), DELTA);
    }

    @Test
    public void testRescaleToUnit_3() {
        assertArrayEquals(new double[]{0.25, 0.0, 1.0, 0.5, 0.75}, HumanEval_21.rescaleToUnit(new double[]{2.0, 1.0, 5.0, 3.0, 4.0}), DELTA);
    }

    @Test
    public void testRescaleToUnit_4() {
        assertArrayEquals(new double[]{0.25, 0.0, 1.0, 0.5, 0.75}, HumanEval_21.rescaleToUnit(new double[]{12.0, 11.0, 15.0, 13.0, 14.0}), DELTA);
    }

    @Test
    public void testRescaleToUnit_5() {
        assertArrayEquals(new double[]{0.0, 0.5, 1.0}, HumanEval_21.rescaleToUnit(new double[]{-10.0, 0.0, 10.0}), DELTA);
    }

    @Test
    public void testRescaleToUnit_6() {
        assertArrayEquals(new double[]{1.0, 0.6952353913042474, 0.48632272260300735, 0.3579034032537592, 0.22948408390451103, 0.0}, HumanEval_21.rescaleToUnit(new double[]{10.0, 4.067002335783351, 0.0, -2.5, -5.0, -9.46747586475692}), DELTA);
    }

    @Test
    public void testRescaleToUnit_7() {
        assertArrayEquals(new double[]{0.0, 1.0}, HumanEval_21.rescaleToUnit(new double[]{-6.486753627961523, 0.0}), DELTA);
    }

    @Test
    public void testRescaleToUnit_8() {
        assertArrayEquals(new double[]{0.0, 1.0}, HumanEval_21.rescaleToUnit(new double[]{5e-09, 1000000000}), DELTA);
    }

    @Test
    public void testRescaleToUnit_9() {
        assertArrayEquals(new double[]{1.0, 0.0}, HumanEval_21.rescaleToUnit(new double[]{3.4028235e+38, -3.4028235e+38}), DELTA);
    }

    @Test
    public void testRescaleToUnit_10() {
        assertArrayEquals(new double[]{0.0, 1.0, 0.0, 0.0, 0.0}, HumanEval_21.rescaleToUnit(new double[]{0.0, 0.1581270304608839, 0.0, 0.0, 0.0}), DELTA);
    }

    @Test
    public void testRescaleToUnit_11() {
        assertArrayEquals(new double[]{1.0, 0.0, 0.0, 1.0}, HumanEval_21.rescaleToUnit(new double[]{5.0, 2.0, 2.0, 5.0}), DELTA);
    }
}
// End of Test
