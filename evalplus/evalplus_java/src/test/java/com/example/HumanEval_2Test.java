package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_2;

public class HumanEval_2Test {

    @Test
    public void testTruncateNumber0() {
        assertEquals(0.5, HumanEval_2.truncateNumber(3.5), 0.0001);
    }

    @Test
    public void testTruncateNumber1() {
        assertEquals(0.33, HumanEval_2.truncateNumber(1.33), 0.0001);
    }

    @Test
    public void testTruncateNumber2() {
        assertEquals(0.456, HumanEval_2.truncateNumber(123.456), 0.0001);
    }

    @Test
    public void testTruncateNumber3() {
        assertEquals(0.99999, HumanEval_2.truncateNumber(999.99999), 0.0001);
    }

    @Test
    public void testTruncateNumber4() {
        assertEquals(0.04320870526393539, HumanEval_2.truncateNumber(0.04320870526393539), 0.0001);
    }

    @Test
    public void testTruncateNumber5() {
        assertEquals(0.0, HumanEval_2.truncateNumber(1.0), 0.0001);
    }

    @Test
    public void testTruncateNumber6() {
        assertEquals(1e-323, HumanEval_2.truncateNumber(1e-323), 0.0001);
    }

    @Test
    public void testTruncateNumber7() {
        assertEquals(0.0, HumanEval_2.truncateNumber(1000000000.0), 0.0001);
    }
}
// End of Test
