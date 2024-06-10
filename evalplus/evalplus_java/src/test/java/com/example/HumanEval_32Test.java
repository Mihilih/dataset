package com.example;
//Here is the Java version of your Python tests:



import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class HumanEval_32Test {

    @Test
    public void test_0() {
        ArrayList<Double> array = new ArrayList<>(Arrays.asList(-10.0, -2.0));
        Assert.assertEquals(-5.0, HumanEval_32.findZero(array), 0.01);
    }

    @Test
    public void test_1() {
        ArrayList<Double> array = new ArrayList<>(Arrays.asList(-3.0, -6.0, -7.0, 7.0));
        Assert.assertEquals(1.6679422344071086, HumanEval_32.findZero(array), 0.01);
    }

    // Continue writing tests here following the format above.

    @Test
    public void test_101() {
        ArrayList<Double> array = new ArrayList<>(Arrays.asList(-36.0, 6.0, -1440.0, 1.0));
        Assert.assertEquals(-0.2636785537898591, HumanEval_32.findZero(array), 0.01);
    }
}

