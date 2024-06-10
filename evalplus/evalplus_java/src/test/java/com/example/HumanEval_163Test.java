package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_163Test {

    @Test
    public void testGenerateIntegers1() {
        int[] expected = {2, 4, 6, 8};
        assertArrayEquals(expected, HumanEval_163.generateIntegers(2, 10));
    }

    @Test
    public void testGenerateIntegers2() {
        int[] expected = {2, 4, 6, 8};
        assertArrayEquals(expected, HumanEval_163.generateIntegers(10, 2));
    }

    @Test
    public void testGenerateIntegers3() {
        int[] expected = {2, 4, 6, 8};
        assertArrayEquals(expected, HumanEval_163.generateIntegers(132, 2));
    }

    @Test
    public void testGenerateIntegers4() {
        int[] expected = {};
        assertArrayEquals(expected, HumanEval_163.generateIntegers(17, 89));
    }

    @Test
    public void testGenerateIntegers5() {
        int[] expected = {6, 8};
        assertArrayEquals(expected, HumanEval_163.generateIntegers(6, 12));
    }

    @Test
    public void testGenerateIntegers6() {
        int[] expected = {4};
        assertArrayEquals(expected, HumanEval_163.generateIntegers(5, 4));
    }

    @Test
    public void testGenerateIntegers7() {
        int[] expected = {6, 8};
        assertArrayEquals(expected, HumanEval_163.generateIntegers(12, 5));
    }

    @Test
    public void testGenerateIntegers8() {
        int[] expected = {};
        assertArrayEquals(expected, HumanEval_163.generateIntegers(50, 60));
    }

}
// End of Test
