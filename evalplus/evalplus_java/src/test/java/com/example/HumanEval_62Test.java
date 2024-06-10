package com.example;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class HumanEval_62Test {
    @Test
    public void testDerivative1() {
        Assert.assertArrayEquals(new int[]{1, 4, 12, 20}, HumanEval_62.derivative(new int[]{3, 1, 2, 4, 5}));
    }

    @Test
    public void testDerivative2() {
        Assert.assertArrayEquals(new int[]{2, 6}, HumanEval_62.derivative(new int[]{1, 2, 3}));
    }

    @Test
    public void testDerivative3() {
        Assert.assertArrayEquals(new int[]{2, 2}, HumanEval_62.derivative(new int[]{3, 2, 1}));
    }

    @Test
    public void testDerivative4() {
        Assert.assertArrayEquals(new int[]{2, 2, 0, 16}, HumanEval_62.derivative(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    public void testDerivative5() {
        Assert.assertArrayEquals(new int[]{}, HumanEval_62.derivative(new int[]{1}));
    }

    @Test
    public void testDerivative6() {
        Assert.assertArrayEquals(new int[]{0, 0, 0, 0, 25}, HumanEval_62.derivative(new int[]{0, 0, 0, 0, 0, 5}));
    }

    @Test
    public void testDerivative7() {
        Assert.assertArrayEquals(new int[]{7, -2, 0, 0, 0, 0}, HumanEval_62.derivative(new int[]{0, 7, -1, 0, 0, 0, 0}));
    }

    @Test
    public void testDerivative8() {
        Assert.assertArrayEquals(new int[]{}, HumanEval_62.derivative(new int[]{0}));
    }
}
// End of Test
