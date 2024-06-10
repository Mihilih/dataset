package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_20Test {

    @Test
    public void testFindClosestElements0() {
        double[] numbers = {1.0, 2.0, 3.9, 4.0, 5.0, 2.2};
        double[] expected = {3.9, 4.0};
        assertArrayEquals(expected, HumanEval_20.findClosestElements(numbers), 0.001);
    }

    @Test
    public void testFindClosestElements1() {
        double[] numbers = {1.0, 2.0, 5.9, 4.0, 5.0};
        double[] expected = {5.0, 5.9};
        assertArrayEquals(expected, HumanEval_20.findClosestElements(numbers), 0.001);
    }

    @Test
    public void testFindClosestElements2() {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0, 2.2};
        double[] expected = {2.0, 2.2};
        assertArrayEquals(expected, HumanEval_20.findClosestElements(numbers), 0.001);
    }

    @Test
    public void testFindClosestElements3() {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0, 2.0};
        double[] expected = {2.0, 2.0};
        assertArrayEquals(expected, HumanEval_20.findClosestElements(numbers), 0.001);
    }

    @Test
    public void testFindClosestElements4() {
        double[] numbers = {1.1, 2.2, 3.1, 4.1, 5.1};
        double[] expected = {2.2, 3.1};
        assertArrayEquals(expected, HumanEval_20.findClosestElements(numbers), 0.001);
    }

    @Test
    public void testFindClosestElements5() {
        double[] numbers = {1.5, 2.5, 3.5, 4.5};
        double[] expected = {1.5, 2.5};
        assertArrayEquals(expected, HumanEval_20.findClosestElements(numbers), 0.001);
    }

    @Test
    public void testFindClosestElements6() {
        double[] numbers = {0.5, 0.9, 1.2, 1.8, 2.5, 2.9, 3.1};
        double[] expected = {2.9, 3.1};
        assertArrayEquals(expected, HumanEval_20.findClosestElements(numbers), 0.001);
    }

    @Test
    public void testFindClosestElements7() {
        double[] numbers = {1.1963194756636508, 2.0, 2.1, 2.2, 2.3, 2.4, 2.424000205756431, 2.5, 3.4};
        double[] expected = {2.4, 2.424000205756431};
        assertArrayEquals(expected, HumanEval_20.findClosestElements(numbers), 0.001);
    }

    @Test
    public void testFindClosestElements8() {
        double[] numbers = {2.0, 2.0, 4.0, 4.5, 6.0, 8.44265458853031, 10.0, 10.0, 10.0, 12.0, 14.0, 16.0, 16.0, 18.0, 20.0, 20.0};
        double[] expected = {2.0, 2.0};
        assertArrayEquals(expected, HumanEval_20.findClosestElements(numbers), 0.001);
    }

    @Test
    public void testFindClosestElements9() {
        double[] numbers = {2.0, 2.1, 2.1};
        double[] expected = {2.1, 2.1};
        assertArrayEquals(expected, HumanEval_20.findClosestElements(numbers), 0.001);
    }

    @Test
    public void testFindClosestElements10() {
        double[] numbers = {-3, 53};
        double[] expected = {-3, 53};
        assertArrayEquals(expected, HumanEval_20.findClosestElements(numbers), 0.001);
    }

    @Test
    public void testFindClosestElements11() {
        double[] numbers = {-20.0, -10.0, -7.0, -5.5, -1.0, 0.0, 3.14159, 8.0, 12.345, 30.0};
        double[] expected = {-1.0, 0.0};
        assertArrayEquals(expected, HumanEval_20.findClosestElements(numbers), 0.001);
    }
}
// End of Test
