package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.example.HumanEval_121;

public class HumanEval_121Test {
    @Test
    public void test_0() {
        assertEquals(12, HumanEval_121.solution(new int[]{5, 8, 7, 1}));
    }

    @Test
    public void test_1() {
        assertEquals(9, HumanEval_121.solution(new int[]{3, 3, 3, 3, 3}));
    }

    @Test
    public void test_2() {
        assertEquals(0, HumanEval_121.solution(new int[]{30, 13, 24, 321}));
    }

    @Test
    public void test_3() {
        assertEquals(5, HumanEval_121.solution(new int[]{5, 9}));
    }

    @Test
    public void test_4() {
        assertEquals(0, HumanEval_121.solution(new int[]{2, 4, 8}));
    }

    @Test
    public void test_5() {
        assertEquals(23, HumanEval_121.solution(new int[]{30, 13, 23, 32}));
    }

    @Test
    public void test_6() {
        assertEquals(3, HumanEval_121.solution(new int[]{3, 13, 2, 9}));
    }

    @Test
    public void test_7() {
        assertEquals(9, HumanEval_121.solution(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void test_8() {
        assertEquals(6, HumanEval_121.solution(new int[]{1, 3, 5, 7}));
    }

    @Test
    public void test_9() {
        assertEquals(37, HumanEval_121.solution(new int[]{3, 3, 3, 4, 4, 6, 9, 3, 12, 8, 11, 10, 8, 9, 11}));
    }

    @Test
    public void test_10() {
        assertEquals(7, HumanEval_121.solution(new int[]{7}));
    }
}
//End of Test
