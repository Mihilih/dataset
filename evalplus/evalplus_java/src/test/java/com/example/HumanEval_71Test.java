package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_71;

public class HumanEval_71Test {

    @Test
    public void testTriangleArea_0() {
        assertEquals(6.0, HumanEval_71.triangleArea(3, 4, 5), 0.01);
    }

    @Test
    public void testTriangleArea_1() {
        assertEquals(-1, HumanEval_71.triangleArea(1, 2, 10), 0.01);
    }

    @Test
    public void testTriangleArea_2() {
        assertEquals(8.18, HumanEval_71.triangleArea(4, 8, 5), 0.01);
    }

    @Test
    public void testTriangleArea_3() {
        assertEquals(1.73, HumanEval_71.triangleArea(2, 2, 2), 0.01);
    }

    @Test
    public void testTriangleArea_4() {
        assertEquals(-1, HumanEval_71.triangleArea(1, 2, 3), 0.01);
    }

    @Test
    public void testTriangleArea_5() {
        assertEquals(16.25, HumanEval_71.triangleArea(10, 5, 7), 0.01);
    }

    @Test
    public void testTriangleArea_6() {
        assertEquals(-1, HumanEval_71.triangleArea(2, 6, 3), 0.01);
    }

    @Test
    public void testTriangleArea_7() {
        assertEquals(0.43, HumanEval_71.triangleArea(1, 1, 1), 0.01);
    }

    @Test
    public void testTriangleArea_8() {
        assertEquals(-1, HumanEval_71.triangleArea(2, 2, 10), 0.01);
    }

    @Test
    public void testTriangleArea_9() {
        assertEquals(29.93, HumanEval_71.triangleArea(8, 9, 15), 0.01);
    }

    @Test
    public void testTriangleArea_10() {
        assertEquals(-1, HumanEval_71.triangleArea(8, 9, 17), 0.01);
    }

    @Test
    public void testTriangleArea_11() {
        assertEquals(59.81, HumanEval_71.triangleArea(10, 12, 15), 0.01);
    }

    @Test
    public void testTriangleArea_12() {
        assertEquals(-1, HumanEval_71.triangleArea(8, 9, 1), 0.01);
    }

    @Test
    public void testTriangleArea_13() {
        assertEquals(-1, HumanEval_71.triangleArea(10, 5, 5), 0.01);
    }

    @Test
    public void testTriangleArea_14() {
        assertEquals(21.22, HumanEval_71.triangleArea(7, 7, 7), 0.01);
    }

    @Test
    public void testTriangleArea_15() {
        assertEquals(-1, HumanEval_71.triangleArea(2, 9, 2), 0.01);
    }
}
// End of Test
