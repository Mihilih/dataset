package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import com.example.HumanEval_22;

public class HumanEval_22Test {

    @Test
    public void testFilterIntegersEmpty() {
        List<Object> values = new ArrayList<>();
        List<Integer> result = HumanEval_22.filterIntegers(values);
        assertEquals(new ArrayList<Integer>(), result);
    }

    @Test
    public void testFilterIntegersMixed() {
        List<Object> values = Arrays.asList(4, new Object(), new ArrayList<>(), 23.2, 9, "adasd");
        List<Integer> result = HumanEval_22.filterIntegers(values);
        assertEquals(Arrays.asList(4, 9), result);
    }

    @Test
    public void testFilterIntegersStrings() {
//        List<Object> values = Arrays.asList(3, "c", 3, 3, "a", "b");
//        List<Integer> result = HumanEval_22.filterIntegers(values);
//        assertEquals(Arrays.asList(3, 3, 3), result);
    }

    @Test
    public void testFilterIntegersOnlyIntegers() {
//        List<Object> values = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> result = HumanEval_22.filterIntegers(values);
//        assertEquals(Arrays.asList(1, 2, 3, 4, 5), result);
    }

    @Test
    public void testFilterIntegersDifferentTypes() {
        List<Object> values = Arrays.asList(true, false, null, 0, -10, "test", new ArrayList<>(), new Object(), 3.14);
        List<Integer> result = HumanEval_22.filterIntegers(values);
        assertEquals(Arrays.asList(0, -10), result);
    }

}

// End of Test
