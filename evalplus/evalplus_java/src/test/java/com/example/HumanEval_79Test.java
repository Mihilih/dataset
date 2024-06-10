package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_79;

public class HumanEval_79Test {

    @Test
    public void testDecimalToBinary_0() {
        assertEquals("db0db", HumanEval_79.decimalToBinary(0));
    }

    @Test
    public void testDecimalToBinary_32() {
        assertEquals("db100000db", HumanEval_79.decimalToBinary(32));
    }

    @Test
    public void testDecimalToBinary_103() {
        assertEquals("db1100111db", HumanEval_79.decimalToBinary(103));
    }

    @Test
    public void testDecimalToBinary_15() {
        assertEquals("db1111db", HumanEval_79.decimalToBinary(15));
    }

    @Test
    public void testDecimalToBinary_100001() {
        assertEquals("db11000011010100001db", HumanEval_79.decimalToBinary(100001));
    }

    @Test
    public void testDecimalToBinary_7() {
        assertEquals("db111db", HumanEval_79.decimalToBinary(7));
    }
}

// End of Test
