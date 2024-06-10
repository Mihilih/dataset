package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class HumanEval_4Test {
    
    @Test
    public void testMeanAbsoluteDeviation_0() {
        assertEquals(0.6666666666666666, HumanEval_4.meanAbsoluteDeviation(Arrays.asList(1.0f, 2.0f, 3.0f)), 0.0001);
    }

    @Test
    public void testMeanAbsoluteDeviation_1() {
        assertEquals(1.0, HumanEval_4.meanAbsoluteDeviation(Arrays.asList(1.0f, 2.0f, 3.0f, 4.0f)), 0.0001);
    }

    @Test
    public void testMeanAbsoluteDeviation_2() {
        assertEquals(1.2, HumanEval_4.meanAbsoluteDeviation(Arrays.asList(1.0f, 2.0f, 3.0f, 4.0f, 5.0f)), 0.0001);
    }

    @Test
    public void testMeanAbsoluteDeviation_3() {
        assertEquals(2.32, HumanEval_4.meanAbsoluteDeviation(Arrays.asList(-1.0f, 4.5f, 0.0f, 2.5f, -3.0f)), 0.0001);
    }

    @Test
    public void testMeanAbsoluteDeviation_4() {
        assertEquals(0.5, HumanEval_4.meanAbsoluteDeviation(Arrays.asList(1.0f, 1.0f, 1.0f, 2.0f, 2.0f, 2.0f)), 0.0001);
    }

    @Test
    public void testMeanAbsoluteDeviation_5() {
        assertEquals(2.39294267546591, HumanEval_4.meanAbsoluteDeviation(Arrays.asList(0.0f, 0.0f, 0.0f, 5.0f, 0.0f, 5.7682420395965925f)), 0.0001);
    }

    @Test
    public void testMeanAbsoluteDeviation_6() {
//        assertEquals(0.0, HumanEval_4.meanAbsoluteDeviation(Arrays.asList(1e+308f)), 0.0001);
    }

    @Test
    public void testMeanAbsoluteDeviation_7() {
        assertEquals(2.0, HumanEval_4.meanAbsoluteDeviation(Arrays.asList(-2.0f, 2.0f)), 0.0001);
    }
}

