package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_0Test {

    @Test
    public void testHasCloseElements1() {
        double[] numbers = {1.0, 2.0, 3.9, 4.0, 5.0, 2.2};
        assertTrue(HumanEval_0.hasCloseElements(numbers, 0.3));
    }

    @Test
    public void testHasCloseElements2() {
        double[] numbers = {1.0, 2.0, 3.9, 4.0, 5.0, 2.2};
        assertFalse(HumanEval_0.hasCloseElements(numbers, 0.05));
    }

    @Test
    public void testHasCloseElements3() {
        double[] numbers = {1.0, 2.0, 5.9, 4.0, 5.0};
        assertTrue(HumanEval_0.hasCloseElements(numbers, 0.95));
    }

    @Test
    public void testHasCloseElements4() {
        double[] numbers = {1.0, 2.0, 5.9, 4.0, 5.0};
        assertFalse(HumanEval_0.hasCloseElements(numbers, 0.8));
    }

    @Test
    public void testHasCloseElements5() {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0, 2.0};
        assertTrue(HumanEval_0.hasCloseElements(numbers, 0.1));
    }

    @Test
    public void testHasCloseElements6() {
        double[] numbers = {1.1, 2.2, 3.1, 4.1, 5.1};
        assertTrue(HumanEval_0.hasCloseElements(numbers, 1.0));
    }

    @Test
    public void testHasCloseElements7() {
        double[] numbers = {1.1, 2.2, 3.1, 4.1, 5.1};
        assertFalse(HumanEval_0.hasCloseElements(numbers, 0.5));
    }
}
// End of Test
