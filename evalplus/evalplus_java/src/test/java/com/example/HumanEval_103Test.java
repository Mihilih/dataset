package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_103;

public class HumanEval_103Test {

    @Test
    public void testRoundedAvg1() {
        assertEquals("11", HumanEval_103.roundedAvg(1, 5));
    }

    @Test
    public void testRoundedAvg2() {
        assertEquals("1010", HumanEval_103.roundedAvg(7, 13));
    }

    @Test
    public void testRoundedAvg3() {
        assertEquals("1111001010", HumanEval_103.roundedAvg(964, 977));
    }

    @Test
    public void testRoundedAvg4() {
        assertEquals("1111100100", HumanEval_103.roundedAvg(996, 997));
    }

    @Test
    public void testRoundedAvg5() {
        assertEquals("1011000010", HumanEval_103.roundedAvg(560, 851));
    }

    @Test
    public void testRoundedAvg6() {
        assertEquals("101101110", HumanEval_103.roundedAvg(185, 546));
    }

    @Test
    public void testRoundedAvg7() {
        assertEquals("110101101", HumanEval_103.roundedAvg(362, 496));
    }

    @Test
    public void testRoundedAvg8() {
        assertEquals("1001110010", HumanEval_103.roundedAvg(350, 902));
    }

    @Test
    public void testRoundedAvg9() {
        assertEquals("11010111", HumanEval_103.roundedAvg(197, 233));
    }

    @Test
    public void testRoundedAvg10() {
        assertEquals("-1", HumanEval_103.roundedAvg(7, 5));
    }

    @Test
    public void testRoundedAvg11() {
        assertEquals("-1", HumanEval_103.roundedAvg(5, 1));
    }

    @Test
    public void testRoundedAvg12() {
        assertEquals("101", HumanEval_103.roundedAvg(5, 5));
    }

    @Test
    public void testRoundedAvg13() {
        assertEquals("1", HumanEval_103.roundedAvg(1, 1));
    }

    @Test
    public void testRoundedAvg14() {
        assertEquals("-1", HumanEval_103.roundedAvg(200, 30));
    }

    @Test
    public void testRoundedAvg15() {
        assertEquals("1111", HumanEval_103.roundedAvg(15, 15));
    }

    @Test
    public void testRoundedAvg16() {
        assertEquals("111010", HumanEval_103.roundedAvg(15, 100));
    }

    @Test
    public void testRoundedAvg17() {
        assertEquals("1111010011011111100", HumanEval_103.roundedAvg(3000, 1000001));
    }

    @Test
    public void testRoundedAvg18() {
        assertEquals("10000", HumanEval_103.roundedAvg(15, 16));
    }
} // End of Test
