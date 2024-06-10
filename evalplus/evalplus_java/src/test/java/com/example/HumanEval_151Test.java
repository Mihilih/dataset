package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_151Test {
    @Test
    public void testDoubleTheDifference() {
        assertEquals(0, HumanEval_151.doubleTheDifference(new int[] {}));
        assertEquals(25, HumanEval_151.doubleTheDifference(new int[] {5, 4}));
        assertEquals(0, HumanEval_151.doubleTheDifference(new int[] {-10, -20, -30}));
        assertEquals(0, HumanEval_151.doubleTheDifference(new int[] {-1, -2, 8}));
        assertEquals(34, HumanEval_151.doubleTheDifference(new int[] {3, 5}));
        assertEquals(166650, HumanEval_151.doubleTheDifference(new int[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99}));
        assertEquals(35, HumanEval_151.doubleTheDifference(new int[] {1, 2, 3, 4, 5, 6}));
        assertEquals(0, HumanEval_151.doubleTheDifference(new int[] {2, 4, 6}));
        assertEquals(59, HumanEval_151.doubleTheDifference(new int[] {2, 5, 6, 5}));
    }
} // End of Test
