package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_157Test {

    @Test
    public void test_0() {
        assertEquals(true, HumanEval_157.rightAngleTriangle(3, 4, 5));
    }

    @Test
    public void test_1() {
        assertEquals(false, HumanEval_157.rightAngleTriangle(1, 2, 3));
    }
    
    @Test
    public void test_2() {
        assertEquals(true, HumanEval_157.rightAngleTriangle(10, 6, 8));
    }
    
    @Test
    public void test_3() {
        assertEquals(false, HumanEval_157.rightAngleTriangle(2, 2, 2));
    }
    
    @Test
    public void test_4() {
        assertEquals(true, HumanEval_157.rightAngleTriangle(7, 24, 25));
    }
    
    @Test
    public void test_5() {
        assertEquals(false, HumanEval_157.rightAngleTriangle(10, 5, 7));
    }
    
    @Test
    public void test_6() {
        assertEquals(true, HumanEval_157.rightAngleTriangle(5, 12, 13));
    }
    
    @Test
    public void test_7() {
        assertEquals(true, HumanEval_157.rightAngleTriangle(15, 8, 17));
    }
    
    @Test
    public void test_8() {
        assertEquals(true, HumanEval_157.rightAngleTriangle(48, 55, 73));
    }
    
    @Test
    public void test_9() {
        assertEquals(false, HumanEval_157.rightAngleTriangle(1, 1, 1));
    }
    
    @Test
    public void test_10() {
        assertEquals(false, HumanEval_157.rightAngleTriangle(2, 2, 10));
    }
    
    @Test
    public void test_11() {
        assertEquals(true, HumanEval_157.rightAngleTriangle(5, 13, 12));
    }
    
    @Test
    public void test_12() {
        assertEquals(true, HumanEval_157.rightAngleTriangle(5, 3, 4));
    }
    
    @Test
    public void test_13() {
        assertEquals(true, HumanEval_157.rightAngleTriangle(9, 12, 15));
    }
    
    @Test
    public void test_14() {
        assertEquals(false, HumanEval_157.rightAngleTriangle(60, 60, 60));
    }
    
    @Test
    public void test_15() {
        assertEquals(true, HumanEval_157.rightAngleTriangle(4, 5, 3));
    }
    
    @Test
    public void test_16() {
        assertEquals(false, HumanEval_157.rightAngleTriangle(15, 17, 6));
    }
    
    @Test
    public void test_17() {
        assertEquals(false, HumanEval_157.rightAngleTriangle(1, 1, 2));
    }
    
    @Test
    public void test_18() {
        assertEquals(false, HumanEval_157.rightAngleTriangle(26, 94, 94));
    }
}
// End of Test
