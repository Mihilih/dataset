package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_127Test {
    
    @Test
    public void testIntersection1() {
        assertEquals("NO", HumanEval_127.intersection(new int[]{1, 2}, new int[]{2, 3}));
    }

    @Test
    public void testIntersection2() {
        assertEquals("NO", HumanEval_127.intersection(new int[]{-1, 1}, new int[]{0, 4}));
    }

    @Test
    public void testIntersection3() {
        assertEquals("YES", HumanEval_127.intersection(new int[]{-3, -1}, new int[]{-5, 5}));
    }

    @Test
    public void testIntersection4() {
        assertEquals("YES", HumanEval_127.intersection(new int[]{-2, 2}, new int[]{-4, 0}));
    }

    @Test
    public void testIntersection5() {
        assertEquals("NO", HumanEval_127.intersection(new int[]{-11, 2}, new int[]{-1, -1}));
    }

    @Test
    public void testIntersection6() {
        assertEquals("NO", HumanEval_127.intersection(new int[]{1, 2}, new int[]{3, 5}));
    }

    @Test
    public void testIntersection7() {
        assertEquals("NO", HumanEval_127.intersection(new int[]{1, 2}, new int[]{1, 2}));
    }

    @Test
    public void testIntersection8() {
        assertEquals("NO", HumanEval_127.intersection(new int[]{-2, -2}, new int[]{-3, -2}));
    }

    @Test
    public void testIntersection9() {
        assertEquals("YES", HumanEval_127.intersection(new int[]{10, 20}, new int[]{15, 25}));
    }

    @Test
    public void testIntersection10() {
        assertEquals("YES", HumanEval_127.intersection(new int[]{5, 10}, new int[]{1, 7}));
    }

    @Test
    public void testIntersection11() {
        assertEquals("NO", HumanEval_127.intersection(new int[]{-6, -2}, new int[]{-6, -2}));
    }

    @Test
    public void testIntersection12() {
        assertEquals("YES", HumanEval_127.intersection(new int[]{0, 100000007}, new int[]{0, 100000007}));
    }

    @Test
    public void testIntersection13() {
        assertEquals("NO", HumanEval_127.intersection(new int[]{0, 1}, new int[]{0, 1}));
    }

    @Test
    public void testIntersection14() {
        assertEquals("YES", HumanEval_127.intersection(new int[]{-10, 1}, new int[]{-10, 1}));
    }

    @Test
    public void testIntersection15() {
        assertEquals("NO", HumanEval_127.intersection(new int[]{-15, 20}, new int[]{-15, 20}));
    }

    @Test
    public void testIntersection16() {
        assertEquals("YES", HumanEval_127.intersection(new int[]{-9, 1000000001}, new int[]{-999999999, 1000000000}));
    }

    @Test
    public void testIntersection17() {
        assertEquals("NO", HumanEval_127.intersection(new int[]{11, 11}, new int[]{11, 11}));
    }
}
// End of Test
