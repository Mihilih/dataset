package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_47;

public class HumanEval_47Test {

    @Test
    public void testMedian_0() {
        int[] input = {3, 1, 2, 4, 5};
        double output = HumanEval_47.median(input);
        assertEquals(3, output, 0.01);
    }

    @Test
    public void testMedian_1() {
        int[] input = {-10, 4, 6, 1000, 10, 20};
        double output = HumanEval_47.median(input);
        assertEquals(15.0, output, 0.01);
    }

    @Test
    public void testMedian_2() {
        int[] input = {5};
        double output = HumanEval_47.median(input);
        assertEquals(5, output, 0.01);
    }

    @Test
    public void testMedian_3() {
        int[] input = {6, 5};
        double output = HumanEval_47.median(input);
        assertEquals(5.5, output, 0.01);
    }

    @Test
    public void testMedian_4() {
        int[] input = {8, 1, 3, 9, 9, 2, 7};
        double output = HumanEval_47.median(input);
        assertEquals(7, output, 0.01);
    }

    @Test
    public void testMedian_5() {
        int[] input = {10, 20, 30, 40, 50};
        double output = HumanEval_47.median(input);
        assertEquals(30, output, 0.01);
    }

    @Test
    public void testMedian_6() {
        int[] input = {1, 3, 7, 8, 10, 10};
        double output = HumanEval_47.median(input);
        assertEquals(7.5, output, 0.01);
    }

    @Test
    public void testMedian_7() {
        int[] input = {7, 9, 3, 5};
        double output = HumanEval_47.median(input);
        assertEquals(6.0, output, 0.01);
    }

    @Test
    public void testMedian_8() {
        int[] input = {10, 20, 4, 30, 13, 2, 40, 50};
        double output = HumanEval_47.median(input);
        assertEquals(16.5, output, 0.01);
    }

    @Test
    public void testMedian_9() {
        int[] input = {-5, -3, 0, 3, -5};
        double output = HumanEval_47.median(input);
        assertEquals(-3, output, 0.01);
    }

    @Test
    public void testMedian_10() {
        int[] input = {100};
        double output = HumanEval_47.median(input);
        assertEquals(100, output, 0.01);
    }

    @Test
    public void testMedian_11() {
        int[] input = {-1, 0, 1};
        double output = HumanEval_47.median(input);
        assertEquals(0, output, 0.01);
    }

    @Test
    public void testMedian_12() {
        int[] input = {14, 100};
        double output = HumanEval_47.median(input);
        assertEquals(57.0, output, 0.01);
    }
}
// End of Test
