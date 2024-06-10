package com.example;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_30Test {
    
    @Test
    public void testGetPositive_1() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-1, -2, 4, 5, 6));
        assertEquals(Arrays.asList(4, 5, 6), HumanEval_30.getPositive(numbers));
    }

    @Test
    public void testGetPositive_2() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10));
        assertEquals(Arrays.asList(5, 3, 2, 3, 3, 9, 123, 1), HumanEval_30.getPositive(numbers));
    }

    @Test
    public void testGetPositive_3() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-1, -2));
        assertEquals(new ArrayList<>(), HumanEval_30.getPositive(numbers));
    }

    @Test
    public void testGetPositive_4() {
        ArrayList<Integer> numbers = new ArrayList<>();
        assertEquals(new ArrayList<>(), HumanEval_30.getPositive(numbers));
    }

    @Test
    public void testGetPositive_5() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, -1, 2, -2, 3, -3, 4, -4));
        assertEquals(Arrays.asList(1, 2, 3, 4), HumanEval_30.getPositive(numbers));
    }

    @Test
    public void testGetPositive_6() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-5, -4, -1, 0, 1, 4, 1));
        assertEquals(Arrays.asList(1, 4, 1), HumanEval_30.getPositive(numbers));
    }

    @Test
    public void testGetPositive_7() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0));
        assertEquals(new ArrayList<>(), HumanEval_30.getPositive(numbers));
    }

    @Test
    public void testGetPositive_8() {
        ArrayList<Integer> numbers = new ArrayList<>();
        assertEquals(new ArrayList<>(), HumanEval_30.getPositive(numbers));
    }

    @Test
    public void testGetPositive_9() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(Arrays.asList(1, 2, 3, 4), HumanEval_30.getPositive(numbers));
    }
}
// End of Test
