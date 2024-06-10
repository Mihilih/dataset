package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_36;

public class HumanEval_36Test {

    @Test
    public void testFizzBuzz_0() {
        assertEquals(0, HumanEval_36.fizzBuzz(50));
    }

    @Test
    public void testFizzBuzz_1() {
        assertEquals(2, HumanEval_36.fizzBuzz(78));
    }

    @Test
    public void testFizzBuzz_2() {
        assertEquals(3, HumanEval_36.fizzBuzz(79));
    }

    @Test
    public void testFizzBuzz_3() {
        assertEquals(3, HumanEval_36.fizzBuzz(100));
    }

    @Test
    public void testFizzBuzz_4() {
        assertEquals(6, HumanEval_36.fizzBuzz(200));
    }

    @Test
    public void testFizzBuzz_5() {
        assertEquals(192, HumanEval_36.fizzBuzz(4000));
    }

    @Test
    public void testFizzBuzz_6() {
        assertEquals(639, HumanEval_36.fizzBuzz(10000));
    }

    @Test
    public void testFizzBuzz_7() {
        assertEquals(8026, HumanEval_36.fizzBuzz(100000));
    }

    @Test
    public void testFizzBuzz_8() {
        assertEquals(0, HumanEval_36.fizzBuzz(10));
    }

    @Test
    public void testFizzBuzz_9() {
        assertEquals(43688, HumanEval_36.fizzBuzz(555555));
    }

    @Test
    public void testFizzBuzz_10() {
        assertEquals(0, HumanEval_36.fizzBuzz(77));
    }
}
// End of Test
