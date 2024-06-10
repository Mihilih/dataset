package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class HumanEval_104Test {
    @Test
    public void testUniqueDigits1() {
        List<Integer> input = Arrays.asList(15, 33, 1422, 1);
        List<Integer> expected = Arrays.asList(1, 15, 33);
        assertEquals(expected, HumanEval_104.uniqueDigits(input));
    }

    @Test
    public void testUniqueDigits2() {
        List<Integer> input = Arrays.asList(152, 323, 1422, 10);
        assertTrue(HumanEval_104.uniqueDigits(input).isEmpty());
    }

    @Test
    public void testUniqueDigits3() {
        List<Integer> input = Arrays.asList(12345, 2033, 111, 151);
        List<Integer> expected = Arrays.asList(111, 151);
        assertEquals(expected, HumanEval_104.uniqueDigits(input));
    }

    @Test
    public void testUniqueDigits4() {
        List<Integer> input = Arrays.asList(135, 103, 31);
        List<Integer> expected = Arrays.asList(31, 135);
        assertEquals(expected, HumanEval_104.uniqueDigits(input));
    }

    @Test
    public void testUniqueDigits5() {
        List<Integer> input = Arrays.asList(1357, 79, 8642, 246);
        List<Integer> expected = Arrays.asList(79, 1357);
        assertEquals(expected, HumanEval_104.uniqueDigits(input));
    }

    @Test
    public void testUniqueDigits6() {
        List<Integer> input = Arrays.asList(257, 369, 781, 409);
        assertTrue(HumanEval_104.uniqueDigits(input).isEmpty());
    }

    @Test
    public void testUniqueDigits7() {
        List<Integer> input = Arrays.asList(111, 333, 555, 777);
        List<Integer> expected = Arrays.asList(111, 333, 555, 777);
        assertEquals(expected, HumanEval_104.uniqueDigits(input));
    }

    @Test
    public void testUniqueDigits8() {
        List<Integer> input = Arrays.asList(1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999, 2223, 1010, 1111);
        List<Integer> expected = Arrays.asList(1111, 1111, 3333, 5555, 7777, 9999);
        assertEquals(expected, HumanEval_104.uniqueDigits(input));
    }

    @Test
    public void testUniqueDigits9() {
        List<Integer> input = Arrays.asList(2, 6046, 4, 8, 10, 13, 16, 3, 61);
        List<Integer> expected = Arrays.asList(3, 13);
        assertEquals(expected, HumanEval_104.uniqueDigits(input));
    }
}
// End of Test
