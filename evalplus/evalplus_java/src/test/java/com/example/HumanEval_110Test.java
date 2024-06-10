package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.example.HumanEval_110;

public class HumanEval_110Test {

    @Test
    public void testExchange0() {
        assertEquals("YES", HumanEval_110.exchange(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
    }
    
    @Test
    public void testExchange1() {
        assertEquals("NO", HumanEval_110.exchange(new int[]{1, 2, 3, 4}, new int[]{1, 5, 3, 4}));
    }

    @Test
    public void testExchange2() {
        assertEquals("YES", HumanEval_110.exchange(new int[]{1, 2, 3, 4}, new int[]{2, 1, 4, 3}));
    }

    @Test
    public void testExchange3() {
        assertEquals("YES", HumanEval_110.exchange(new int[]{5, 7, 3}, new int[]{2, 6, 4}));
    }

    @Test
    public void testExchange4() {
        assertEquals("NO", HumanEval_110.exchange(new int[]{5, 7, 3}, new int[]{2, 6, 3}));
    }

    @Test
    public void testExchange5() {
        assertEquals("NO", HumanEval_110.exchange(new int[]{3, 2, 6, 1, 8, 9}, new int[]{3, 5, 5, 1, 1, 1}));
    }

    @Test
    public void testExchange6() {
        assertEquals("YES", HumanEval_110.exchange(new int[]{100, 200}, new int[]{200, 200}));
    }

    @Test
    public void testExchange7() {
        assertEquals("YES", HumanEval_110.exchange(new int[]{2, 4, 6}, new int[]{1, 3, 5}));
    }

    @Test
    public void testExchange8() {
        assertEquals("NO", HumanEval_110.exchange(new int[]{9, 6, 1, 1, 0}, new int[]{9, 6, 1, 1, 0}));
    }

    @Test
    public void testExchange9() {
        assertEquals("YES", HumanEval_110.exchange(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
    }

    @Test
    public void testExchange10() {
        assertEquals("YES", HumanEval_110.exchange(new int[]{1, 12, 1, 1, 2}, new int[]{2, 2, 2, 2, 1, 2}));
    }

    @Test
    public void testExchange11() {
        assertEquals("NO", HumanEval_110.exchange(new int[]{1, 2, 1, 1, 1}, new int[]{2, 2, 2}));
    }

    @Test
    public void testExchange12() {
        assertEquals("YES", HumanEval_110.exchange(new int[]{1, 3, 2, 7, 4, 7}, new int[]{2, 4, 6, 8}));
    }

    @Test
    public void testExchange13() {
        assertEquals("NO", HumanEval_110.exchange(new int[]{7, 2, 4, 6, 8, 8}, new int[]{1, 3, 5, 7}));
    }

    @Test
    public void testExchange14() {
        assertEquals("YES", HumanEval_110.exchange(new int[]{2, 4, 6}, new int[]{1, 3, 5, 7}));
    }
}
// End of Test
