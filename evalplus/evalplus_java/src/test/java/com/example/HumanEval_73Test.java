package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_73Test {
    @Test
    public void test_0() {
        assertEquals(4, HumanEval_73.smallest_change(new int[]{1, 2, 3, 5, 4, 7, 9, 6}));
    }
    
    @Test
    public void test_1() {
        assertEquals(1, HumanEval_73.smallest_change(new int[]{1, 2, 3, 4, 3, 2, 2}));
    }
    
    @Test
    public void test_2() {
        assertEquals(1, HumanEval_73.smallest_change(new int[]{1, 4, 2}));
    }
    
    @Test
    public void test_3() {
        assertEquals(1, HumanEval_73.smallest_change(new int[]{1, 4, 4, 2}));
    }
    
    @Test
    public void test_4() {
        assertEquals(0, HumanEval_73.smallest_change(new int[]{1, 2, 3, 2, 1}));
    }
    
    @Test
    public void test_5() {
        assertEquals(0, HumanEval_73.smallest_change(new int[]{3, 1, 1, 3}));
    }
    
    @Test
    public void test_6() {
        assertEquals(0, HumanEval_73.smallest_change(new int[]{1}));
    }
    
    @Test
    public void test_7() {
        assertEquals(1, HumanEval_73.smallest_change(new int[]{0, 1}));
    }
    
    @Test
    public void test_8() {
        assertEquals(1, HumanEval_73.smallest_change(new int[]{1, 2, 3, 4, 2, 3, 2, 1}));
    }
    
    @Test
    public void test_9() {
        assertEquals(0, HumanEval_73.smallest_change(new int[]{1, 2, 2, 1}));
    }
    
    @Test
    public void test_10() {
        assertEquals(4, HumanEval_73.smallest_change(new int[]{1, 1, 2, 2, 3, 3, 4, 4}));
    }
    
    @Test
    public void test_11() {
        assertEquals(11, HumanEval_73.smallest_change(new int[]{-10, -9, -8, -7, -6, -5, 17, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 6, 7, 8, -7, 9, 10, 10}));
    }
    
    @Test
    public void test_12() {
        assertEquals(2, HumanEval_73.smallest_change(new int[]{1, 2, 2, 2, 2, 2, 3, 4}));
    }
    
    @Test
    public void test_13() {
        assertEquals(2, HumanEval_73.smallest_change(new int[]{5, 4, 3, 2, 1}));
    }
}
// End of Test.
