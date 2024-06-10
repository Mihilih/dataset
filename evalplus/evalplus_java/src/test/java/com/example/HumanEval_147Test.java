package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_147Test {

    @Test
    public void testGetMaxTriples_0() {
        assertEquals(1, HumanEval_147.getMaxTriples(5));
    }

    @Test
    public void testGetMaxTriples_1() {
        assertEquals(4, HumanEval_147.getMaxTriples(6));
    }

    @Test
    public void testGetMaxTriples_2() {
        assertEquals(36, HumanEval_147.getMaxTriples(10));
    }

    @Test
    public void testGetMaxTriples_3() {
        assertEquals(53361, HumanEval_147.getMaxTriples(100));
    }

    @Test
    public void testGetMaxTriples_4() {
        assertEquals(0, HumanEval_147.getMaxTriples(1));
    }

    @Test
    public void testGetMaxTriples_5() {
        assertEquals(0, HumanEval_147.getMaxTriples(3));
    }

    @Test
    public void testGetMaxTriples_6() {
        assertEquals(60, HumanEval_147.getMaxTriples(12));
    }

    @Test
    public void testGetMaxTriples_7() {
        assertEquals(321, HumanEval_147.getMaxTriples(20));
    }

    @Test
    public void testGetMaxTriples_8() {
        assertEquals(431211, HumanEval_147.getMaxTriples(200));
    }
}
// End of Test.
