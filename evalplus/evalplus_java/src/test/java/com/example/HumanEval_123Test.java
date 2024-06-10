package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class HumanEval_123Test {

    @Test
    public void testGetOddCollatz1() {
        HumanEval_123 test = new HumanEval_123();
        List<Integer> result = test.getOddCollatz(14);
        List<Integer> expected = Arrays.asList(1, 5, 7, 11, 13, 17);
        assertEquals(expected, result);
    }

    @Test
    public void testGetOddCollatz2() {
        HumanEval_123 test = new HumanEval_123();
        List<Integer> result = test.getOddCollatz(5);
        List<Integer> expected = Arrays.asList(1, 5);
        assertEquals(expected, result);
    }

    @Test
    public void testGetOddCollatz3() {
        HumanEval_123 test = new HumanEval_123();
        List<Integer> result = test.getOddCollatz(12);
        List<Integer> expected = Arrays.asList(1, 3, 5);
        assertEquals(expected, result);
    }

    @Test
    public void testGetOddCollatz4() {
        HumanEval_123 test = new HumanEval_123();
        List<Integer> result = test.getOddCollatz(1);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, result);
    }

    @Test
    public void testGetOddCollatz5() {
        HumanEval_123 test = new HumanEval_123();
        List<Integer> result = test.getOddCollatz(2);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, result);
    }

    // Add the rest of the tests here following the same format

}

// End of Test
