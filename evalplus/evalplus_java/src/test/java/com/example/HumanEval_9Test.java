package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanEval_9Test {
    
    @Test
    public void testRollingMax_0() {
        assertTrue(HumanEval_9.rollingMax(new ArrayList<Integer>()).isEmpty());
    }

    @Test
    public void testRollingMax_1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, HumanEval_9.rollingMax(numbers));
    }

    @Test
    public void testRollingMax_2() {
        List<Integer> numbers = Arrays.asList(4, 3, 2, 1);
        List<Integer> expected = Arrays.asList(4, 4, 4, 4);
        assertEquals(expected, HumanEval_9.rollingMax(numbers));
    }

    @Test
    public void testRollingMax_3() {
        List<Integer> numbers = Arrays.asList(3, 2, 3, 100, 3);
        List<Integer> expected = Arrays.asList(3, 3, 3, 100, 100);
        assertEquals(expected, HumanEval_9.rollingMax(numbers));
    }

    @Test
    public void testRollingMax_4() {
        assertTrue(HumanEval_9.rollingMax(new ArrayList<Integer>()).isEmpty());
    }

    @Test
    public void testRollingMax_5() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, HumanEval_9.rollingMax(numbers));
    }

    @Test
    public void testRollingMax_6() {
        List<Integer> numbers = Arrays.asList(4, 3, 2, 1);
        List<Integer> expected = Arrays.asList(4, 4, 4, 4);
        assertEquals(expected, HumanEval_9.rollingMax(numbers));
    }

    @Test
    public void testRollingMax_7() {
        List<Integer> numbers = Arrays.asList(3, 2, 3, 100, 3);
        List<Integer> expected = Arrays.asList(3, 3, 3, 100, 100);
        assertEquals(expected, HumanEval_9.rollingMax(numbers));
    }
}
// End of Test
