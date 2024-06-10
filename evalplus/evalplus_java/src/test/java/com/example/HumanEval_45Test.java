package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_45Test {
    @Test
    public void testTriangleArea1() {
        assertEquals(7.5, HumanEval_45.triangleArea(5, 3), 0.001);
    }

    @Test
    public void testTriangleArea2() {
        assertEquals(2.0, HumanEval_45.triangleArea(2, 2), 0.001);
    }

    @Test
    public void testTriangleArea3() {
        assertEquals(40.0, HumanEval_45.triangleArea(10, 8), 0.001);
    }

    @Test
    public void testTriangleArea4() {
        assertEquals(12.0, HumanEval_45.triangleArea(4, 6), 0.001);
    }

    @Test
    public void testTriangleArea5() {
        assertEquals(46.25133642960714, HumanEval_45.triangleArea(0.09250267285921429, 1000), 0.001);
    }

    @Test
    public void testTriangleArea6() {
        assertEquals(7.0, HumanEval_45.triangleArea(7, 2), 0.001);
    }

    @Test
    public void testTriangleArea7() {
        assertEquals(12.5, HumanEval_45.triangleArea(5, 5), 0.001);
    }
}
// End of Test
